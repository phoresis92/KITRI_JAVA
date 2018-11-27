package java_20181105;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest {

	public static void main(String[] args) {

		/*try {
			File f = new File("src/java_20181105/FileReaderTest.java");
			if (f.exists()) {
				FileReader fr = new FileReader(f);

				int r = 0;

				while ((r = fr.read()) != -1) {
					System.out.print((char) r);
				}
			}else System.out.println("������ �����ϴ�.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}*/

		
		try {
			
			
			File f = new File("score.txt");
			if (f.exists()) {
				FileReader fr = new FileReader(f);
				Scanner sc = new Scanner(fr);
				//score.txt ���� : xxx 100 100 100 ���� ���
				//hasNextLine() > null �ƴҶ����� �ݺ�
				//nextLine() / ����и� / 234�� ���� ����
				//234�� �հ� ���
				// ��� : �̸� ����1 ����2 ����3 ���� ���
				
				while(sc.hasNextLine()) {
					String line = sc.nextLine();
					String data[] = line.split(" ");
					int score1 = Integer.parseInt(data[1]);
					int score2 = Integer.parseInt(data[2]);
					int score3 = Integer.parseInt(data[3]);
					
					/*sc.next();
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();*/
					
					int sum = score1+score2+score3;
					int avg = sum/3;
					
					System.out.println(line+" "+sum+" "+avg);
				}
				
				
				

/*				int r = 0;

				while ((r = fr.read()) != -1) {
					System.out.print((char) r);
				}*/
				fr.close(); // ���ϻ��Ϸ� g/c
				sc.close(); 
			}else System.out.println("������ �����ϴ�.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
