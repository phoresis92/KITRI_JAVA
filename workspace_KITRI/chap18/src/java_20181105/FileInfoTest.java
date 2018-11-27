package java_20181105;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileInfoTest {
	
	public static void main(String[] args) {
		
		//�����Ű����� : �̸� �ʿ� �Է°� ����
		//Ű���� : ��ȭ�ﰢ
		
		System.out.println("���ϸ��̳� ���丮���� �Է��Ͻÿ�");
		System.out.print("���ϸ�: ");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		File f1 = new File(name);
		if(f1.exists()) {
			
			if(f1.isFile()) {
				//����
				try {
					System.out.println("���ϰ�� = "+f1.getCanonicalPath());
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("���ϱ���(byte����= "+f1.length());
				System.out.println("�����б⿩�� = "+f1.canRead());
				System.out.println("���Ͼ���(�������)���� = "+f1.canWrite());
				
				Date last = new Date(f1.lastModified());
				SimpleDateFormat sdf = new SimpleDateFormat
						("yyyy�� MM�� dd�� HH�� mm�� ss��");
				System.out.println("�������� �����ð� = "+sdf.format(last));
				
			}else {
				//���丮
				try {
					System.out.println("���ϰ�� = "+f1.getCanonicalPath());
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				String[] files = f1.list();
				for(String s : files) {
					File fs = new File(s);
					/*if(fs.isFile()) { //���ϸ� ���
						System.out.println(s);
					}*/
					if(fs.isDirectory()) { //���丮�� ���
						System.out.println(s);
						String[] fsfiles = fs.list();
						for(String ss : fsfiles) {
							System.out.println(ss);
						}
						
					}
				}
			}
		}else {
			System.out.println("���ϸ� �Ǵ� ���丮�� Ȯ��");
		}
		
		
	}

}
