package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
public static void main(String[] args) {
	//ojdbc6.jar ���� ���Ե� Ŭ����
	Connection con = null;
	try {
		//1. jdbc driver �ε� ���
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("����̹� �ε� �Ϸ�");
	
	for(int i = 1 ; i <=100; i++) {
	
	//2. db ���� (�ڹ� Ŭ���̾�Ʈ - db����)
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println(i+"��°  con ���Ἲ��");
	}
	//3. sql ����
	
	
	
	//4. sql ����˻�
	
	
	
	
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
