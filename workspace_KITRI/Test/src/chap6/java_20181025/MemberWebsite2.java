package chap6.java_20181025;

import java.util.Scanner;

class Member2 {

	Scanner sc = new Scanner(System.in);

	String id;
	private String pw;
	String name;
	int age;
	
	

	void wherego() {
		while (true) {
			
			System.out.println("=================================================");
			System.out.println("1.ȸ������:2.�α���:3.��������:4.������ȸ:5.�α׾ƿ�:6.����");
			System.out.println("------------------��ȣ���Է��ϼ���!------------------");
			System.out.println("=================================================");

			int where = sc.nextInt();
			switch (where) {
			case 1:
				signup();
				wherego();
			case 2:
				login();
				wherego();
			case 3:
				setInfo();
				break;
			case 4:
				getinfo();
				break;
			case 5:
				logOut();
				break;
			case 6:
				return; 
			default:
				System.out.println("�ٽ��Է����ּ���!");
				wherego();
			}
		}
	}

	void signup() {
		
		System.out.println("===ȸ�� ����===");
		this.id = sc.nextLine();
		System.out.println("���̵� �Է��Ͻÿ�");
		this.id = sc.nextLine();
		System.out.println("��й�ȣ�� �Է��Ͻÿ�");
		this.pw = sc.nextLine();
		System.out.println("�̸��� �Է��Ͻÿ�");
		this.name = sc.nextLine();
		System.out.println("���̸� �Է��Ͻÿ�");
		this.age = sc.nextInt();

		System.out.println("���̵�=" + id + "\n�̸�=" + name + "\n����=" + age);
		System.out.println("ȸ������ �Ϸ� �Ǿ����ϴ�.");
	}

	void login() {

			
			System.out.println("�α��� �� ���̵� �Է��ϼ���");
			String logid = sc.nextLine();

			System.out.println("��й�ȣ�� �Է��ϼ���");
			String logpw = sc.nextLine();

			if (id.equals(logid)) {
				if (pw.equals(logpw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					
				} else {
					System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
				}
			} else {
				System.out.println("��ϵ� ����ڰ� �����ϴ�.");
			}
		}

	void setInfo() {
	
		System.out.println("===��й�ȣ �缳��===");
		System.out.println("�α��� �� ���̵� �Է��ϼ���");
		String logid = sc.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String logpw = sc.nextLine();
		System.out.println("������ ��й�ȣ�� �Է��ϼ���");
		String logpw2 = sc.nextLine();
		System.out.println("������ ��й�ȣ�� �ѹ��� �Է��ϼ���");
		String logpw3 = sc.nextLine();

		if (this.id.equals(logid)) {
			if (this.pw.equals(logpw)) {
				if (logpw2.equals(logpw3)) {
					this.pw = logpw3;
					System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
					System.out.println(logpw2);
				} else {
					System.out.println("�ٲٽô� ��й�ȣ �Է°��� ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
			}
		} else {
			System.out.println("��ϵ� ����ڰ� �����ϴ�.");
		}
	}

	void getinfo() {
		System.out.println("===ȸ������ ��ȸ===");
		
		System.out.println("Ȯ�� �� ���̵� �Է��ϼ���");
		String logid = sc.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String logpw = sc.nextLine();
		if (this.id.equals(logid)) {
			if (this.pw.equals(logpw)) {
				System.out.println("���̵�=" + this.id + "\n�̸�=" + this.name + "\n����=" + this.age);
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("��ϵ� ����ڰ� �����ϴ�.");
		}
	}

	void logOut() {
		
		System.out.println("�α׾ƿ��Ͻðڽ��ϱ�?(Y/N)");
		String que = sc.nextLine();
		if (que.toUpperCase().equals("Y"))
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		else if (que.toUpperCase().equals("N"))
			System.out.println("�α����� �����մϴ�.");
		else
			System.out.println("Y/N ���� �Է��� �ּ���");
	}

}

public class MemberWebsite2 {

	public static void main(String[] args) {

		Member2 mem1 = new Member2();

		mem1.wherego();
	}
	
}
