public class TCT_20190116_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testSet = {4,3,3};
		mansur(testSet,4);
		int[] testSet2 = {2,1,2};
		mansur(testSet2,1);
		int[] testSet3 = {1,1};
		mansur(testSet3,3);
	}
	
	private static void mansur(int[] tempTest,int n) {
		//Copy value
		int [] testSet;
		testSet = new int[tempTest.length];
		for ( int i = 0 ; i < testSet.length; i++) {
			testSet[i] = tempTest[i];
		}
		//�߱� �Ƿε� üũ ����
		/* 
		 *  1�� ���ҽ�Ű�� ���� ���� ��ŭ1�� ���ҽ�Ű�� �ּҰ��ΰ��� �ϳ��� ���ҽ�Ű�鼭 üũ�ϴ� ���� 
		 */
		int chkSumVal = 100000000;
		int tempSumVal = 0;
		int minusVal = 0;
		for ( int i = 0 ; i < n ; i++) {
			minusVal = 0 ; // �ʱ�ȭ
			//�߱� �Ƿε��� 0�϶� ���̻� �������� ����
			if ( chkSumVal == 0 ) {
				break;
			}
			// works������ŭ ��
			for ( int j = 0 ; j< testSet.length;j++) {
				//�߱��Ƿε� �ּ� �񱳰�
				tempSumVal = 0;	
				//1����
				if ( testSet[j] != 0) {
					testSet[j] = testSet[j]-1;
				}
				
				//������ �� ���ϱ�
				for ( int k = 0 ; k< testSet.length;k++) {
					tempSumVal += testSet[k] * testSet[k];
				}
				if ( chkSumVal >= tempSumVal) {
					chkSumVal = tempSumVal;
					minusVal = j;
				}
				//���� ����
				testSet[j] = testSet[j]+1;
			}
			//�ּҰ� ����
			testSet[minusVal] = testSet[minusVal] - 1;
		}
		
		//���
		System.out.print("[");
		for ( int i = 0 ; i < tempTest.length; i++) {
			System.out.print(tempTest[i]);
			if ( i != tempTest.length-1) {
				System.out.print(",");	
			}
		}
		System.out.println("] "+ n + " " + chkSumVal);
	}

}
