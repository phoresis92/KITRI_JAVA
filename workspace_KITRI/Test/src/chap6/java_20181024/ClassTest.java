package chap6.java_20181024;

public class ClassTest {

	public static void main(String[] args) {
		// name, dept, course, tuition, additional
		//System.out.println(args.length);
		
		
		if (args.length >= 5) {
			ClassExam stu = new ClassExam(args[0], args[1], args[2].toUpperCase(), args[3], args[4]);
			stu.ref();

		}else {
			System.out.println("===�Է°��� �ٽ� �Է��Ͻÿ�(5��)===");
			System.out.println("�̸�, �Ҽ�, ������, ������, �ΰ���");
			System.out.println("    ===���� �Է°�("+args.length+"��)===       ");
			for(int i = 0 ; i<args.length ; i++) {
				System.out.print(args[i]+" ");
			}
		}
		

	}

}
