package tct;

import java.util.Scanner;
public class TCT_20190117_LeeJoonWoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		
	    int num = sc.nextInt();
	    int caseNum;
		int resultCnt;
		
		
		caseNum = num/3;
		
		resultCnt = ((caseNum - 1) * (caseNum - 2)) / 2;
	    
	
 		System.out.println("====================================");
	    System.out.println("result:"+resultCnt);
	    System.out.println("====================================");

	}

}
