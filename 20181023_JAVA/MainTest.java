public class MainTest {

	public static void main(String[] args) {
		
		/*args = new String[args.length]
		args[0]~args[args.length-1] : �Է� ����*/
		
		
		System.out.println("����� �Ű������� ���� = " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println(args[0] + args[1]);
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first + second);

		// double sample = Double.parseDouble(args[0]);

	}
}