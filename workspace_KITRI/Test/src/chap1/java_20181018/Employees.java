package chap1.java_20181018;

public class Employees {

	public static void main(String[] args) {
		/*employees ���̺� 11�� �÷��鰪 ���� �뵵
		employees Ŭ���� : main�޼ҵ忡 : 11�� ���� ���� ���
		hire_date �÷� : date --> ���� String
		100 ���ڹ� lee@kitri.com 18/10/18 ���α׷������� ���200�� 50���μ� 
		0102223333 salary10000 commission0.4*/
		/*int employee_id, String name, String email ,String hire_date,
		String job_id, int manager_id, int department_id, int phone_number
	*/	
		Employee_spec leejava = new Employee_spec(100, "���ڹ�", "lee@kitri.com",
				"18/10/18", "���α׷���", 200, 50, 1022223333);
				
		leejava.introduce();
				
}
}

class Employee_spec{
	
	int employee_id;
	String name;
	String email;
	String hire_date;
	String job_id;
	int manager_id;
	int department_id;
	int phone_number;
	double salary;
	double commission_pct;
	boolean gender;
	boolean isbonus;
	
	Employee_spec(int employee_id, String name, String email ,String hire_date,
			String job_id, int manager_id, int department_id, int phone_number){
		this.employee_id = employee_id;
		this.name = name;
		this.email = email;
		this.hire_date = hire_date;
		this.job_id = job_id;
		this.manager_id = manager_id;
		this.department_id = department_id;
		this.phone_number = phone_number;
	}
	
	void introduce() {
		System.out.println("���  :  �̸�  :  �̸���   :  �Ի���  :  ����  :  ���  :  �μ���ȣ  :  ����ó");
		System.out.println(employee_id +" : "+ name  +" : "+ email  +" : "+ hire_date  +" : "+
			job_id  +" : "+ manager_id  +" : "+ department_id  +" : "+ phone_number);
	}
	
}
