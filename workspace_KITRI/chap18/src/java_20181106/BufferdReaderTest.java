package java_20181106;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("sample.ppt");
		// ���� ���� �����Է� �׽�Ʈ1
		long start = System.currentTimeMillis();
		while(true)
		{
			int result = fr.read();
			//System.out.println(result);
			if (result == -1)
				break;
		}
		
		long end = System.currentTimeMillis() - start;
		System.out.println("�ҿ�ð�(���۾���) = " + end);
		fr.close();
		
		
		
		
		
		
		//���� ���� �Է� �׽�Ʈ 2
		
		
		FileReader fr2 = new FileReader("sample.ppt");
		BufferedReader br2 = new BufferedReader(fr2);
		// ���� ���� �����Է� �׽�Ʈ1
		long start2 = System.currentTimeMillis();
		while(true)
		{
			String result = br2.readLine();
			//System.out.println(result);
			if (result == null)	break;
		}
		
		long end2 = System.currentTimeMillis() - start2;
		System.out.println("�ҿ�ð�(��������) = " + end2);
		br2.close();
		fr2.close();

	}
}
