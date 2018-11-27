package jdbc_20181108;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
public static void main(String[] args) {
	Connection con = null;
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("����̹� �ε� �Ϸ�");
	
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println("���Ἲ��");
	//�����ڵ� => ���ø�
	String sql = "select department_id, department_name, nvl(to_char(manager_id),'����') manager_id, city" + 
			" from departments d , locations l" + 
			" where d.location_id =  l.location_id";
	
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	
	int cnt = 0;
	while(rs.next()) {
		int id = rs.getInt("department_id");
		String name = rs.getString("department_name");
		String manager = rs.getString("manager_id");
		String city = rs.getString("city");
	
		System.out.println
		(id+":"+name+":"+manager+":"+city);
		cnt++;
	}
	
	System.out.println(cnt+" rows selected.");
	
//===============================================================
	
	sql = "select count(*) from departments";
	//Statement st2 = con.createStatement();
	rs = st.executeQuery(sql);
	if(rs.next()){//ù��°
	System.out.println(rs.getInt("count(*)"));
	}
	rs.close();
	st.close();
	
	
	
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
	
}
}
