package tct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
public class TCT_20190122_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("��ü ��ܼ��� �Է��ϼ���.");
        System.out.println("����:4");
        
        String input = sc.next();
        int stepCount = Integer.parseInt(input);
        
        System.out.println("����� ���� �Է��ϼ���. �޸��� �����ϼ���.");
        System.out.println("����:10,20,15,25,10,20");
        
        input = sc.next();
        String stepValue[] = input.split(",");
        
        //���õ� Step�� ������ �Է���
        HashMap selectedStepCount = new HashMap();
        //Skip�� Step�� ������ �Է���
        HashMap skippedStepCount =  new HashMap();
        
        
        
        /* ����� Max ������ ������ �ϵ��� �ϰ� �� �Ʒ� ������� ��� ���õǾ� ������ �������� ���ϰ� Skip ��*/
        boolean selectedStep = true;
        boolean skippedStep = true;
        int stepMaxValue =0;
        int stepMaxValueIndex=0;
        
        //������ ����� ������ ���õǵ��� ��
        selectedStepCount.put(stepCount-1, stepValue[stepCount-1]);
        
        while(true){
            for(int i=0; i< stepCount; i++){
                for(int j=0; j< selectedStepCount.size(); j++){
                    if( selectedStepCount.size() > 0 && selectedStepCount.get(i) != null){
                        selectedStep = false;
                    }
                }
                for(int k=0; k< skippedStepCount.size(); k++){
                    if( skippedStepCount.size() > 0 && skippedStepCount.get(i)!= null){
                        skippedStep = false;
                    }
                }
                
                if(selectedStep && skippedStep){
                    if (Integer.parseInt(stepValue[i]) > stepMaxValue) { 
                        stepMaxValue = Integer.parseInt(stepValue[i]);  
                        stepMaxValueIndex = i;
                    }
                }
                selectedStep  = true;
                skippedStep = true;
            }
            //�� �Ʒ��� ���õ� ��� ���� �̹� ������ Skip��
            if(selectedStepCount.get(stepMaxValueIndex-1) != null &&  selectedStepCount.get(stepMaxValueIndex+1) != null ){
                skippedStepCount.put(stepMaxValueIndex, Integer.toString(stepMaxValue));
            }else{
                //�� �Ʒ� ���߿� �ϳ��� ����� �ִ� ��� ���ð��� �ֵ��� ��
                selectedStepCount.put(stepMaxValueIndex, Integer.toString(stepMaxValue));
            }
            stepMaxValue = 0;
            //��� ����� ���õǰų�   Skip �Ǹ� ����ϴ�.
            if((selectedStepCount.size() + skippedStepCount.size()) == stepCount){
                break;
            }
            
        }
        
        int result=0;
        int count=0;
        
        //���õ� ����� ���� ���մϴ�.
        Collection values = selectedStepCount.values();
        Object[] valueInt = values.toArray();
        for(int i=0; i< valueInt.length; i++){
            count = Integer.parseInt( (String)valueInt[i]);
            result = result + count;
                        
        }
    
        System.out.println("===================================="); 
        System.out.println("result:"+result);
        System.out.println("====================================");

    }

}
