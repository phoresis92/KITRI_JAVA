package java_20181024;

//ȸ�����ü Ʋ ����
public class Employee {
//�������=����
	int id;
	String name;
	String dept;
	String title;
	double pay;
	String company = "KITRI";

	// ������ : ��ü���� �������� ���� ���� ����
	// Ŭ���� �̸��� ����
	Employee() {
		// System.out.println("employee������ ȣ��");
	}

	Employee(int id, String name) {
		this(id, name, "�μ�������", "����", 0);
	}

	Employee(int id, String name, String dept, String title, double pay) {

		this.id = id;
		this.name = name;
		this.dept = dept;
		this.title = title;
		this.pay = pay;

	}

	void introduce() {
		System.out.println(company + "���=" + id + " �̸�=" + name + " �μ�=" + dept + " �޿�=" + pay + " ��å=" + title);
	}
	
	public String toString() {
		return company + "���=" + id + " �̸�=" + name + " �μ�=" + dept + " �޿�=" + pay + " ��å=" + title;
	}
	
}
