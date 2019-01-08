package com.lgcns.LCP01;

public class JungHyunSeok_20170209 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	    int a, b;
	    int arr[] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };
	    int range[][]={{3,7}, {4,6}, {5,5}};

	    for (int i = 0; i < range.length; i++){
	    	
	    	a = range[i][0];
	    	b = range[i][1];

			for(int j = 0; j < (b-a)/2; j++){
				int temp = arr[a-1+j];
				arr[a-1+j] =arr[b-1-j]; 
				arr[b-1-j] = temp;
			}
	    }

		System.out.print ("결과 : "+"[ ");
		
		for(int i=0; i<arr.length ; i++ ) {
			System.out.print (arr[i] + " " );

		}
		System.out.print ("]");
	}

}
/*
[2017.02.07] 오늘의 문제
오름차순으로 한 줄로 놓여있는 20장의 카드에 대해 10개의 구간이 주어지면, 
주어진 구간의 순서대로 아래의 규칙에 따라 순서를 뒤집는 작업을 연속해서 처리한 뒤 마지막 카드들의 배치를 구하는 프로그램을 작성하시오.
1부터 20까지 숫자가 하나씩 쓰인 20장의 카드가 오름차순으로 한 줄로 놓여있다. 
 각 카드의 위치는 카드 위에 적힌 숫자와 같이 1부터 20까지로 나타낸다.
  다음과 같은 규칙으로 카드의 위치를 바꾼다
  구간 [a,b] (단, 1≤a≤b≤20) 가 주어지면 위치 a부터 위치 b까지의 카드를 현재의 역순으로 놓는다.
  예를 들어, 구간이 [5,10]으로 주어진다면, 위치 5부터 위치 10까지의 카드 5,6,7,8,9,10을 역순으 로 하여 10,9,8,7,6,5로 놓는다. 
--> 그림순서 : 1,2,3,4,10,9,8,7,6,5,11,12,13,14,15,16,17,18,19,20.
  이 상태에서 구간 [9,13]이 다시 주어진다면, 위치 9부터 위치 13까지의 카드 6,5,11,12,13 을 역순으로 하여 13,12,11,5,6으로 놓는다. 
    --> 그림순서.: 1,2,3,4,10,9,8,7,13,12,11,5,6,14,15,16,17,18,19,20
 [출력 예시(3개 구간일 경우)]
 입력구간 :        
[3,7]
[4,6]
[5,5]      
 결과 : 최종 카드배치는 [1,2,7,4,5,6,3,8,9,10,11,12,13,14,15,16,17,18,19,20] 입니다.
 
 */


