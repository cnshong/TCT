package tct;

import java.util.Scanner;
public class TCT_20190116_LeeJoonWoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޸��� �����Ͽ� ���ڸ� �Է��ϼ���");
		
		String input = sc.next();
	    String data[] = input.split(",");
	    
	    int intialHours = Integer.parseInt(data[data.length-1]);
	    int hours = intialHours;
	    int works[] = new int[data.length-1];	
	    String worksStr = "";
	    
	    for(int i=0; i<works.length; i++){
	    	
	    	if(i==0){
	    	    worksStr = data[i];
	    	}else{
	    	    worksStr = worksStr+","+data[i];
	    	}
	    	works[i] = Integer.parseInt(data[i]);
	    }
	    
		int max = works[0];
		int maxIndex = 0;
		
		int result = 0;
		
		
		
		while(hours > 0){
		
			for (int i =0; i<works.length; i++) { 
				if (works[i] > max) { 
				    max = works[i];  
				    maxIndex = i;
				}
			}
			
			works[maxIndex] = works[maxIndex] -1;
			max = works[maxIndex];
			hours = hours-1;
			
		}
		
		for (int i =0; i<works.length; i++) { 
			
			result = result+(int) Math.pow( works[i], 2);
		}
		
		System.out.println("====================================");
	    System.out.println("result:["+worksStr+"] "+intialHours+" "+result);
	    System.out.println("====================================");
	}

}
