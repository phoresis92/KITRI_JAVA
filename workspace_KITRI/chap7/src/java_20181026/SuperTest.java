package java_20181026;

class A extends Object{
	double d1;
	
	//A(){}
	A(double d){
		//super();
		System.out.println("A������ ȣ��");
		d1 = 10*10;
		//a=1.0;
		System.out.println(d);
	}
}

class B extends A{
	B(double d) {
		super(d);
		System.out.println("B������ ȣ��");
	}
	
	double d2;
	/*B() {
		super(3.14); //A()������ȣ�� => A(double) ������ȣ�� ����
		System.out.println("B������ ȣ��");
		d2 = 10*10*10;
		//System.out.println(a);
	}*/
}

public class SuperTest {
	public static void main(String[] args) {

		A a1 = new A(3.14);
		System.out.println(a1.d1);
		//System.out.println(a1.d2);

		B b1 = new B(1.1);//Object,A,B
		System.out.println(b1.d1);
		System.out.println(b1.d2);
		
	}
}
