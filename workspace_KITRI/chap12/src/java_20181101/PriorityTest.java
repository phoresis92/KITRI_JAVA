package java_20181101;

class PriorityThread extends Thread{
	
	PriorityThread(String name){
		super(name);
	}
	public void run() {
		for(int i = 1; i<=10;i++) {
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				System.out.println("������ ����� �Ұ�");
			}
			System.out.println(getName()+"/");
		}
	System.out.println(getName()+"����");
	}
	
}

public class PriorityTest {

	public static void main(String[] args) {
		
		for(int i = 1; i<=2;i++) {
			Thread t = new PriorityThread("������-"+i);
			System.out.println(t.getPriority());
			//Thread.NORM_PRIORITY =5
			if(i==5) {
				t.setPriority(Thread.MAX_PRIORITY);
			}else {
				t.setPriority(Thread.MIN_PRIORITY);
			}
			t.start();
		}
		
	}
	
}
