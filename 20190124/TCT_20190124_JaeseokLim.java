import java.util.Scanner;

public class TCT_20190124_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        twoSosu(n);
    }
	
	private static void twoSosu(int n) {
		
		/*
		 * ����
		 *  1.���� N -> 1/2�Ͽ� 1�� �����ϸ� �Ҽ� A�� ã��
		 *  2.N-A = B, B�� �Ҽ����� ã�� 
		 *  ���
		 *  
		 */
		boolean isExist = false;
		for ( int i = n/2 ; i>= 2;i--) {
			if ( findSosu(i) && findSosu(n-i) ) {
				isExist = true;
				System.out.println(i + " " + (n-i));
				break;
			}
		} 
		if(!isExist) {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
	
	private static boolean findSosu(int n) {
		
		/*
		 * ����
		 *  1. 2->N-1���� �����ϸ� �������� 0�ΰ� ������� True,�ƴϸ�False
		 *  
		 */
		boolean isSosu = true;
		for (int i = 2 ; i <= n-1 ; i++) {
			if (n % i == 0) {
				isSosu = false;
			}
		}
		
		return isSosu;
	}
}
