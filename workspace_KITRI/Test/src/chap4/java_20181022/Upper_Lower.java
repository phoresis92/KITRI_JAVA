package chap4.java_20181022;

public class Upper_Lower {

	public static void main(String[] args) {
		
		/*System.out.println((int)'A'); //65
		System.out.println((int)'Z'); //90

		System.out.println((int)'a'); //97
		System.out.println((int)'z'); //122
*/		
		/*���� �߻���(1-200 ����)
		���ѹݺ�
		65-90���̸� (�빮���̸�)
		���� : 65 : 'A'�� 'a'�� �����մϴ�.
		���� : 66 : 'B'�� 'b'�� �����մϴ�.
		97-122���̸� (�ҹ����̸�)
		���� : 97 : 'a'�� 'A'�� �����մϴ�.
		���� : 98 : 'b'�� 'B'�� �����մϴ�.
		�������� 32
		���� 1-50 �̰ų� 150-200���� �߻��� ����*/
		
		
		
		
		
		while(true){
			//1.���� �߻���(1-200 ����)
			int ran = (int)(Math.random()*200)+1;
			System.out.println(ran);
			
			//2.65-90���̸� (�빮���̸�)
			//��)   65 ��� : 'A'�� 'a'�� �����մϴ� ���
			if(ran >=65 && ran <=90){
				char c1 = (char)ran; //�빮��
				char c2 = (char)(ran+32); //�ҹ���
				System.out.println(c1+"�� "+c2+"�� �����մϴ�.");
			
			//3.97-122���̸� (�ҹ����̸�)
			//��)  97 �̶�� : 'a'�� 'A'�� �����մϴ� ���
			
			}else if(ran>=97 && ran<=122) {
					char c1 = (char)ran;
					char c2 = (char)(ran-32);
					System.out.println(c1+"�� "+c2+"�� �����մϴ�.");
			
			//4. 1-50 �̰ų� 150-200 ���̸� ����
			
			}else if((ran>=1 && ran<=50) ||
			(ran>=150 && ran<=200))	break;
		}
}
}


