package java_20181019;

public class Operator_Test {

	public static void main(String[] args) {
		int first = 100;
		int second = 200;
		System.out.println("first=" + first + "second=" + second);

		int result1 = first++;
		int result2 = --second;
		System.out.println("first=" + first + "second=" + second + " , result1=" + result1 + " , result2=" + result2);

		int third = 6;
		// third �� 5�� ����̸� : true/false
		boolean five = third % 5 == 0;
		System.out.println("5�� �������  = " + five);

		// third ������ 3�� ����̸鼭 4�� ����� �ƴϾ����
		boolean tf = third % 3 == 0 && third % 4 != 0;
		System.out.println("3����� 4�� ��� �ƴ��� ���� = " + tf);

		int a = 10;
		int b = 20;
		int c = a;
		a = b;
		b = c;
		System.out.println("a" + a + "," + "b" + b);

		int x = 15;
		String result = x > 10 ? "ũ��" : "�۴�";
		System.out.println(result);
		int res = x >= 10 && x < 50 ? (int) 1.1 : 0;
		System.out.println(res);

		// 95 ���� 4�� ����̸鼭 7�� ��� ���� �Ǵ� 4-7�� �������:
		// �������� ������ : ��� �ƴմϴ�.

		int val = 95;

		String fse = val % 4 == 0 && val % 7 == 0 ? "4-7�� �������" : "��� �ƴմϴ�";
		System.out.println(fse);
		
		System.out.println(val +=2);

	}

}
