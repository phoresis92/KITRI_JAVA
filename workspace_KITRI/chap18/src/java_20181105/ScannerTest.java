package java_20181105;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		//System.out.println("�Է��� �����ϼ���");
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("���� 2���� �Է��ϸ� ��������� ����մϴ�.");
		if(sc.hasNextInt()) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			System.out.println(first+second);
		}
		sc.nextLine(); // 100 200 ����Ű!!!
		
		System.out.println("�ѱ۹��ڿ��� �Է��ϼ���.");
		
		String third = sc.nextLine();
		System.out.println(third);*/
		
		System.out.println("=== ����Ʈ�޴� ===");
		System.out.println("1. �Խ���");
		System.out.println("2. ȸ������");
		System.out.println("3. ��ٱ���");
		System.out.println(" quit �Է½� �����մϴ�.");
		//1,2,3,quit
		
		
		while(sc.hasNext()) { //�Է��� ������ ���ڿ��� ��ȯ�����ϳ�
			String menu = sc.next();
			System.out.println(menu);
			sc.nextLine();
			if(menu.equals("1")/*49==1*/) {
				System.out.println("�Խ��� �����ϼ̽��ϴ�.");
			}else if(menu.equals("2")) {
				System.out.println("ȸ������ �����ϼ̽��ϴ�.");
			}else if(menu.equals("3")) {
				System.out.println("��ٱ��� �����ϼ̽��ϴ�.");
			}else if(menu.equalsIgnoreCase("quit")) {
				System.out.println("�����մϴ�.");
				break;
				//System.exit(0); // return; // break;
			}
			
		}
		
		System.out.write(13);
		System.out.write(97); //'a'
		System.out.println('a');
		
		
		
		
		
		
		
		
		
		
		
	}//main end

}//class end
