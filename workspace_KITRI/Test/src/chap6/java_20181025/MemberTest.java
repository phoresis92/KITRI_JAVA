package chap6.java_20181025;

class Member3{
	String id;
	int pw;
	String name;
	int age;
	void insert
	(String id, int pw, String name,int age) {
		this.id  = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		System.out.println("���̵� : " + this.id);
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		System.out.println("���� �Ϸ�Ǿ����ϴ�.");
	}
	void login(String id, int pw) {
		if(this.id.equals(id)) {
			if(this.pw == pw) {
				System.out.println("�α��εǾ����ϴ�.");
			}//inner if
			else {
				System.out.println("��ȣã�� ȭ�� �̵��մϴ�.");
			}
		}//outer if
		else {
			System.out.println("���̵�ã�� ȭ�� �̵��մϴ�");
		}
	}//login 
	boolean updateInform(int newPw){
		if(this.pw == newPw) {
			return false;
		}
		else {
			this.pw = newPw;
			return true;
		}
	}
	void readPw() {
		System.out.println(this.pw);
	}
	void logout() {
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	}
}
class MemberTest{
public static void main(String args[]){
	 Member3 mem3 = new Member3();
	 mem3.insert("test", 1234, "���ڹ�", 25);
	 mem3.login("test1", 1234);
	 mem3.login("test", 1234);
	 //1234 -> 1111 ����
	 boolean up = mem3.updateInform(1111);
	 if(up == true) mem3.readPw();
	 // 1111 -> 1111 x
	 up = mem3.updateInform(1111);
	 if(up == true) mem3.readPw();
	 mem3.logout();

}
}
