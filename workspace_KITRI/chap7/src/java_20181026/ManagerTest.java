package java_20181026;

class Employee{ // ȸ���
	int id;
	String name = "�θ�";
	double salary;
	String dept;
	
	void print() {
		System.out.println(id+":"+salary+":"+dept);
	}
	
}

class Manager extends Employee{ //������ ���
	String jobOfManage;
	int cntOfSub;
	String name = "�ڽ�";
	//String name = "�θ�";
	
	
	void test() {
		String name = "����";
		System.out.println(name); //��������
		System.out.println(this.name); //�ڽ�
		System.out.println(super.name); //�θ�
	}
	
	//@ at-sign
	@Override
	void print() {
		super.print();
		//System.out.println(id+":"+salary+":"+dept);
		System.out.println(jobOfManage+"--"+cntOfSub);
		
	}
	
	
}

public class ManagerTest {
	
	public static void main(String[] args) {
		
	Employee e1 = new Employee();
	
	e1.name = "����";
	
	Manager m1 = new Manager();
	
	m1.id = 100;
	//m1.name = "�ڰ���" ;
	m1.salary = 50000.88;
	m1.jobOfManage = "�������";
	m1.cntOfSub = 10;
//	System.out.println
//	(m1.id+":"+m1.name+":"+m1.salary+":"+m1.jobOfManage+":"+m1.cntOfSub);

	m1.print();
	
	//m1.test();
	}
}
