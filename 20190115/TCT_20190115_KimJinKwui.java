import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * ����
	�Ǻ���ġ �����̶�, ù ��° ���� ���� 0�̰� �� ��° ���� ���� 1�� ��, ������ �׵��� ������ �� ���� ���� ������ �̷������ ������ ���Ѵ�.
	��) 0, 1, 1, 2, 3, 5, 8, 13
	��ǲ�� ���� n���� �޾�����, n ���ϱ����� �Ǻ���ġ ������ ����ϴ� ���α׷��� �ۼ��ϼ���
	
	�Է�
	�Ǻ���ġ ���� ���� �ִ� �� ���� n
	
	���
	n ���ϱ����� �Ǻ���ġ ���� ���
	
	����� ����
	���� �Է� 1
	n=1
	
	���� ��� 1
	0,1,1
	
	���� �Է� 2
	n=100
	
	���� ��� 2
	0,1,1,2,3,5,8,13,21,34,55,89
	
	���� �Է� 3
	n=500000
	
	���� ��� 3
	0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811
*/
public class TCT_20190115_KimJinKwui {
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		list.add(0);
		list.add(1);
		
		while ( fnPlus(list,n) );
	}
	
	public static boolean fnPlus(List<Integer> input , int n){
		
		int x = input.get(input.size()-1)+input.get(input.size()-2);
		
		if ( x <= n ) {
			input.add(x);
		} else {
			for ( int i = 0 ; i < input.size() ; i++ ) {
				if ( i != input.size()-1) {
					System.out.print(input.get(i) + ",");
				} else {
					System.out.print(input.get(i));
				}
			}
			return false;
		}
		
		return true;
	}

}
