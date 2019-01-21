package tct;

import java.util.Scanner;
public class TCT_20190121_LeeJoonWoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ������ �Է��ϼ���");
		System.out.println("����:4");
		
		String input = sc.next();
	    int materialCount = Integer.parseInt(input);
	    
	    System.out.println("�� ����� ��(��������)�� �Է��ϼ���. �޸��� �����ϼ���.");
		System.out.println("����:4,6,2,4");
	    
	    input = sc.next();
	    String fomulaCount[] = input.split(",");
	    
	    System.out.println("�̹� �� ����� ��(��������)�� �Է��ϼ���. �޸��� �����ϼ���.");
		System.out.println("����:6,4,2,4");
	    
	    input = sc.next();
	    String inputCount[] = input.split(",");
	    
	    //�Էµ� ������ �߿��� ���� ū���� ã��
	    int fomulaMax = 0;
	    int maxIndex = 0;
	    
	    for (int i =0; i<materialCount; i++) { 
			if (Integer.parseInt(fomulaCount[i]) > fomulaMax) { 
				fomulaMax = Integer.parseInt(fomulaCount[i]);  
			    maxIndex = i;
			}
		}
	    //�������� �ִ� ������� ã��
	    int successCount = 0;
	    int maxCommonIndex = 0;
	    //�Էµ� �������� �ִ밪��ŭ   ������Ű�鼭 �ִ������� ã��
	    for (int i =1; i<fomulaMax; i++) {
	    	for (int j=0; j<materialCount; j++){
	    		if(Integer.parseInt(fomulaCount[j])%i==0 ){
	    			successCount = successCount+1;
	    		}
	    		
	    		//������ ������ ����� �̸� �� ������ For ������ ������� �ִ� �����
	    		if(successCount/materialCount == 1){
	    			maxCommonIndex = i;
	    		}
	    		
	    	}
	    	successCount = 0;
		}
	    
	    
	    //���� ���� ������ ã��
	    int minFomulaCount[] = new int[fomulaCount.length];
	    for(int i=0; i<minFomulaCount.length; i++){
	    	minFomulaCount[i] = Integer.parseInt(fomulaCount[i])/maxCommonIndex;
	    }
	    		
	    //���� ���� �������� �ø��鼭 �̹� �Էµ�  P �� ��� ���� ������ �������� ��� �۾����� ù��° ������ ã�´�
	    int successIndex =0;
	    int allSuccessIndex =0;
	    for(int i=1; i<1000; i++){
	    	
	    	for (int j=0; j<materialCount; j++){
	    		if(minFomulaCount[j]*i >= Integer.parseInt(inputCount[j]) ){
	    			successIndex = successIndex+1;
	    		}
	    		
	    		//ó������ ��� �۾����� ���� ������  Index
	    		if(successIndex/materialCount == 1){
	    			allSuccessIndex = i;
	    			break;
	    		}
	    	} 
	    	successIndex = 0;
	    	if(allSuccessIndex > 0){
    			break;
    		}
	    }
	    
	    
        //ã�Ƴ� ������ �������� �̹� ������ P ���� ������ ��
	    String result = "";
	    for (int i =0; i<minFomulaCount.length; i++) { 
	    	minFomulaCount[i] = minFomulaCount[i]*allSuccessIndex - Integer.parseInt(inputCount[i]);
	    	result = result+" "+minFomulaCount[i];
		}
	
 		System.out.println("====================================");
	    System.out.println("result:"+result);
	    System.out.println("====================================");

	}

}
