package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
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
	
	String sql = "delete employees where employee_id = 4001";
	
	Statement st = con.createStatement();
	int result = st.executeUpdate(sql);
	
	//4. sql ����˻�
	
	System.out.println("���泻�� = "+result);
	
	
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
