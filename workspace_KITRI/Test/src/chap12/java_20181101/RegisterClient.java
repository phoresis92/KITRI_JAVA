package chap12.java_20181101;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RegisterClient extends Thread {
	
	Date d;
	
	RegisterClient(Date d){
		this.d = d;
	}
	
	public void run() {
		
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�⵵ MM�� dd��");
		String sdfdate = sdf.format(cal.getTime());
		
		System.out.println(sdfdate+"�� ȸ������ ��û�մϴ�");
		System.out.println("ȸ������ ��û���Դϴ�");
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ȸ�����Կ�û ó���Ϸ��Դϴ�");
	}
	

}
