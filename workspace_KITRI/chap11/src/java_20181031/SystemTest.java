package java_20181031;



public class SystemTest {
	
	void test() {
		int random = (int)(Math.random()*100)+1;
		System.out.println(random);
		//1970�� 1�� 1�� 0 0 0 ~ ���� ��� 1/1000��
		long start = System.currentTimeMillis();
		
		for(int i = 1 ; i <= 1000; i++) {
			//random i ������ ���α׷��ߴ�
			//if(random == i) System.exit(0); //--------------------
			System.out.println(i);
		}
		long end = System.currentTimeMillis()-start;
		System.out.println(end+"(1/1000��) �ҿ�");
		
		System.out.println("�ݺ��� ���� ����");
	}

	public static void main(String[] args) {

		SystemTest st = new SystemTest();
		System.out.println("testȣ������");
		
		System.out.println();
		st.test();
		System.out.println("testȣ������");
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperties());


	}

}
