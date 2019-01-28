package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * �־��� ���ڵ� �� Ȧ�������� ������ XOR ���� �� ���ϱ�
 *
 */
public class TCT_20190123_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190123_ahryunPark tct = new TCT_20190123_ahryunPark();
		
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("�� �ڿ��� ������ �Է��ϼ���");
    	int totalSize = sc.nextInt();
    	
        System.out.println("N ���� ���ڵ��� �Է��ϼ���(,�� �����ϼ���)");
        String sInput = sc.next();
        String[] input = sInput.split(",");
        if ( input.length != totalSize ) {
        	System.err.println("�� �ڿ��� ������ �Է��� N ���� ������ ������ ��ġ���� �ʽ��ϴ�.");
        } else {
        	System.out.println("����� : " + tct.getReuslt(input));
        }
		
		
//		int n = 4;
//		int[] input = {2,5,3,3};
//		int[] input = {2,5,5,3,3,3};
//		System.out.println(tct.getReuslt(input));

	}
	
	
	public int getReuslt(String[] input){
		
		int result = 0;
		//Ȧ���� �ڿ��� ���� �� XOR ���� 
		int count = 1;
		for(int inx = 0; inx < input.length; inx++) {
			
			if(inx != input.length-1) {
				if( (input[inx].equals(input[inx+1]))) {
					count++;
				}else {
					if(count%2 != 0) {
						//XOR ���� 
						result ^= Integer.valueOf(input[inx]);
					}
					count = 1;
				}
			}else {
				if(count%2 != 0) {
					//XOR ���� 
					result ^= Integer.valueOf(input[inx]);
				}
			}
		}

		return result;
		
	}

}
