import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
    ����
	�����̴� 3�� ��� ���Ͼ��̴�. �״� ��� �ڿ����� 3���� 3�� ����� �ڿ����� �����ϴ� ���� ��̷� ������ �ִ�. 
	���� �״� �ڽſ��� �־��� ���� 3���� 3�� ����� �и��ϴ� ����� ���� �� ������ �ñ�������.
	������ �����̴� ������ �б��̱� ������ �̷� ����� �ϱ⿡�� �ʹ� ����������.
	�׷��� ��ſ��� �� ����� ��Ź�ߴ�.
	
	��, ������ 3�� ��� �ڿ��� n�� �־����� ��, �ش� ���� 3�� ����� �ڿ��� 3���� �и��ϴ� ����� ������ ����ض�.
	�� ������ ���� ������ �ٸ��� �ٸ� ������� �����Ѵ�.
	���� ��� 12 = 3 + 6 + 3 �� 12 = 3 + 3 + 6 �� �ٸ� ����̴�.
	
	�Է�
	������ 3�� ��� �ڿ��� n�� �־�����. (3 �� n �� 3000)
	
	���
	�ڿ��� n�� �����ϴ� ����� ������ ����϶�
	
	����1
	�Է�: 9
	���: 1
	
	9 = 3+3+3 �� �ٸ� ����� ���⿡ 1
	
	����2
	�Է�: 12
	���: 3
	
	12 = 3 + 3 + 6,
	12 = 3 + 6 + 3,
	12 = 6 + 3 + 3
	�� 3��
 *
 */
public class TCT_20190117_KimJinKwu {
	static int[] works;
	static int n;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		int scanNumber = scan.nextInt();
		
		System.out.println("�� " + getMultiple(scanNumber, 3) + "��");
		
	}
	
	public static int getMultiple(int inNumber,int inN) {
		int rtnCount = 0;
		List<Integer> aList = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
				
		if ( ( inNumber >= 3 && inNumber <= 3000 ) && ( inNumber % inN == 0 ) ) {
			for ( int i = 1 ; i <= inNumber / inN ; i++ ) {
				aList.add(i*inN);
			}
			for ( int i = 0 ; i < aList.size() ; i++ ) {
				for ( int j = 0 ; j < aList.size() ; j++ ) {
					for ( int k = 0 ; k < aList.size() ; k++ ) {
						if ( ( (aList.get(i) + aList.get(j) + aList.get(k)) == inNumber ) ) {
							sb.append(inNumber + " = " + aList.get(i) + " + " + aList.get(j) + " + " + aList.get(k) + ",\r\n");
							rtnCount++;
						}
					}
				}
			}
		} else {
			return 0;
		}
		
		
		if ( sb.length() > 0  ) {
			System.out.println(sb.substring(0,sb.length()-3));
		} 
		
		return rtnCount;
	}

}