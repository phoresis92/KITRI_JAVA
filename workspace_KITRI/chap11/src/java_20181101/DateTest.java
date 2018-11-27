package java_20181101;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {
	public static void main(String[] args) {
		//�����ڳ� �޼ҵ� : deprecated ���� : ����� ���ѱǰ�
		/*Date d1 = new Date();
		Date d2 = new Date(999999999999L);
		Date d3 = new Date(2018,10,1,12,12,12);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1.getTime());*/
		
		//Calendar cal = new Calendar(); 
		//=> �����ڰ� private(�ٸ� Ŭ�������� ������ ȣ��x)
		Calendar cal = Calendar.getInstance();
		//=>public static �޼ҵ� : ������ ȣ�� .getInstance()
		System.out.println(cal);
		/*java.util.GregorianCalendar
		[time=1541037178451,areFieldsSet=true,areAllFieldsSet=true,
		lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
		offset=32400000,dstSavings=0,useDaylight=false,transitions=22,
		lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
		YEAR=2018,MONTH=10,WEEK_OF_YEAR=44,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,
		DAY_OF_YEAR=305,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,
		HOUR=10,HOUR_OF_DAY=10,MINUTE=52,SECOND=58,MILLISECOND=451,
		ZONE_OFFSET=32400000,DST_OFFSET=0]*/
		
		int year =cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //10 11���̳� 0���� ����
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(
				"������ "+year+"�⵵"+month+"��"+day+"��"
						+hour+"��"+min+"��"+second+"�� �Դϴ�.");
		
		cal.set(Calendar.DAY_OF_MONTH, day+7);
		year =cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1; //10 11���̳� 0���� ����
		day = cal.get(Calendar.DAY_OF_MONTH);
		hour = cal.get(Calendar.HOUR_OF_DAY);
		min = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
		System.out.println(
				"������ "+year+"�⵵"+month+"��"+day+"��"
						+hour+"��"+min+"��"+second+"�� �Դϴ�.");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		String date = sdf.format(cal.getTime());
		System.out.println(date);
	
		DecimalFormat df = new DecimalFormat("#.##");
		double d = 1234.56789;
		String sd = df.format(d);
		System.out.println(sd);
	}
}
