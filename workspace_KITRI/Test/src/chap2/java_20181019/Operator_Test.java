package chap2.java_20181019;

/*1.
3�ڸ� ���� 
int sample = 999;

����� ��� :900*/
public class Operator_Test {
	public static void main(String[] args) {
		
		int a ;
		int end;
		int ran = (int) (Math.round((Math.random()*899))+100);
		a= ran;
		System.out.println(ran);
		
		end = a/100;
		System.out.println(end*100);

	
	}
	
}
