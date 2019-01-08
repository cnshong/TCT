package helper;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : DomHelper.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2015. 1. 17.  yongsik1.kim   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : DomHelper
 * Description : TODO
 * </pre>
 *
 * @author yongsik1.kim
 */
public class LeeJinKyoung20170209 {

    /*
오름차순으로 한 줄로 놓여있는 20장의 카드에 대해 10개의 구간이 주어지면, 주어진 구간의 순서대로 아래의 규칙에 따라 순서를 뒤집는 작업을 연속해서 처리한 뒤 마지막 카드들의 배치를 구하는 프로그램을 작성하시오.
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
 결과 : 최종 카드배치는 [1,2,3,4,10,9,8,7,13,12,11,5,6,14,15,16,17,18,19,20] 입니다.
    */
   public static int path[];

   public static void main(String[] args) throws Exception{

       int source[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
       int input1[] = new int[]{3,7};
       int input2[] = new int[]{4,6};
       int input3[] = new int[]{5,5};

       int target[] = new int[source.length];

       target = reverse(source, input1[0]-1, input1[1]-1);

       print(target);

       target = reverse(target, input2[0]-1, input2[1]-1);

       print(target);

       target = reverse(target, input3[0]-1, input3[1]-1);

       print(target);
   }

   private static void print(int[] target){
       System.out.print("[ ");
       for(int i = 0; i < target.length; i++){
           System.out.print(target[i] + " ");
       }
       System.out.println(" ]");
   }

   private static int[] reverse(int[] source, int start, int end){
       int target[] = new int[source.length];

       for(int i = 0; i < source.length; i++){
           if(i < start || i > end) {
               target[i] = source[i];
           } else {
              target[i] = source[end - (i - start)];
           }
       }
       return target;
   }

}
