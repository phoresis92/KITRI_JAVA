package java_20181023;

public class StringEqualsTest {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		
		System.out.println("(s1,s2 �ּ�)����� "+(s1 == s2));
		System.out.println("(s3,s4 �ּ�)����� "+(s3 == s4));
		System.out.println("(s1,s2 ���ڿ�)����� "+(s1.equals(s2)));
		System.out.println("(s3,s4 ���ڿ�)����� "+(s3.equals(s4)));
		
		String s5 = null;
		System.out.println(s5);//null
		System.out.println(s5.equals(s4));//NullPointerException
		//null ������ ����, �޼ҵ� :nullpointerexception;
	}
}
