package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertPreparedTest {
public static void main(String[] args) {
	//ojdbc6.jar ���� ���Ե� Ŭ����
	Connection con = null;
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("����̹� �ε� �Ϸ�");
	
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println("���Ἲ��");
	
	
	//Ű�����Է� : 4003 ȫ3 hong3@a.com IT_MAN 100
	
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	String name = sc.next();
	String email = sc.next();
	String job = sc.next();

	java.sql.Date now = 
		new java.sql.Date(new java.util.Date().getTime());
	
	String sql = 
"insert into employees"
+ " (employee_id, last_name, email, hire_date, job_id) "
+ " values(?,?,?,?,?)";

	
	PreparedStatement st = con.prepareStatement(sql);
	//sql �Է� �Ķ���Ͱ� ����
	st.setInt(1, id);
	st.setString(2, name);
	st.setString(3, email);
	st.setDate(4, now);
	st.setString(5, job);
	
	int rowcount = st.executeUpdate();
	
	System.out.println("�������� ���� = "+rowcount);
	
	
	sc.close();
	
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		System.out.println("��������Ȯ��!!!");
		System.out.println(e.getMessage());
	}finally {
		//���ܹ߻� - try�ߴ� - catch�̵�
		//5. ��������, ���� close ���� close
		try {
			con.close(); //��Ȳ�� ���� ���� / �ڹ��� ������ �ƴϴ�
		} catch (SQLException e) {  }
		System.out.println("������������");
	}
	
}
}
