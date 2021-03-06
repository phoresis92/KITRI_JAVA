package network_20181106;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient2 {
	public static void main(String[] args) throws IOException {
//1. 시작:접속 서버의 ip,port  부여하고 접속 시도
		Socket s = new Socket("183.101.196.162", 50001);
		System.out.println("클라이언트 접속 요청");
//2. "hello 서버" 문자열 전송=서버로 출력
		// 2-1. 서버로출력객체 생성
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);// 보조

		// 2-2. 서버출력문자열 생성
		/*
		 * 클라이언트 프로그램(TCPMenuClient.java): 키보드 입력 : 로그인 / 회원가입 / 게시물작성/quit 반복 : quit 중단
		 * / 서버 출력
		 */
		Scanner sc = new Scanner(System.in);

		while (true) {
			String toServer = sc.nextLine();
			if (toServer.equals("quit"))
				break;
			pw.println(toServer);// 라인구분자 버퍼
			pw.flush();// 버퍼 저장 서버로 전송
			System.out.println("클라이언트가 출력(서버로 전송)" + toServer);
		}
		InputStream is = s.getInputStream();
		Scanner sis = new Scanner(is);
		/*
		 * 서버 프로그램(TCPMenuServer.java): 반복 : hr 아이디 로그인완료 java 아이디 가입완료 제목 내용 작성자 필수
		 * quit : ??? 클라이언트로 출력
		 */

//3. 서버로부터 입력
		// 2-1.소켓입력객체 생성
		String input = sis.nextLine();
		System.out.println("서버가 출력(클라이언트에서 입력) = " + input);
//4. 서버가 접속 요청 클라이언트와 해제
		sis.close();
		sc.close();
		pw.close();
		s.close();
		System.out.println("클라이언트 접속 해제");

	}
}
