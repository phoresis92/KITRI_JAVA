package chap2.java_20181019;
/*2.
å : 97�� �ִ�
int cntOfBooks = 97;
å �ʿ��� �л� : 12��
int cntOfStu = 12;

2-1å�� �Ǽ��� �л������� ���ٸ�
12�� �л��鿡�� ����Ǽ��� å �й�
1���� �л��� : xx�Ǿ� ���� �� �ֽ��ϴ�.
�й� �� �����ִ� å�� xx�� �Դϴ�.

2-2å�� �Ǽ��� �л������� ���� �ʴٸ�
������ �� �����ϴ�.*/
public class Book_distrbute {

	public static void main(String[] args) {
		int cnt_Book = 97;
		int cnt_Stu = 12;
		int bookPerStu = cnt_Book/cnt_Stu;
		int modOfBook = cnt_Book%cnt_Stu;
		
		
		/*System.out.println(cnt_Book>cnt_Stu? "1���� �л��� : "+(cnt_Book/cnt_Stu)+"�Ǿ� ���� �� �ֽ��ϴ�.\n"
				+"�й��� �����ִ� å��"+cnt_Book%cnt_Stu+"�� �Դϴ�."
				:"������ �� �����ϴ�.");*/
		
/*		if(cnt_Book>cnt_Stu) {
			System.out.println("1���� �л��� : "+(cnt_Book/cnt_Stu)+"�Ǿ� ���� �� �ֽ��ϴ�.\n"
				+"�й��� �����ִ� å��"+cnt_Book%cnt_Stu+"�� �Դϴ�.");
		}else {
			System.out.println("������ �� �����ϴ�.");
		}
		*/
		
		int status = cnt_Book < cnt_Stu ? 1 : 0;
		
		if(status ==0) {
			System.out.println(bookPerStu);
			System.out.println(modOfBook);
		}else {
			System.out.println("������ �� �����ϴ�.");
		}
		
		
		
	}
}
