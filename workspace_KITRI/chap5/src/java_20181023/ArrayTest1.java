package java_20181023;

public class ArrayTest1 {
	
	public static void main(String[] args) {
		
		//12�� db���� ���� : 12�� ���� : ���� �迭
		
		/*int scores[] ;
		if(�ο� >10) {
			scores =new int[12];
		}else
			scores = new int[5];*/
		
		int scores[] = new int [12];
		
		//int scores [] = {94,23,53,46,76,87,17,26,95,37,75,12};
		
		/*for(int i =0 ; i <scores.length ; i++) {
		System.out.println(i+"�� index "+scores[i]);
		}*/
		
		
		//(Math.random()*100)+1 ���� �߻� �迭 ���� = �迭 �ʱ�ȭ
		int sum = 0;
		for(int j =0 ; j <scores.length ; j++) {
			scores[j] = (int)(Math.random()*100)+1;
			System.out.println(j+"�� index "+scores[j]);
			sum += scores[j];
		}
		
		System.out.println("���� = "+sum);
		System.out.println("���� �� ����  = " +scores.length);
		System.out.println("��� = "+(sum/scores.length));
		
		int max = 0;
		
		for(int i =0 ; i< scores.length ; i++) {
			//System.out.println(max + " , "+scores[i]);
			if(max < scores[i]) {
				max = scores[i];
				//System.out.println(max);
			}
		}
		System.out.println("�ִ밪 = "+max);
		
		
		int min = 100; //�ʱ�ȭ�� 0 �ָ� 0������ �۱⶧���� �׳� 0���� ���´�.
				
				for(int i =0 ; i< scores.length ; i++) {
					//System.out.println(max + " , "+scores[i]);
					if(min > scores[i]) {
						min = scores[i];
						//System.out.println(max);
					}
				}
				System.out.println("�ּҰ� = "+min);
		
				
				
				
				
				for(int i =0 ; i< scores.length ; i++) {
					//System.out.println(max + " , "+scores[i]);
					if(scores[0] > scores[i]) {
						scores[0] = scores[i];
						//System.out.println(max);
					}
				}
				System.out.println("�ּҰ� = "+scores[0]);
	}
}
