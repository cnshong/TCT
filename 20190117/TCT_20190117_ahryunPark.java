package com.lgcns.exercise.plmtct;

public class TCT_20190117_ahryunPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190117_ahryunPark tct = new TCT_20190117_ahryunPark();
	       
		
		System.out.println(tct.getReuslt(9));
	    System.out.println(tct.getReuslt(15));
	    System.out.println(tct.getReuslt(18));
		

	}
	
	public int getReuslt(int input){
		
		int result = 0;
		if(input > 0 && input/3>2){
			int devid = input/3;
			
			//�ߺ��� ������� �ʴ� ����
			//3���� ���� �������� -1�� ���� ����
			
			
			for(int inx = devid-2; inx >0 ; inx--){
				result = result + inx;
			}
			
		}
		
		return result;
		
	}

}
