package java_20181105;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {

	public static void main(String[] args) throws IOException { // ���ܸ޽������(or try-catch�� �޼��� ����)

		// FileWriter �������� x : empty ���� ����
		// FileWriter ��������o : ���� ���� ������
		// ���� ���� ���� �����ϸ� + �߰� ��� (true)
		// ���� ���� ���� �����ϰ� + ��� (false)
		FileWriter fw = new FileWriter("score.txt", true);
		/*fw.write('A'); // a
		fw.write(98); // b
		fw.write(99); // c
		fw.write(100); // d
		fw.write("\r\njava ���α׷���\r\n");*/
		//Ű���� �Է� �л��� ����1 ����2 ����3
		
		Scanner sc = new Scanner(System.in);
		fw.write("\r\n"+sc.nextLine());
		
		//fw.write("\r\n���л� 91 45 69");
		fw.close(); //close���� ������ �ӽ����� �����͸� ������ rollback;

	}

}
