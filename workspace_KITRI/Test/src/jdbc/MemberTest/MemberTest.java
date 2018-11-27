package jdbc.MemberTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class MemberTest {
	
	public int insertMember(MemberVO vo) {
		int rowcount = 0;
		Connection con = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("����̹� �ε� �Ϸ�");
		
		con = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		System.out.println("���Ἲ��");
		
		String sql = "insert into member(userid,password,name,address,gender,indate,phone,email)" + 
				" values(?,?,?,?,?,default,?,null)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getUserid());
		ps.setString(2, vo.getPassword());
		ps.setString(3, vo.getName());
		ps.setString(4, vo.getAddress());
		ps.setString(5, vo.getGender());
		ps.setString(6, vo.getPhone());
		
		rowcount = ps.executeUpdate();
		
		
		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("��������Ȯ��!!!");
			System.out.println(e.getMessage());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {  }
			System.out.println("������������");
		}
		return rowcount;
	}
	
	public int updateMember(String id,String item,String value) {
		int rowcount = 0;
		Connection con = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("����̹� �ε� �Ϸ�");
		
		con = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		System.out.println("���Ἲ��");
		
		String sql = "update member" + 
				" set "+item+" = ?" + 
				" where userid = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, value);
		ps.setString(2, id);
		
		rowcount = ps.executeUpdate();
		
		
		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("��������Ȯ��!!!");
			System.out.println(e.getMessage());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {  }
			System.out.println("������������");
		}
		return rowcount;
	}
	
	
	public ArrayList<MemberVO> selectMember(String condition) {
		int rowcount = 0;
		Connection con = null;
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		ResultSet rs = null;
		
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("����̹� �ε� �Ϸ�");
		
		con = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		System.out.println("���Ἲ��");
		
		
		String[] sp = condition.split("-");
		
		String item = sp[0];
		String value = sp[1];
		
		
		String sql = "select * from member where "+item+" like '%"+value+"%'";
		
		Statement ps = con.createStatement();
		rs = ps.executeQuery(sql);
		
		
		int cnt = 0;
		while(rs.next()) {
			String id =rs.getString("userid");
			String name = rs.getString("name");
			String address = rs.getString("address");
			String gender = rs.getString("gender");
			String indate = rs.getString("indate");
			String phone = rs.getString("phone");
			String email = rs.getString("email");
			
			MemberVO m = new MemberVO(id,"",name,address,gender,phone);
			m.setEmail(email);
			m.setIndate(indate);
			/*this.userid = userid;
			this.password = password;
			this.name = name;
			this.address = address;
			this.gender = gender;
			this.phone = phone;*/
			
			list.add(m);
			cnt++;
		}
		//id-name-address-gender-phone-email-indate
		System.out.println(cnt+" rows selected.");
		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("��������Ȯ��!!!");
			System.out.println(e.getMessage());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {  }
			System.out.println("������������");
		}
		return list;
	}
	
	public ArrayList<MemberVO> selectMember(int pagenum) {
		int rowcount = 0;
		Connection con = null;
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		ResultSet rs = null;
		
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("����̹� �ε� �Ϸ�");
		
		con = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		System.out.println("���Ἲ��");
		
		
		int page = 2;
		
		int start = (pagenum-1)*page+1;
		int end = pagenum*page;
		
		String sql = "select *" + 
				" from(select rownum r, intable.*" + 
				" from(select userid, name, address,gender, to_char(indate, 'yy-mm-dd : hh-mi-ss') indate , phone, email from member" + 
				" order by indate desc) intable)" + 
				" where r>="+ start +" and r<="+end;
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		
		rs = ps.executeQuery();
		
		
		int cnt = 0;
		while(rs.next()) {
			String id =rs.getString("userid");
			String name = rs.getString("name");
			String address = rs.getString("address");
			String gender = rs.getString("gender");
			String indate = rs.getString("indate");
			String phone = rs.getString("phone");
			String email = rs.getString("email");
			
			MemberVO m = new MemberVO(id,"",name,address,gender,phone);
			m.setEmail(email);
			m.setIndate(indate);
			/*this.userid = userid;
			this.password = password;
			this.name = name;
			this.address = address;
			this.gender = gender;
			this.phone = phone;*/
			
			list.add(m);
			cnt++;
		}
		//id-name-address-gender-phone-email-indate
		System.out.println(cnt+" rows selected.");
		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("��������Ȯ��!!!");
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {  }
			System.out.println("������������");
		}
		return list;
	}
	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	while(true) {
	System.out.println("1.ȸ������");
	System.out.println("2.��������");
	System.out.println("3.���ǰ˻�");
	System.out.println("4.�������˻�");
	System.out.println("9.����");
	System.out.print("��ȣ �Է�: ");
	
	int num = 0;
	try {
	num = sc.nextInt();
	sc.nextLine();
	}catch(Exception e) {
		
	}
	if(num == 1) {
		System.out.println("ȸ������������ �Է��ϼ���");
		System.out.print("���̵�: ");
		String userid = sc.nextLine();
		System.out.print("��й�ȣ: ");
		String password = sc.nextLine();
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("�ּ�: ");
		String address = sc.nextLine();
		System.out.print("����: ");
		String gender = sc.nextLine();
		System.out.print("����ó: ");
		String phone = sc.nextLine();
		MemberVO vo = new MemberVO(userid, password, name, address, gender, phone);
		MemberTest mt = new MemberTest();
		int result = mt.insertMember(vo);
		System.out.println(result+" rows inserted.");
	}else if(num ==2) {
		System.out.print("������ id �Է�: ");
		String id = sc.nextLine();
		System.out.print("������ �׸�� �Է�: ");
		String item = sc.nextLine();
		System.out.print("������ �� �Է�: ");
		String value = sc.nextLine();
		MemberTest mt = new MemberTest();
		int rowcnt = mt.updateMember(id, item, value);
		System.out.println(rowcnt+"�� �� ����");
	}else if(num ==3) {
		System.out.println("�˻� �÷���� �� �Է��ϼ���(�÷���-��)");
		String condition = sc.nextLine();
		MemberTest mt = new MemberTest();
		ArrayList<MemberVO> list = mt.selectMember(condition);
		for(MemberVO member : list) {
			System.out.println(member);
			//id-name-address-gender-phone-email-indate
		}
		
	}else if(num ==4) {
		
		System.out.println("�� �������� 5���� ��������Ʈ�� ����մϴ�.");
		System.out.println("��������ȣ �Է�.");
		int pagenum = sc.nextInt();
		sc.nextLine();
		
		MemberTest mt = new MemberTest();
		ArrayList<MemberVO> list = mt.selectMember(pagenum);
		//1 ���Գ�¥ ���� ���� rownum 1-5
		//2 6-10
		
		if(list.size() == 0) {
			System.out.println("����� ����Ʈ�� �����ϴ�.");
		}
		
		for(MemberVO member : list) {
			System.out.println(member);
		}
		
	}else if(num ==9) {
		System.exit(0);
	}else {
		System.out.println("�߸��� ��ȣ�Է�");
		System.exit(0);
	}
	
	
	}//while end
	
}//main end

	public static boolean isint(String obj) {
		try {
			Integer.parseInt(obj);
			return true;
		}catch(Exception e) {
			return false;
		}
	}


}
