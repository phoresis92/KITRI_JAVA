package chap5.java_20181023;

public class PrimeANS2 {

	public static void main(String[] args) {
		// �Էº���1�� �ʿ�. ���� ���� ����
		int n = Integer.parseInt(args[0]);
		int cnt = 0; // ������ 0�� ��� ���� ����
		int prime[] = new int[n]; // �Ҽ� ���� �迭
		int index = 0;

		if (n > 0) {
			for(int k =2; k<=n; k++) {
				cnt=0;
				for (int i = 1; i <= k; i++) {
					if (k % i == 0)
						cnt++;
				}
				if (cnt == 2) {
					prime[index++] = k; // ���ο� �κ� !!!!!!!!!!!!!!!!!!!!	
				}
			}

	}
		
	//���
		for(int i = 0; i<index ; i++) {
			System.out.println(prime[i]);
		}
}
}