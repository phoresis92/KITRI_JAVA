package java_20181023;

public class ArrayTest2_Star {

	public static void main(String[] args) {
		//5�� 3�� �� ��� : ������ �迭 �̿�
		/*
		***
		***
		***
		***
		***
		*/
		
		String star[][] = new String[5][3];
		System.out.println(star.length); // 5(������)
		System.out.println(star[1].length); // 3(������)
		
		//�����迭 : 0 �Ǽ��迭 : 0.0 boolean�迭 : false
		//����Ÿ�Ժ��� : null
		
		for(int i = 0 ; i<star.length ; i++) {
			
			/*System.out.println(star[0]);
			//String �迭 : [Ljava.lang.String;@15db9742
			System.out.println(star[0][0]);	//null
*/			
			for(int j = 0; j<star[i].length ; j++) {
				
				star[i][j]= "*";
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
