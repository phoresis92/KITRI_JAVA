package chap4.java_20181022;

/*5
*
**
***
****
******/
public class Asterisk {

	public static void main(String[] args) {

		int ran = (int) (Math.random() * 10) + 1;

		System.out.print(ran);
		System.out.println();

		int i = 1;
		int j = 0;

		for (i = 1; i <= ran; i++) { //�� �ݺ�
			
			for (j = 0; j != j; j++) { //���� ��ȣ��ŭ(=i������ŭ) �� ���
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
