package java_20181022;

public class Score_Test {
	public static void main(String[] args) {
		//���л� 80, 99, 23
		
		String name = "���л�";
		
		int kor = 80;
		int mat = 99;
		int eng = 43;
		
		//���� ,����
		int total = kor+mat+eng;
		double avg = total/(double)3;
		
		System.out.println("�̸�="+name);
		System.out.println("����="+kor);
		System.out.println("����="+mat);
		System.out.println("����+"+eng);
		System.out.println("����="+total);
		System.out.printf("�Ǽ����=%.2f\n",avg);
		System.out.println("�������="+(int)avg);
		
		String result = (int)avg>=80? "\n����":"\n�̼���";
		System.out.println(result+"\n");
		
		
/*		���Ῡ�����: ���� ��� 80�̻�
		1. ���� 2. �������+10*/
		if((int)avg>= 80) {
			System.out.println("����");
			avg +=10;
			System.out.println((int)avg);
		}else {
//			80�̸� 1. �̼���:��� 2. ������� -10
			System.out.println("�̼���:���");
			avg-=10;
			System.out.println((int)avg);
		}
		
		
		
	}
}
