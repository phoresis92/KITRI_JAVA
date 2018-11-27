package network_20181106;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
public static void main(String[] args) throws IOException {
		
	//1. Ŭ���̾�Ʈ ���� ��û
	//���� : ���� ������ ip, port �ο��ϰ� ���� �õ�
	Socket s = new Socket("192.168.15.99", 50001);
	System.out.println("Ŭ���̾�Ʈ ���� ��û");
	
	
	
	
	// ������û - ����ó�� - ���� ��� ����
	//3.���� �������� ��û(=���)
	//"Hello ����" ���ڿ� ���� = ������ ���
	//3-1. ������°�ü ����
	OutputStream os = s.getOutputStream();
	//3-2. ������� ���ڿ� ����
	String toServer = "Hello ����";
	//3-3. ����Ʈ�迭 ����
	byte[] b = toServer.getBytes();
	//3-4. ������°�ü ����Ʈ�迭 ����
	os.write(b);
	System.out.println("Ŭ���̾�Ʈ�� ���(������ ����)");
	
	
	
	
	
	
	
	
	//6. �����κ��� ���� ����(=�Է�)
	//6-1. �����Է°�ü ����
	InputStream is = s.getInputStream();
	//6-2. �Է¹��� ������ ����� ����Ʈ�迭 ����
	byte b2[] = new byte[100];
	//6-3. �Է¹޾Ƽ� b�迭 ���� , cnt �Է°���
	int cnt = is.read(b2);//
	//6-4. String.getBytes(); => String ��ȯ
	String input = new String(b2, 0 , cnt);
	System.out.println("Ŭ���̾�Ʈ �Է�(���� ���) = "+input);
	
	
	
	

	
	
	//8. ������ ���� ��û Ŭ���̾�Ʈ�� ��������
	s.close();
	System.out.println("Ŭ���̾�Ʈ ���� ����");
	
}//main end
}
