package chap6.java_20181025;

class Member{
	String id;
	private String pw;
	String name;
	int age;
	
	
	void signup(String id, String pw, String name, int age) {
	System.out.println("���̵�, ��ȣ, �̸�, ���̸� �Է��Ͻÿ�");
	this.id = id;
	this.pw = pw;
	this.name = name;
	this.age = age;
	
	System.out.println("���̵�="+id+"\n�̸�="+name+"\n����="+age);
	System.out.println("ȸ������ �Ϸ� �Ǿ����ϴ�.");
	}
	
	void login(String id, String pw) {
		if(this.id.equals(id) && this.pw.equals(pw))
			System.out.println("�α��� �Ǿ����ϴ�.");
		else if(this.id.equals(id))
			System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
		else 
			System.out.println("��ϵ� ����ڰ� �����ϴ�.");
	}
	
	void setInfo(String id, String pw, String pw2, String pw3) {
		System.out.println("���̵�� ��й�ȣ�� �Է��Ͻð� \n������ ��й�ȣ�� �����ϰ� �ι� �Է����ּ���.");
		if(this.id.equals(id) && this.pw.equals(pw)) {
			if(pw2.equals(pw3)) {
				System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
				System.out.println(pw2);
			}else System.out.println("�ٲٽô� ��й�ȣ �Է°��� ���� �ʽ��ϴ�.");		
		}else if(this.id.equals(id))
			System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
	}
	
	void getinfo(String id, String pw) {
		System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
		if(this.id.equals(id) && this.pw.equals(pw))
			System.out.println("���̵�="+this.id+"\n�̸�="+this.name+"\n����="+this.age);
		else if (this.id.equals(id))
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		else System.out.println("��ϵ� ����ڰ� �����ϴ�.");
	}
	
	void logOut() {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
}

public class MemberWebsite {

	public static void main(String[] args) {
		
		Member mem1 = new Member();
		
		mem1.signup("test","t1234","���ڹ�",25);
		System.out.println("========================================");
		mem1.login("test", "t1234");
//		mem1.login("test1","t1234");
//		mem1.login("test","1");
		System.out.println("========================================");

		mem1.setInfo("test", "t1234", "1234", "1234");
		/*mem1.setInfo("test", "1234", "1234", "123");
		mem1.setInfo("test", "123", "123", "123");
		mem1.setInfo("t", "t", "t", "t");*/
		System.out.println("========================================");

		mem1.getinfo("test","1234");
		System.out.println("========================================");

		mem1.logOut();
	}
}
