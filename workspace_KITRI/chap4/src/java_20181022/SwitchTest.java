package java_20181022;

public class SwitchTest {

	public static void main(String[] args) {
		int mine = (int)(Math.random()*6)+1;
		
		switch(mine) {
			case 1 :
				System.out.println("1����");
				break;
			case 2 :
				System.out.println("2����");
				break;
			case 3:
				System.out.println("3����");
				break;
			case 4 :
				System.out.println("4����");
				break;
			case 5 :
				System.out.println("5����");
				break;
			default :
				System.out.println("6����");
		}
		
		switch(mine) { // 1,3,5 : Ȧ������ ���Խ��ϴ�.
			case 1 :
				
			case 3:
				
			case 5 :
				System.out.println("Ȧ��");
				break;
			case 2 :
				
			case 4 :
				 
			default :
				System.out.println("¦��");
		}
		
	
	}
}
