package java_20181105;

import java.io.IOException;

public class KeyboardTest {
	
	public static void main(String[] args) {
		/*
		//java �Է½�
		System.in.read(); //j
		System.in.read(); //a
		System.in.read(); //v
		System.in.read(); //a
*/		
		//'a'97 '0'48 'A'65
		//CTRL + Z : Ű���� �Է� ���� ����Ű => -1
		//java.io �ڵ� : IOException throws
		
		//1.�Խ��� 2.ȸ������ 3.��ٱ��� quit
		int result = 0;
		System.out.println("��ȣ�� �Է��ϼ���");
		try {
		while((result = System.in.read()) != 'q') {
			//System.out.println((char)result);
			char num = (char)result;
			if(num == '1'/*49==1*/) {
				System.out.println("�Խ��� �����ϼ̽��ϴ�.");
			}else if(num == '2') {
				System.out.println("ȸ������ �����ϼ̽��ϴ�.");
			}else if(num == '3') {
				System.out.println("��ٱ��� �����ϼ̽��ϴ�.");
			}
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		//13 ���� , -1 ���� ����
		//������ ���� �ùٸ��� �����
		//�ڹٵ�����Ÿ�� �ν�x
		
		
		
		
	}

}
