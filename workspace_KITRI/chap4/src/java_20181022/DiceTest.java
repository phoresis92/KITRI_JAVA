package java_20181022;

public class DiceTest {
	public static void main(String[] args) {
		
		int mine = (int)(Math.random()*6)+1 ;
		int yours = (int)(Math.random()*6)+1;
		
		System.out.println("�� �ֻ��� �� = "+ mine);
		System.out.println("���� �ֻ��� �� = "+yours);
	
		if(mine> yours) {
			System.out.println("�����̱�");
			
		}else if (mine == yours) {
			System.out.println("���");
		}else {
			System.out.println("���� ��");
		}
		
		int ran = (int)(Math.random()*90)+10; // 0+10<double<90+10
		
		System.out.println(ran);
		
		
	}
	
}
