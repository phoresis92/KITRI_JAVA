package java_20181023;

public class ArrayTest2_Star2 {

	public static void main(String[] args) {
		
		String star[][] = new String[5][]; 
		//������ �迭 ���θ� �ݺ��� ���ο��� ��������!!!!!-------------------
		
		System.out.println(star.length); // 5(������)
		//System.out.println(star[0].length); // (������)
		
		for(int i = 0 ; i<star.length ; i++) {
			star[i] = new String[i+1];
			//������ �迭 ���θ� �ݺ��� ���ο��� ��������!!!!!---------------
			for(int j = 0; j<star[i].length ; j++) {
				
				star[i][j]= "*";
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
	}
}
