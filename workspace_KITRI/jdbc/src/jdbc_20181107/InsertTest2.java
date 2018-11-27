package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest2 {
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
	//Ű�����Է� : 4001 ȫ hong@a.com IT_MAN 50
	
	Scanner sc = new Scanner(System.in);
	String id = sc.next();
	String name = sc.next();
	String email = sc.next();
	String job = sc.next();
	//����ð������������ִ�. .getTime() -> 1/1000��
	//����Ŭ db ��¥Ÿ�� ����(�ڵ� ����Ŭ ��¥���� ����)
	java.sql.Date now = 
		new java.sql.Date(new java.util.Date().getTime());
	String sql = 
			//"insert into ���̺��(�÷���,,,,) values(��,,,)";
"insert into employees"
+ "(employee_id, last_name, email, hire_date, job_id) "
+ "values("+id+", '"+name+"', '"+email+"', '"+now+"', '"+job+"')";
	//3-2. con ���� db�� ���� sql ���� ��ü
	Statement st = con.createStatement();
	//3-3. sql ���� ����(�����û)
	int rowcount = st.executeUpdate(sql);
	
	//4. sql ����˻�
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
