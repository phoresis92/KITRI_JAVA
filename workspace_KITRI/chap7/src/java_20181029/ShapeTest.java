package java_20181029;

abstract class Shape{
	
	String test = "�Ϲ� �ʵ庯���� �߰��� �� �ִ�";
	
	Shape(int a){
		System.out.println("�����ڵ� ���� �� �ִ�");
	}
	
	abstract void area();
	abstract void circum();
	
	void test1() {
		System.out.println("�Ϲ� �޼ҵ� �Է� ����!!!");
	}
	
}

class Circle extends Shape{
	int radius;// ������ �ʵ庯��
	
	Circle(int radius){
		super(radius);
		this.radius=radius;
	}
	
	void area() {
		System.out.println("�������� "+radius+"�� ���� ����="+
				Math.ceil(radius*radius*Math.PI*100)/100);
	}
	void circum() {
		System.out.println("�������� "+radius+"�� ���� �ѷ�="+
				String.format("%.2f", (2*radius*Math.PI*100)/100));
	}
}

class Rectangle extends Shape{
	int width, height;
	
	Rectangle(int width, int height){
		super(width);
		this.width=width;
		this.height=height;
	}
	void area() {
		System.out.println("����="+width+" ����="+height+" �� �簢���� ����="+width*height);
	}
	void circum() {
		System.out.println("����="+width+" ����="+height+" �� �簢���� �ѷ�="+(width+height)*2);
	}
}



public class ShapeTest {
	public static void main(String[] args) {
		//����� �Ű����� 2�� : circle 5(������ 5�� �� ��ü ����)
		//����� �Ű����� 3�� : rect 6 8(����6 ����8 �簢�� ��ü ����)
		Shape s = null;
		if(args.length == 2 && args[0].equals("circle")) {
			s = new Circle(Integer.parseInt(args[1]));
		}else if(args.length == 3 && args[0].equals("rect")) {
			s= new Rectangle(Integer.parseInt(args[1]),
								Integer.parseInt(args[2]));
		}/*else if (getClass().getName().equals(args[0]);) {
			
		}*/
		s.area();
		//�������� xxx�� ���� ����=
		//����=xxx ����=xxx �� �簢���� ����=
		s.circum();
		//�������� xxx�� ���� �ѷ�=
		//����=xxx ����=xxx �� �簢���� �ѷ�=
		
		s.test1();
		System.out.println(s.test);
	}
}
