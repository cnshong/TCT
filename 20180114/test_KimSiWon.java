/*
���ڿ� ���� �˰��� (LCP ���⹮��)
���ڿ��� �Է¹޾Ƽ�, ���� ���ڰ� ���������� �ݺ��Ǵ� ��쿡 �� �ݺ� Ƚ���� ǥ���Ͽ� ���ڿ��� �����ϱ�.
��, �ѹ��� �ݺ��Ǵ� ���ڴ� ���� ����  �״�� ǥ���Ұ� 
�Է� ����: aaabbcccccca
��� ����: a3b2c6a
�Է� ����: abbcccccca
��� ����: ab2c6a
�Է� ����: apple
��� ����: ap2le
 */
public class Kimsiwon_20170117 {

	public static void main( String[] args ){
		
		String input = "abbcccccca"; //aaabbcccccca    abbcccccca    apple
		
		String output = "";
		
		output = run(input);
		
		System.out.println("input: " + input + " / output: " + output);
		
	}
	
	public static String run(String input){
		String result = "";
		String tmpString = input.substring(0, 1);
		int tmpCount = 0;
		
		for (int idx = 0; idx < input.length(); idx++){
			if(tmpString.equals(input.substring(idx, idx+1))){
				tmpCount = tmpCount + 1;
			}
			else{
				if(tmpCount > 1){
					result = result.concat(tmpString.concat(String.valueOf(tmpCount)));
				}else{
					result = result.concat(tmpString);
				}
				tmpCount = 1;
				tmpString = input.substring(idx, idx+1);
			}
			
		}
		
		if(tmpCount>1){
			result = result.concat(tmpString.concat(String.valueOf(tmpCount)));
		}else{
			result = result.concat(tmpString);
		}
		
		
		return result;
	}
	
}