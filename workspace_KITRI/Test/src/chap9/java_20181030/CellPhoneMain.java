package chap9.java_20181030;

public class CellPhoneMain {
	public static void main(String[] args) {

		CellPhone myPhone = new CellPhone("GALAXY-9");

		// charge, call �޼ҵ� ȣ�� �����Ͽ� try-catch ��� ����
		// throws �ϰ� �ִ� ���� ó���Ѵ�.
		// �� ���� �߻��� � �޼ҵ忡�� � �������� �߻��ߴ���
		// ����Ѵ�

		try {
			myPhone.charge(20); // 20�а� ������ �Ѵ�.
			myPhone.printBattery();

			myPhone.call(300); // 300�а� ��ȭ�� �Ѵ�.
			myPhone.printBattery();

			myPhone.charge(50); // 50�а� ������ �Ѵ�.
			myPhone.printBattery();

			myPhone.call(40); // 40�а� ��ȭ�� �Ѵ�.
			myPhone.printBattery();

			myPhone.call(-20); // ��ȭ�ð��Է¿���
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		CellPhone yourPhone = new CellPhone("galaxy-9");

		if (myPhone.isSame(yourPhone)) {
			System.out.println("���� ���Դϴ�.");
		} else {
			System.out.println("�ٸ� ���Դϴ�.");
		}
	}
}