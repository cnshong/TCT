import java.io.IOException;
import java.util.ArrayList;



public class AhryunPark_20170213 {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/**
		[2017.02.13] 오늘의 문제
		어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
		
		예를 들어
		
		d(91) = 9 + 1 + 91 = 101
		이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
		
		어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다. 
		그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다. 
		예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
		
		1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.

		*/
		
		ArrayList<Integer> generatorList = new ArrayList<Integer>();
		for(int i = 0 ; i < 5000; i++){
			generatorList.add(i+1);
		}
		
		for(int i = 1 ; i <= 5000; i++){
			int genNum = generate(i);
			for(int j = 0; j < generatorList.size(); j++){
				if(genNum == generatorList.get(j)){
					generatorList.remove(j);
				}
			}
		}
		
		int selfNumberSum = 0;
		if(generatorList.size() > 0){
			for(int i = 0; i < generatorList.size(); i++){
				selfNumberSum += generatorList.get(i);
			}
		}
		
		System.out.println( " Sum of Self Number is " + selfNumberSum ); // 1227365
	
	}
	
	
	public static int generate(int num){
		
		String generateStr = String.valueOf(num);
		int totalNum = 0;
		
		if(generateStr.length() > 0){
			for(int i = 0 ; i <generateStr.length(); i++){
				totalNum += Integer.parseInt(generateStr.substring(i, i+1));
			}
			totalNum += num;
		}
		
		return totalNum;
	}
	
	
	

	
}

