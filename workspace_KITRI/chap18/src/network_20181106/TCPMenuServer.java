package network_20181106;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPMenuServer {
public static void main(String[] args) throws IOException {
	//(���� : port ���� : ���� ����)
	ServerSocket ss = new ServerSocket(50001);
	System.out.println("������ 50001 ��Ʈ���� �����");
	
	//2. ���Ӽ���(����͸� , ������ ����)
	//��Ʈ��ũ �糡�� ���� ����
	while(true) {
		Socket s = ss.accept();
		InetSocketAddress clientip = 
				(InetSocketAddress)s.getRemoteSocketAddress();
		System.out.println(clientip.getHostName()+"Ŭ���̾�Ʈ ���� ���");
		
		
		
		
		
		
		InputStream is = s.getInputStream();
		//4-2. �Է¹��� ������ ����� ����Ʈ�迭 ����
		byte b[] = new byte[100];
		//4-3. �Է¹޾Ƽ� b�迭 ���� , cnt �Է°���
		int cnt = is.read(b);//
		//4-4. String.getBytes(); => String ��ȯ
		String input = new String(b, 0 , cnt);
		System.out.println("���� �Է�(Ŭ���̾�Ʈ���� ���) = "+input);
		
		
		//���� ���α׷� - hr���̵� �α��� �Ϸ�
					//java���̵� ���ԿϷ�
					//���� ���� �ۼ��� �ʼ�
		//Ŭ���̾�Ʈ�� ���
		
		OutputStream os = s.getOutputStream();
		String answer = "";
		switch(input){
			case "�α���" :
				answer = "hr ���̵� �α��� �Ϸ�";
				break;
			case "ȸ������" :
				answer = "java ���̵� ���ԿϷ�";
				break;
			case "�Խù��ۼ�" :
				answer = "���� ���� �ۼ��� �ʼ�";
				break;
			default :
				answer = "�ٽ� �Է��� �ּ���!";
				break;
		}
		
		
		byte[] b2 = answer.getBytes();
		os.write(b2);
		System.out.println("������ ���(Ŭ���̾�Ʈ�� ����)");
		
		
		
		
		
		//8. ������ ���� ��û Ŭ���̾�Ʈ�� ��������
		s.close();
		System.out.println("Ŭ���̾�Ʈ ���� ����");
	}//while end
	
//	ss.close(); //���� ��ü�� �����ع����� 
//	System.out.println("������ 50001 ��Ʈ���� ����");
	
	
}//main end
}
