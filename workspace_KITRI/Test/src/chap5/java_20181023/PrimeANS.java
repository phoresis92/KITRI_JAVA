package chap5.java_20181023;

public class PrimeANS {

	public static void main(String[] args) {
		// �Էº���1�� �ʿ�. ���� ���� ����
		int n = Integer.parseInt(args[0]);
		int cnt = 0; // ������ 0�� ��� ���� ����

	/*	if (n > 0) {
			// n: 1~n ���� ������ 0�� ��� 2���̸� �Ҽ�
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) cnt++;
			}
			if (cnt == 2)
				System.out.println(cnt+":"+n + " : �Ҽ��̴�");
			else
				System.out.println(cnt+":"+n + " : �Ҽ� �ƴϴ�");
		}
		*/
		
		// �Էº���1�� �ʿ�. ���� ���� ����
				

				if (n > 0) {
					// n: 1~n ���� ������ 0�� ��� 2���̸� �Ҽ�
					for (int i = 2; i < n; i+=2) {//¦���� ���ʿ� �ɷ��ش�
						if (n % i == 0) cnt++;
					}
					if (cnt == 0)
						System.out.println(cnt+":"+n + " : �Ҽ��̴�");
					else
						System.out.println(cnt+":"+n + " : �Ҽ� �ƴϴ�");
				}
		
		
				
		
		
	}
}
