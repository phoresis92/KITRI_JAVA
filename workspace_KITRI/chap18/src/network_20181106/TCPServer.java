package network_20181106;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
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
		
		
		
		
		
		//4. Ŭ���̾�Ʈ�κ��� ���ڿ� �Է�
		//4-1. �����Է°�ü ����
		InputStream is = s.getInputStream();
		//4-2. �Է¹��� ������ ����� ����Ʈ�迭 ����
		byte b[] = new byte[100];
		//4-3. �Է¹޾Ƽ� b�迭 ���� , cnt �Է°���
		int cnt = is.read(b);//
		//4-4. String.getBytes(); => String ��ȯ
		String input = new String(b, 0 , cnt);
		System.out.println("���� �Է�(Ŭ���̾�Ʈ���� ���) = "+input);
		
		
		
		
		
		//5. ���� Ŭ���̾�Ʈ ����
		//Ŭ���̾�Ʈ���� ���� ���� Ȯ�� =���� ���
		//5-1. Ŭ���̾�Ʈ�� ��°�ü ����
		OutputStream os = s.getOutputStream();
		//5-2. ����Ʈ�迭 ����
		input += "(���۳���Ȯ��)";
		byte[] b2 = input.getBytes();
		//3-4. ������°�ü ����Ʈ�迭 ����
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
