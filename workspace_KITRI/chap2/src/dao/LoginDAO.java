package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import view.MemberJoinView;
import vo.MemberVO;

public class LoginDAO {

	public MemberVO loginMember(String member_id, int pw) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

			String sql = "select member_seq, member_id, pw, member_name, phone, email from member where member_id = ?";
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1, member_id);

			ResultSet rs = pt.executeQuery();
			if (rs.next()) {
				if (pw == rs.getInt("pw")) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					MemberVO vo = new MemberVO(rs.getInt("member_seq"), rs.getString("member_id"), rs.getInt("pw"),
							rs.getString("member_name"), rs.getString("phone"), rs.getString("email"));
					return vo;

				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");

				}
			} else {
				System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}
		return null;

	}

	public void searchId(String member_name, String phone) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

			String sql = "select member_seq, member_id, pw, member_name, phone, email from member where member_name = ?";
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1, member_name);

			ResultSet rs = pt.executeQuery();
			if (rs.next()) {
				if (phone.equals(rs.getString("phone"))) {
					System.out.println("�̸��� ����ó�� ��ġ�մϴ�.");
					System.out.println("���̵�� " + rs.getString("member_id"));

				} else {
					System.out.println("����ó�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�������� �ʴ�  �̸��Դϴ�.");
				System.out.println("ȸ�������Ͻðڽ��ϱ�?");
				System.out.println("1. ��");
				System.out.println("2. �ƴϿ�");
				Scanner sc = new Scanner(System.in);
				int menu = sc.nextInt();
				if (menu == 1) {
					new MemberJoinView().input();
				} else if (menu == 2) {
					return;
				}

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}

	}

	public void searchPw(String member_id, String phone) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

			String sql = "select member_seq, member_id, pw, member_name, phone, email from member where member_id = ?";
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1, member_id);

			ResultSet rs = pt.executeQuery();
			if (rs.next()) {
				if (phone.equals(rs.getString("phone"))) {
					System.out.println("���̵�� ����ó�� ��ġ�մϴ�.");
					System.out.println("�н������ " + rs.getInt("pw"));

				} else {
					System.out.println("����ó�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}

	}

}
