package chap12.java_20181101;

public class BoardClient extends Thread {
	
	public void run() {
		for(int i =1; i<=5 ; i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�Խù�" +i+"�� �ۼ��մϴ�");
		}
	}//run end

}//class end
