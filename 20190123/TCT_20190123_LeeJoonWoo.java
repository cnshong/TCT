package tct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class TCT_20190123_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("��ü �� ������ �Է��ϼ���.");
        System.out.println("����:4");
        
        int input = sc.nextInt();
        int  numCount = input;
        
        System.out.println("���ڸ� �Է��ϼ���.");
        int inputValue[] = new int[numCount];
        for(int i=0; i<numCount; i++){
        	input = sc.nextInt();
        	inputValue[i] = input;
        }
        
        
        //���õ� �� ���ڰ� ��� ���Դ��� �����ϴ�  Map
        HashMap<Integer, Integer> countedMapList = new HashMap<Integer, Integer>();
        
        
        //Ư�� ���ڰ� ����� ���Դ���  Map�� ����
        for(int i=0; i< numCount; i++){
            if(countedMapList.get(inputValue[i]) != null){
            	countedMapList.put(inputValue[i], countedMapList.get(inputValue[i])+1);
        	}else{
        		countedMapList.put(inputValue[i], 1);
        	}
        }
        
        Set<Integer> keySet = countedMapList.keySet();
        Object keySetArray[] = keySet.toArray();
        //¦���� ���� ����  Map���� ����
        for(int i=0; i< keySetArray.length; i++ ){
           if(countedMapList.get(keySetArray[i])%2==0){
        	   countedMapList.remove(keySetArray[i]);
           }
        }
        
        keySet = countedMapList.keySet();
        Object oddKeySetArray[] = keySet.toArray();
        
        int result=0;
        //Ȧ���� ���� ���� XOR ������
        for(int i=0; i< oddKeySetArray.length; i++ ){
            
            result = result^(Integer)oddKeySetArray[i];
         }
        
    
        System.out.println("===================================="); 
        System.out.println("result:"+result);
        System.out.println("====================================");

    }

}
