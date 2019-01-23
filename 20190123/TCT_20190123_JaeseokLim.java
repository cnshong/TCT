import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TCT_20190123_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list;
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        
        calculXOR(list);
    }
	
	private static void calculXOR(int[] list) {
		
		List<Integer> xorList = new ArrayList<Integer>();
		
		xorList.add(list[0]);
		//Ȧ�� �����ΰ͸� xorList�� �߶󳻱�
		for ( int i = 1 ; i < list.length; i++ ) {
			if ( xorList.contains(list[i])) {
				xorList.remove(xorList.indexOf(list[i]));
			} else {
				xorList.add(list[i]);
			}
		}
		
		int jaritsu = 1;// 10������ �ٲ��� 2���� �ڸ��� 
		int xorCnt = 0; // 2�� �������� �������� 1�ΰ���� cnt
		int endCnt = 0 ;// xor����� 0�� �Ǿ����� cnt
		
		int result = 0 ; //xor ���� �����
		
		while(true) {
			
			endCnt = 0 ;
			xorCnt = 0 ;
			
			for ( int i = 0 ; i < xorList.size();i++) {
				//2�� �������� ������
				if ( xorList.get(i)%2 == 1) {
					xorCnt++;
				}
				//list���� 0�϶� ����cnt����
				if ( xorList.get(i) == 0 ) {
					endCnt++;
				}
				//2�� ������ �����
				xorList.set(i, xorList.get(i)/2);
				
			}
			//xorCnt ��Ȧ�� �϶� jaritsu �� sum
			if ( xorCnt % 2 !=0 ) {
				result += jaritsu;
			}
			//endCnt �� xorList�� ����� ������ ������������
			if  (endCnt == xorList.size()) {
				break;
			}
			//2���� �ڸ��� ����
			jaritsu = jaritsu*2;
			
		}
		
		System.out.println(result);
	}
}
