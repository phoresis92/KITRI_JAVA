package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {
public static void main(String[] args) {
	//ojdbc6.jar ���� ���Ե� Ŭ����
	Connection con = null;
	try {
		//1. jdbc driver �ε� ���
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("����̹� �ε� �Ϸ�");
	
	//2. db ���� (�ڹ� Ŭ���̾�Ʈ - db����)
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println("���Ἲ��");
	
	//3. sql ����
	//3-1. sql ����
	//Ű�����Է� :  IT_PROG 80 4001
	
	Scanner sc = new Scanner(System.in);
	
	String toid = sc.next();
	String id = sc.next();

	String sql = 
			//"insert into ���̺��(�÷���,,,,) values(��,,,)";
/*
"update employees"
+" set job_id = '"+job+"',"
+" department_id = "+dept
+" where employee_id = "+id;*/
			
"update employees"
+" set (department_id , job_id, hire_date) in (select department_id , job_id, hire_date from employees where employee_id = )"+toid
+" where employee_id = "+id;

	//3-2. con ���� db�� ���� sql ���� ��ü
	Statement st = con.createStatement();
	//3-3. sql ���� ����(�����û)
	int rowcount = st.executeUpdate(sql);
	
	//4. sql ����˻�
	System.out.println("���������� ���� = "+rowcount);
	
	
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
