import java.util.Scanner;

public class TCT_20190117_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�Է� : ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("��� : " + checkResult(a));
		
		
		
	}
	
	private static int checkResult(int n) {
		int result = 0;
		int chkVal = 0;
		
		//n�� üũ 3�� ������� Ȯ�� 
		if ( n%3 != 0) {
			result = -1 ;
			return result;
		} else if ( n > 3000) {
			result = -1 ;
			return result;
		} else {
			 chkVal = n/3;
		}
		
		for ( int firstVal = 1 ; firstVal < chkVal ; firstVal++ ){
			for ( int secondVal = 1 ; firstVal+secondVal < chkVal; secondVal++) {
				if ( chkVal-firstVal+secondVal >=1 ) {
					result++;
				}
			}
		}
		
		return result;
	}

}
