package chap11.java_20181031;

public class StringTest {
	public static void main(String[] args) {
		String first = "Arnold";
		String middle = "Alois";
		String last = "Schwarzenegger";
		String initials;
		String firstInit, middleInit, lastInit;

		firstInit = first.substring(0,1); //charAt(0); charŸ���̶� Ÿ���� ���� �ʴ´�.
		middleInit = middle.substring(0,1);
		lastInit = last.substring(0,1);
		initials = firstInit+middleInit+lastInit;

		System.out.print("1. �̸�: ");
		System.out.println(first + " " + middle + " " + last);
		System.out.print("2. �̸� (�빮��): ");
		System.out.println(first.toUpperCase() + " " + last.toUpperCase());
		System.out.print("3. �̴ϼ�:  ");
		System.out.println(initials);

		System.out.println("4. First Name�� arnold�̴�. (��ҹ��� ����; T/F):  " + first.equals("arnold"));
		System.out.println("5. First Name�� arnold�̴�. (��ҹ��� �̱���; T/F):  " + first.equalsIgnoreCase("arnold"));

		System.out.println("6. Last Name " + last + "�� index ��ȣ 6~14���� ���ڿ� : " + last.substring(6));
		System.out.println("7. Last Name " + last + "���� negger ���ڿ��� ��ġ : " + last.indexOf("negger"));
	}
}
