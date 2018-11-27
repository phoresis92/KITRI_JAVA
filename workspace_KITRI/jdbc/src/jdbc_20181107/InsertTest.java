package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
public static void main(String[] args) {
	//ojdbc6.jar 내에 포함된 클래스
	Connection con = null;
	try {
		//1. jdbc driver 로딩 명령
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("드라이버 로딩 완료");
	
	//2. db 연결 (자바 클라이언트 - db서버)
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println("연결성공");
	
	//3. sql 전송
	//3-1. sql 정의
	String sql = 
			//"insert into 테이블명(컬럼명,,,,) values(값,,,)";
"insert into employees"
+ "(employee_id, last_name, email, hire_date, job_id) "
+ "values(4000, '김', 'kim@a.com', sysdate, 'IT_PROG')";
	//3-2. con 연결 db로 전송 sql 저장 객체
	Statement st = con.createStatement();
	//3-3. sql 연결 전송(실행요청)
	int rowcount = st.executeUpdate(sql);
	
	//4. sql 결과검색
	System.out.println("삽입행의 갯수 = "+rowcount);
	
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		System.out.println("연결정보확인!!!");
		System.out.println(e.getMessage());
	}finally {
		//예외발생 - try중단 - catch이동
		//5. 연결해제, 파일 close 소켓 close
		try {
			con.close(); //상황에 따른 문제 / 자바의 문제가 아니다
		} catch (SQLException e) {  }
		System.out.println("연결해제성공");
	}
	
}
}
