package jdbc_20181109;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionTest {
public static void main(String[] args) {
	Connection con = null;
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("����̹� �ε� �Ϸ�");
	
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println("con ���Ἲ��");
	
	
	
	con.setAutoCommit(false);
	System.out.println(con.getAutoCommit());
	
	String sql = "update account" + 
			" set balance = balance - ?" + 
			" where id = '456-123'";
	
	
	PreparedStatement pr = con.prepareStatement(sql);
	pr.setInt(1, 1000);
	pr.executeUpdate();
	
	sql = "update accoun" + 
			" set balance = balance + ?" + 
			" where id = '123-456'";
	
	
	PreparedStatement pr2 = con.prepareStatement(sql);
	pr2.setInt(1, 1000);
	pr2.executeUpdate();
	
	
	con.commit();
	System.out.println("������ü �Ϸ�");
	
	
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		System.out.println("��������Ȯ��!!!");
		System.out.println(e.getMessage());
		
		try {
			con.rollback();
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}finally {
		try {
			con.close(); 
		} catch (SQLException e) {  }
		System.out.println("������������");
	}
	
}
}
