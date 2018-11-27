package java_20181019;

public class Nan_infinity {

	public static void main(String[] args) {

		/*
		 * System.out.println(10/0); // ArithmeticException: / by zero
		 * System.out.println(10/0.0); // Infinity 
		 * System.out.println(10%0.0); // NaN
		 */

		String is = Double.isInfinite(10 / 0.0) ? "����Ұ�" : "���갡��"; //

		String is2 = Double.isNaN(10 % 0.0) ? "������������" : "����������";

		System.out.println(is);
		System.out.println(is2);

		// -------------------------------------------------------

		double x = 5.0;
		double y = 0.0;
		double z = x % y;
		double result = z;
		System.out.println(Double.isNaN(z));
		System.out.println(z);
		if (Double.isNaN(z)) {
			System.out.println("0.0���� ���� �� �����ϴ�.");
		} else {
			result += 10;
			System.out.println("���" + result);
		}

	}
}
