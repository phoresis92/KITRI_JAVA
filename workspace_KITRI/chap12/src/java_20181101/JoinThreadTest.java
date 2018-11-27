package java_20181101;

class JoinThread extends Thread{
	
	int sum=0;
	
	public void run() {
		for(int i = 0 ; i<=100; i++) {
			sum+=i;
			System.out.println(sum);
		}
	}
}


public class JoinThreadTest {
	
	public static void main(String[] args) {
		
		JoinThread jt = new JoinThread();
		//jt����  main����
		
		jt.start(); // run() ����
		//jt��� main����(jt, main �����ư��� ����)
		
		try {
			jt.join();
		} catch (InterruptedException e) {
			System.out.println("���ν��������Ұ�");
		}
		//jt����  main�Ͻ�����
		
		System.out.println("1-100���� = "+jt.sum);
		//jt����  main����
		System.out.println("��������");
		//main����
		
		
	}

}
