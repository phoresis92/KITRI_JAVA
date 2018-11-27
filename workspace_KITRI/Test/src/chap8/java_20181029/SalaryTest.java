package chap8.java_20181029;

public class SalaryTest {
	public static void main(String[] args) {

		Employee e[] = new Employee[4];
		// 1.��� 2.������(Ÿ�� ���� ����....)
		e[0] = new Employee(1000, "�̻��", 10000, 5000);
		e[1] = new Manager(2000, "�谣��", 20000, 10000, 10000);
		e[2] = new Engineer(3000, "�ڱ��", 15000, 7500, 5000, 5000);
		e[3] = new Secretary(4000, "�ֺ�", 15000, 7000, 10000);

		System.out.println("���:�̸�:����:�ѱ޿�");
		for (int i = 0; i < e.length; i++) {
			e[i].sal_print();
			e[i].totalSalary();
			if (e[i] instanceof Manager) {
				System.out.println(((Manager) e[i]).manager_sal);
			} else if (e[i] instanceof Secretary) {
				System.out.println(((Secretary) e[3]).secretary_sal);
			}
		}

	}

}
