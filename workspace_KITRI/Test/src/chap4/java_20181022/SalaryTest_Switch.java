package chap4.java_20181022;

public class SalaryTest_Switch {
	public static void main(String[] args) {
		
		String title = "����";
		//�븮 ���� ���� ����
		double basesalary = 50000;
		int emp_comm =0;
		int totalsalary = 0 ;
		
		
		switch(title) {
		case "���" :
			emp_comm = 1000;
			totalsalary = (int)(basesalary+emp_comm);
			break;
		case "�븮" :
			
		case "����" :
			emp_comm = 5000;
			totalsalary = (int)(basesalary*1.2+emp_comm);
			break;
		default :
			emp_comm = 10000;
			totalsalary += (int)(basesalary*1.3+emp_comm);
			break;
		}
		System.out.println(title+"�� ������ = "+basesalary+
				", ��� ������ = "+emp_comm+", �ѱ޿��� = "+totalsalary);
		
	}
}
