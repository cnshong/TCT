package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * ����
	����� �� ������ �־����� ��, ��ҹ��� ���о��� ���� ���� ���� ���ĺ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٺ��� ���� ������ �־�����.
	���� �ִ� 5000���ڷ� �����Ǿ� �ְ�, ����, ���ĺ�, Ư������, ���ͷθ� �̷���� �ִ�.
	�׸��� ��� �ϳ��� ���ĺ��� �ִ�.
	
	[case1]
	I think I'm lost.
	[case2]
	I think I'm lost.I can't tell.
	[case3]
	I think I'm lost. I can't tell what's where.
	
	���
	���� ���� ���� ���ĺ��� �� Ƚ���� ����Ѵ�.
	���� ���� ���� ���ĺ��� �������� ��� ���ĺ�������� ��� ����Ѵ�.
	
	[case1]
	���帹�� ���� ���ĺ� : i = 3ȸ
	[case2]
	���帹�� ���� ���ĺ� : i, t = 4 ȸ
	[case3]
	���帹�� ���� ���ĺ� : t = 5 ȸ
 *
 */
public class TCT_20190128_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190128_ahryunPark tct = new TCT_20190128_ahryunPark();
		
		String input1 = "I think I'm lost.";
		String input2 = "I think I'm lost.I can't tell.";
		String input3 = "I think I'm lost. I can't tell what's where.";
		
		System.out.println(tct.getReuslt(input1));
		System.out.println(tct.getReuslt(input2));
		System.out.println(tct.getReuslt(input3));
    	
		

	}
	
	
	public String getReuslt(String input){
		
		String msg = "";
		
		//Input �� �ƽ�Ű�ڵ�� ��ȯ�Ͽ� sorting �Ͽ� List
		input = input.toLowerCase();
		char[] charList = input.toCharArray();
		ArrayList<Integer> textList = new ArrayList<>();
		for(int inx = 0 ; inx < charList.length; inx++) {
			int temp = (int)charList[inx];
			if(temp >= 97 && temp <= 122) {
				textList.add((int)charList[inx]);
			}
			
		}
		Collections.sort(textList);
		
		//int �迭�� �ƽ�Ű�ڵ尪�� count�ϸ鼭 max �� ���ϱ�
		int max = 0;
		int[] result = new int[123];
		for(int inx = 0 ; inx < textList.size(); inx++) {	
			result[textList.get(inx)]++; //= result[textList.get(inx)]+1;
			
			if(inx != 0 && !textList.get(inx).equals(textList.get(inx-1))) {
				if(max < result[textList.get(inx-1)]) {
					max = result[textList.get(inx-1)];
				}
			}
				

		}
		
		//max���϶��� ����ϱ� 
		for(int inx = 0 ; inx <result.length; inx++ ) {
			if(result[inx] == max) {
				char a= (char)inx;
				msg = msg + a + " ";
			}
		}
		
			msg = "���帹�� ���� ���ĺ� : " + msg + " = " + String.valueOf(max) + "ȸ";
			

		return msg;
		
	}

}
