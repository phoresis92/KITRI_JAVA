package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePreparedTest2 {
public static void main(String[] args) {
	Connection con = null;
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("����̹� �ε� �Ϸ�");
	
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println("���Ἲ��");
	
	/*PreparedStatement �̿�
	Ű���� �Է� : kelly
	first_name kelly �� ����� ���� �Ի���� �Ի���
	����� �޿��� 10% �λ�*/
	
	/*update employees
	set salary = salary*1
	where to_char(hire_date, 'mm') =
	(select to_char(hire_date, 'mm')
	from employees
	where first_name = 'Kelly'));*/
	
	Scanner sc = new Scanner(System.in);
	
	String name = sc.nextLine();

	String sql = 
			
"update employees set salary = salary*1	where to_char(hire_date, 'mm') ="
+ " (select to_char(hire_date, 'mm')"
+ " from employees where first_name = initcap(?))";

	PreparedStatement st = con.prepareStatement(sql);
	st.setString(1, name);
	int rowcount = st.executeUpdate();
	
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
