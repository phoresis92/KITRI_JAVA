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
//1. ����:���� ������ ip,port  �ο��ϰ� ���� �õ�
		Socket s = new Socket("183.101.196.162", 50001);
		System.out.println("Ŭ���̾�Ʈ ���� ��û");
//2. "hello ����" ���ڿ� ����=������ ���
		// 2-1. ��������°�ü ����
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);// ����

		// 2-2. ������¹��ڿ� ����
		/*
		 * Ŭ���̾�Ʈ ���α׷�(TCPMenuClient.java): Ű���� �Է� : �α��� / ȸ������ / �Խù��ۼ�/quit �ݺ� : quit �ߴ�
		 * / ���� ���
		 */
		Scanner sc = new Scanner(System.in);

		while (true) {
			String toServer = sc.nextLine();
			if (toServer.equals("quit"))
				break;
			pw.println(toServer);// ���α����� ����
			pw.flush();// ���� ���� ������ ����
			System.out.println("Ŭ���̾�Ʈ�� ���(������ ����)" + toServer);
		}
		InputStream is = s.getInputStream();
		Scanner sis = new Scanner(is);
		/*
		 * ���� ���α׷�(TCPMenuServer.java): �ݺ� : hr ���̵� �α��οϷ� java ���̵� ���ԿϷ� ���� ���� �ۼ��� �ʼ�
		 * quit : ??? Ŭ���̾�Ʈ�� ���
		 */

//3. �����κ��� �Է�
		// 2-1.�����Է°�ü ����
		String input = sis.nextLine();
		System.out.println("������ ���(Ŭ���̾�Ʈ���� �Է�) = " + input);
//4. ������ ���� ��û Ŭ���̾�Ʈ�� ����
		sis.close();
		sc.close();
		pw.close();
		s.close();
		System.out.println("Ŭ���̾�Ʈ ���� ����");

	}
}