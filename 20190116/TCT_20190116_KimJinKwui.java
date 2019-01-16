import java.util.Arrays;

/**
 * 
    ����
	�ݼ��� ������ ���Ե� ȸ�縦 �ٴϰ� �߱��� �մϴ�. �߱��� �ϸ� �߱� �Ƿε��� ���Դϴ�. 
	�߱� �Ƿε��� �߱��� ������ �������� ���� ���� �۾����� �����Ͽ� ���� ���Դϴ�. �������� N�ð� ���� �߱� �Ƿε��� �ּ�ȭ�ϵ��� ���� �̴ϴ�. 
	�������� 1�ð� ���� �۾��� 1��ŭ�� ó���� �� �ִٰ� �� ��, ��ٱ��� ���� N �ð��� �� �Ͽ� ���� �۾��� works�� ���� �߱� �Ƿε��� �ּ�ȭ�� ���� �����ϴ� Code�� �ϼ����ּ���.
	
	���� ����
	works�� ���� 1 �̻�, 10 �̸��� �ڿ����� ������ �迭�Դϴ�.
	N�� 12 ������ �ڿ����Դϴ�.
	
	�Է�
	works, N
	
	���
	works N �߱�����
	
	����� ����
	works	N	result
	[4, 3, 3]	4	12
	[2, 1, 2]	1	6
	[1,1]	3	0
	
	����� ���� ����
	#1
	n=4 �� ��, ���� ���� �۾����� [4, 3, 3] �̶�� �߱� ������ �ּ�ȭ�ϱ� ���� 4�ð����� ���� �� ����� [2, 2, 2]�Դϴ�. �� �� �߱� ������ 2^2 + 2^2 + 2^2 = 12 �Դϴ�.
	
	#2
	n=1�� ��, ���� ���� �۾����� [2,1,2]��� �߱� ������ �ּ�ȭ�ϱ� ���� 1�ð����� ���� �� ����� [1,1,2]�Դϴ�. �߱������� 1^2 + 1^2 + 2^2 = 6�Դϴ�.
 *
 */
public class TCT_20190116_KimJinKwui {
	static int[] works;
	static int n;
	
	public static void main(String[] args) {
		testCase();
		int angry = getAngry(works,n);
		System.out.println(Arrays.toString(works) + " " + n + " " + angry);
		
		testCase1();
		angry = getAngry(works,n);
		System.out.println(Arrays.toString(works) + " " + n + " " + angry);
		
		testCase2();
		angry = getAngry(works,n);
		System.out.println(Arrays.toString(works) + " " + n + " " + angry);
		
		testCase3();
		angry = getAngry(works,n);
		System.out.println(Arrays.toString(works) + " " + n + " " + angry);

	}
	
	public static void testCase() {
		works = new int[3];
		works[0] = 4;
		works[1] = 3;
		works[2] = 3;
		n=4;
	}
	
	public static void testCase1() {
		works = new int[3];
		works[0] = 2;
		works[1] = 1;
		works[2] = 2;
		n=1;
	}
	
	public static void testCase2() {
		works = new int[2];
		works[0] = 1;
		works[1] = 1;
		n=3;
	}
	
	public static void testCase3() {
		works = new int[2];
		works[0] = 9;
		works[1] = 1;
		n=7;
	}
	
	public static int getAngry(int[] inWorks,int inN) {
		int rtnAngry = 0;
		int[] copyInworks = Arrays.copyOf(inWorks, inWorks.length);
		
		while ( inN > 0 ) {
			Arrays.sort(copyInworks);
			if ( copyInworks[copyInworks.length-1] > 0 ) {
				copyInworks[copyInworks.length-1] = copyInworks[copyInworks.length-1] - 1;
			}
			inN--;
		}
		
		for ( int p : copyInworks ) {
			rtnAngry += Math.pow(p, 2);
		}
		
		return rtnAngry;
	}

}
