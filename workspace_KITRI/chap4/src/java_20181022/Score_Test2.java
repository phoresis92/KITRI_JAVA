package java_20181022;

public class Score_Test2 {
	public static void main(String[] args) {
		//���л� 80, 99, 23
		
		String name = "���л�";
	
		
		int kor = (int)(Math.random()*100)+1;
		int mat = (int)(Math.random()*100)+1;
		int eng = (int)(Math.random()*100)+1;
		
		
		//���� ,����
		int total = kor+mat+eng;
		double avg = total/(double)3;
		int intavg = total/3;
		
		System.out.println("�̸�="+name);
		System.out.println("����="+kor);
		System.out.println("����="+mat);
		System.out.println("����+"+eng);
		System.out.println("����="+total);
		System.out.printf("�Ǽ����=%.2f\n",avg);
		System.out.println("�������="+(int)avg);
		
		/*������� : 90�� �̻� : A��� ���
				80�� �̻� : B
				70�� �̻� : C
				������ : ����*/
		
		if(intavg>=90) {
			System.out.println("A���"); // A+, A ,A-
			/*if(intavg>=97) {
				System.out.println("A+");
			}else if(intavg>=95) {
				System.out.println("A");
			}else {
				System.out.println("A-");
			}*/
		}else if(intavg>=80) {
			System.out.println("B���");
		}else if(intavg>=70) {
			System.out.println("C���");
		}else {
			System.out.println("F���");
		}
		
		
		/*String grade ;
		if(intavg>=90) {
			grade = "A���";
		}else if(intavg>=80) {
			grade = "B���";
		}else if(intavg>=70) {
			grade = "C���";
		}else {
			grade = "F���";
		}
		System.out.println(grade);*/
		
		int intavg2 = intavg/10; 
		System.out.println("intavg2"+intavg2);
		String grade;
		switch(intavg2) {
		case 10 :  
			grade = "A���";
			break;
		case 9 :
			grade = "A���";
			break;
		case 8 :
			grade = "B���";
			break;
		case 7 :
			grade = "C���";
			break;
		default :
			grade = "F���";
			break;
		}
		System.out.println(grade);
		
		
		int a = -5;
		int b = 10;
		//a,b ��� ����� ��쿡�� ����
		//a+b ��� 10 �̻��̸� ���� / ����
		
		if(a>0 && b>0) {
			int c = a+ b;
			if(c >=10) {
				System.out.println("����");
			}else {
				System.out.println("����");
			}
		}else {
			System.out.println("������ �ֽ��ϴ�.");
		}
		
		
		/*//-�ζǹ�ȣ 6�� ���� : 1-45
		(Math.random()*45) // 0.0 <= ? < 45
		(Math.random()*45)+1 // 1<= ? <46
		
		//������������
		(int)(Math.random()* ����(�ִ밪-���۰�+1))+���۰�*/
		
		
		
		
		int te = (int)(Math.random()*91)+10;
		//10<te<101
		System.out.println(te);
		
		
		
	}
}
