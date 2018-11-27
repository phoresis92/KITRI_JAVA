package view;

import java.util.Scanner;

import dao.LoginDAO;
import vo.MemberVO;

public class LoginView {
	public MemberVO input() {
		MemberVO vo = new MemberVO();
		System.out.println("1. �α���");
		System.out.println("2. ���̵� ã��");
		System.out.println("3. �н����� ã��");
		System.out.print("�޴����� : ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		if (menu == 1) {

			System.out.println("�α����� �����մϴ�.");
			System.out.print("���̵� �Է� : ");
			String member_id = sc.next();
			System.out.print("��й�ȣ �Է� : ");
			int pw = sc.nextInt();

			LoginDAO dao = new LoginDAO();
			vo = dao.loginMember(member_id, pw);
			return vo;

		} else if (menu == 2) {

			System.out.println("���̵� ã�⸦ �����մϴ�.");
			System.out.print("�̸� �Է� : ");
			String member_name = sc.next();
			System.out.print("����ó �Է� : ");
			String phone = sc.next();

			LoginDAO dao = new LoginDAO();
			dao.searchId(member_name, phone);

		} else if (menu == 3) {

			System.out.println("��й�ȣ ã�⸦ �����մϴ�.");
			System.out.print("���̵� �Է� : ");
			String member_id = sc.next();
			System.out.print("����ó �Է� : ");
			String phone = sc.next();

			LoginDAO dao = new LoginDAO();
			dao.searchPw(member_id, phone);

		}

		return null;

	}
}
