package java_20181030;

class A{}
class B extends A{}
class C extends A{}

public class ExceptionTest {
	public static void main(String[] args) {
		
		A a1 = new B();
		A a2 = new C();
		if(a2 instanceof B) {
			B b2 = (B)a2;
		}
		B b1 = (B)a1;
		
		
	//1. �Էº��� 2�� �̻�, 2. 10������ ���� ���ɰ�, 3. 0�� �ƴѰ�
		int i = 0;
		int j = 0;
		
		try {
			i=Integer.parseInt(args[0]);
			j=Integer.parseInt(args[1]);
			System.out.println(i/j);
		} catch (NumberFormatException e) {
			System.out.println("���� ����� �ȳ�����");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("�Ű����� ����� �־��");
		} catch (ArithmeticException e2) {
			j = 1;
			System.out.println(i/j);
			System.out.println("0���� ������ ����");
		} catch (Exception e3) {
			e3.printStackTrace(); //���ܹ߻����� ���� ���
		} finally {
			System.out.println("�׻���µ˴ϴ�.");
		}
		
		System.out.println("���οϷ�");
		
	}
}
