package chap6.java_20181024;

public class ClassExam {

	String name;
	String dept;
	String course;
	String tuition;
	String additional;

	ClassExam(String name, String dept, String course, String tuition, String additional) {
		this.name = name;
		this.dept = dept;
		this.course = course;
		this.tuition = tuition;
		this.additional = additional;
	}

	void ref() {
		int refund=0;
		int inttui = Integer.parseInt(tuition);
		int intadd = Integer.parseInt(additional);

		if (course.equals("�ڹ����α׷���")) {
			int result = (int) (inttui * 0.25 + intadd);
			refund = result;
		} else if (course.equals("JDBC���α׷���")) {
			int result = (int) (inttui * 0.2 + intadd);
			refund = result;
		} else if (course.equalsIgnoreCase("JSP���α׷���")) {
			int result = (int) (inttui * 0.15 + intadd);
			refund = result;
		} else {
			System.out.println(name + " " + dept + " " + course + " " + tuition + " " + additional);
			System.out.println("�߸� �ԷµǾ����ϴ�.");
			return;
		}
		
		/*System.out.println
		 * ("�̸�=" + name + "\n�Ҽ�=" + dept + "\n�����=" 
		 * + course + "\n������=" + tuition + "\n�ΰ���="
					+ additional + "\nȯ�ޱ�=" + refund);*/
		System.out.printf
		(" �̸�=%s\n �Ҽ�=%s\n �����=%s\n ������=%s\n �ΰ���=%s\n ȯ�ޱ�=%d", 
				name, dept, course, tuition, additional, refund);
	}

}
