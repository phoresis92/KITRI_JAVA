package java_20181029;

class Parent{
	int su = 10;
	void print() {
		System.out.println(su);
	}
	 void mp() {
		 System.out.println("Parent");
	 }
}

class Child extends Parent{
	int su = 20;
	void print() {
		System.out.println(su);
	}
	void mc() {
		System.out.println("Child");
	}
}

public class CastingTest {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		System.out.println(p1.su);
		p1.print();
		p1.mp();
		//p1.mc(); //�޸� ����x
		
		System.out.println(p1 instanceof Child);
		if(p1 instanceof Child) {
			Child c22 = (Child) p1;
			c22.mc(); // => ������ Ÿ�ӿ� ������ ������ ��Ÿ�� ����
		}
			
		System.out.println("===========");
		Child c1 = new Child();
		System.out.println(c1.su);
		c1.print();
		c1.mp();
		c1.mc();
		
		System.out.println("===========");

		Parent p2 = new Child();
		System.out.println(p2.su);
		p2.print();
		p2.mp();
		//p2.mc(); // �޸� child ����
		System.out.println("===========");

		Child c2 = (Child)p2;
		System.out.println(c2.su);
		c2.print();
		c2.mp();
		c2.mc();
		
		System.out.println(p2 instanceof Child);
		if(p2 instanceof Child) {
			System.out.println("p2�� Child ��ü�Դϴ�");
			((Child)p2).mc();//�ӽ��� ������ü �޼ҵ� ȣ��
		}
		
		
		
		Parent[] list = new Parent[2];
		list[0] = new Parent();
		list[1] = new Child();
		
		
		
		
	}
	
}
