package java_20181025;

class Sample {
	int a = 10;
}

class Test {

	void add1(int i) {
		System.out.println("add1�޼ҵ� = " + i++);
	}

	void add2(Sample s) {
		System.out.println("add2�޼ҵ�= " + s.a++);

	}
}

public class CallByValueTest {

	public static void main(String[] args) {

		Test t = new Test();

		// �⺻������ ����
		/*
		 * int j = 10; t.add1(j); System.out.println("add1ȣ�� ���� j= "+j);
		 */

		Sample sam = new Sample();
		t.add2(sam);
		System.out.println("add2ȣ�� ���� sam.a= " + sam.a);
		t.add2(sam);

		Sample sa = sam;

		System.out.println(sa.a);

	}
}
