package chap12.java_20181101;

public class LoginClient extends Thread {
	
	String id;
	String pw;
	
	LoginClient(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	public void run() {
		System.out.println("�α��� ���̵�"+id+"�� �Է¹޽��ϴ�.");
		if(id.equals("java")) {
			System.out.println("�α��� ��ȣ�� Ȯ���մϴ�");
			if(pw.equals("java")) {
				System.out.println("�α��ξ�ȣ �½��ϴ�");
			}else System.out.println("�α��ξ�ȣ �ùٸ��� �ʽ��ϴ�");
		}else System.out.println("�α��� ���̵� �ùٸ��� �ʽ��ϴ�");
	}

}//class end
