package tct;

import java.util.ArrayList;
import java.util.Scanner;
public class TCT_20190124_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¦���� �Է��ϼ���.");
        System.out.println("����:4");
        
        int input = sc.nextInt();
        
        
        int i = 2; // i : ���� ���

        boolean isPrime = true;        
        ArrayList<Integer> primeList = new ArrayList();
        
        //�Է¹��� ���� �̷�� ��� �Ҽ��� �����Ѵ�.
        while(i <= input){
            isPrime = true;
            
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    isPrime = false;
                }
                continue;
            }
            if (isPrime == true){
            	primeList.add(i);
            }
            i++;
        }
        int selectedPrime =0;
        
        ArrayList firstAnswerList = new ArrayList();
        ArrayList secondAnswerList = new ArrayList();
        for(int j=1; j<=primeList.size(); j++){
            selectedPrime = primeList.get(primeList.size()-j);
            for(int k=0; k <primeList.size(); k++ ){
                if(primeList.get(k)+selectedPrime == input){
                    firstAnswerList.add(primeList.get(k));
                    secondAnswerList.add(selectedPrime);
                }                
            }
        }
        
        int minValue = input;
        String result = "";
        //���̰� ���� ���� �Ҽ��� ���� ã�´�.
        for(int a=0; a<firstAnswerList.size(); a++){
            if(Math.abs((Integer)firstAnswerList.get(a)-(Integer)secondAnswerList.get(a))< minValue){
            	minValue = Math.abs((Integer)firstAnswerList.get(a)-(Integer)secondAnswerList.get(a));
            	
            	result = firstAnswerList.get(a)+" "+secondAnswerList.get(a);
            }
        }

        
    
        System.out.println("===================================="); 
        System.out.println("result:"+result);
        System.out.println("====================================");

    }

}
