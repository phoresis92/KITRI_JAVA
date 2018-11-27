package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
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
	String sql = 
			//"insert into ���̺��(�÷���,,,,) values(��,,,)";
"insert into employees"
+ "(employee_id, last_name, email, hire_date, job_id) "
+ "values(4000, '��', 'kim@a.com', sysdate, 'IT_PROG')";
	//3-2. con ���� db�� ���� sql ���� ��ü
	Statement st = con.createStatement();
	//3-3. sql ���� ����(�����û)
	int rowcount = st.executeUpdate(sql);
	
	//4. sql ����˻�
	System.out.println("�������� ���� = "+rowcount);
	
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
