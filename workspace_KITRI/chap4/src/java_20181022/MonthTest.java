package java_20181022;

public class MonthTest {
	//1-12 ���� ���� ����
	
	//switch - case �̿�
	//1���� 31�� ���� �ֽ��ϴ�.
	//2���� 28�� ���� �̝����ϴ�.
	//4���� 
	//1,3,5,7,8,10,12 : 31
	//4,6,9,11 : 30
	//2 :28
	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1;
	
		
		System.out.println(month);
		
		switch(month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�.");
				break;
				
			case 2 :
				System.out.println("2���� 28�ϱ��� �ֽ��ϴ�.");
				break;
			
			/*case 4 :
			case 6 :
			case 9 :
			case 11 :*/
			default :
				System.out.println(month+"���� 30�ϱ��� �ֽ��ϴ�.");
				break;
		}
		
		
		
		
	}
}
