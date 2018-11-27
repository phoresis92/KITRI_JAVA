package java_20181029;

class StudentWorker/*extends Object*/ implements Student, Worker { // �������̽� ���� Ŭ����

	String name = "����";
	
	
	StudentWorker() {
		System.out.println("StudentWorker ������ ����");
	}

	@Override
	public void work() {
		System.out.println(name+" ���ϴ�.");
	}

	@Override
	public void study() {
		System.out.println(name+" �����ϴ�.");
	}

	@Override
	public void lunch() {
		System.out.println(name+" ���ɸԴ�.");
	}

}

public class StudentWorkerTest {
	public static void main(String[] args) {

		// Student st = new Student();
		// Worker wk = new Worker();

		StudentWorker sw = new StudentWorker();
		sw.study();
		sw.work();
		sw.lunch();
		System.out.println(sw.name);
		System.out.println(Student.name);
		System.out.println(Worker.name);
		//System.out.println(super.name); //super�� Object
		/*super�� ��ü�� �ǹ��ϴµ� interface�� ��ü�� ������ �� ����.
		�� super�� Object�� �Ǵ� ��*/
		
		sw.name = "�л�2";
		//Student.name = "�̸��ٲٴ°� �Ұ� public final static";
		//Worker.name = "���п���";
		
		Student sw2 = new StudentWorker();
		sw2.study();
		sw2.lunch();
		//sw2.work();
		System.out.println(sw2.name);
		
		Worker sw3 = new StudentWorker();
		sw3.work();
		sw3.lunch();
		//sw3.study();
		System.out.println(sw3.name);
		
		StudentWorker sw4 = new StudentWorker();
		/*Worker w = sw4;
		w.lunch();
		w.work();*/
		
		if( sw4 instanceof Student) {
			//Student s = sw4;
			sw4.study();
			sw4.lunch();
			sw4.work();
		}else if( sw4 instanceof Worker) {
			Worker wk = sw4;
			wk.work();
			wk.lunch();
		}
		
	}
}
