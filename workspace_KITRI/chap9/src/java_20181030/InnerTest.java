package java_20181030;

class A /*extends B*/{ //outer Ŭ���� = ����Ŭ����
	
	int i = 10;
	
	B b1 = new B(); // �ٸ� Ŭ����Ÿ�� ���� ����
	
	
	class B{ //inner Ŭ���� = ��øŬ����
		int j = 20;
		void mb() {
			System.out.println(j+i);
		}
	}
	
	
	
	
	class C implements Runnable{

		@Override
		public void run() {
			System.out.println("run������");
		}
		
	}
	C c1 = new C();
	
	
	
	/*void test() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("run������22");
			}
		};//������ Ŭ���� , �������� 
		r.run();
	}*/
	
	void test() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("run22222");
			}
		};
		r.run();
	}
	
}




public class InnerTest {
	public static void main(String[] args) {
		
		A a1 = new A();
		
		System.out.println(a1.i); //10
		System.out.println(a1.b1.j); //20
		
		System.out.println(a1.new B().j); //20
		
		A.B b2 = a1.new B();
		A.B b3 = new A().new B();

		System.out.println(b2.j);//20
		b2.mb(); // 30
		
		a1.new B().mb(); //30
//====================================================================		
		
		A.C c2 = a1.new C();
		//c2.run();
		
		a1.test();
		
		
		
	}
}
