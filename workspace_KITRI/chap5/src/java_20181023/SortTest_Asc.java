package java_20181023;

public class SortTest_Asc {
	public static void main(String[] args) {

		int scores[] = new int[5];

		System.out.println("===�迭 ���� ���� ����===");

		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 100) + 1;
			System.out.print(scores[i]+" ");
		}

		System.out.println();

		// �������� ����
		System.out.println("===�迭 ������ ����===");
		for (int i = 0; i < scores.length-1; i++) {
			for (int j = i+1; j < scores.length; j++) {
				if (scores[i] > scores[j]) {
					int temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}
			}
			for(int k =0 ; k<scores.length ; k++) {
				System.out.print(scores[k]+" ");
			}
			System.out.println();
		}
	

	}
}
