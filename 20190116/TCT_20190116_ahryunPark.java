package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;


/**
 * ����
�ݼ��� ������ ���Ե� ȸ�縦 �ٴϰ� �߱��� �մϴ�. �߱��� �ϸ� �߱� �Ƿε��� ���Դϴ�. �߱� �Ƿε��� �߱��� ������ �������� ���� ���� �۾����� �����Ͽ� ���� ���Դϴ�. 
�������� N�ð� ���� �߱� �Ƿε��� �ּ�ȭ�ϵ��� ���� �̴ϴ�. 
�������� 1�ð� ���� �۾��� 1��ŭ�� ó���� �� �ִٰ� �� ��, ��ٱ��� ���� N �ð��� �� �Ͽ� ���� �۾��� works�� ���� �߱� �Ƿε��� �ּ�ȭ�� ���� �����ϴ� Code�� �ϼ����ּ���.

���� ����
works�� ���� 1 �̻�, 10 �̸��� �ڿ����� ������ �迭�Դϴ�.
N�� 12 ������ �ڿ����Դϴ�.

�Է�
works, N

���
works N �߱�����

����� ����
works	N	result
[4, 3, 3]	4	12
[2, 1, 2]	1	6
[1,1]	3	0

����� ���� ����
#1
n=4 �� ��, ���� ���� �۾����� [4, 3, 3] �̶�� �߱� ������ �ּ�ȭ�ϱ� ���� 4�ð����� ���� �� ����� [2, 2, 2]�Դϴ�. �� �� �߱� ������ 2^2 + 2^2 + 2^2 = 12 �Դϴ�.

#2
n=1�� ��, ���� ���� �۾����� [2,1,2]��� �߱� ������ �ּ�ȭ�ϱ� ���� 1�ð����� ���� �� ����� [1,1,2]�Դϴ�. �߱������� 1^2 + 1^2 + 2^2 = 6�Դϴ�.
 *
 */

public class TCT_20190116_ahryunPark{
	
	public static void main(String[] args) {
		
		
		//�ʱⰪ Setting
		int n = 4; //���� �ð�
		
		//���з�
		ArrayList<Integer> workList = new ArrayList<>();
		workList.add(4);
		workList.add(3);
		workList.add(3);
		Collections.sort(workList);
		
		int workSize = 3; 
		int tempWorkSize = workSize;
		
		if( (n>0) && (workList.size() > 0)){
			for(int inx = n ; inx > 0; inx--) {
				if(workList.get(tempWorkSize -1) != 0 ) {
					workList.set(tempWorkSize-1, workList.get(tempWorkSize-1)-1);
					
				}
				tempWorkSize--;
				if(tempWorkSize == 0) {
					tempWorkSize = workSize;
				}
			}
				
			
		
			//�� ���
			int resultSum = 0;
			for(int i=0; i< workList.size(); i++){
				if(workList.get(i) != 0) {
					double result = (double)workList.get(i);
					resultSum = resultSum + (int)Math.pow(result, result);
				}
				
			}
			
			System.out.println("�߱������� " + resultSum + "�Դϴ�.");

		}
		
		
	}

	

}

