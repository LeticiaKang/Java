package from_ch5_to_ch;

public class ch5_Check_5 {

	public static void main(String[] args) {

		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for (int x=0; x<array.length; x++) {
			for (int y=0; y<array[x].length ; y++) {
				sum += array[x][y];
			}
		}
		
		// ����� ���� �ڵ����� ���ϱ�
		double ele_num = 0;
		for (int z=0; z<array.length; z++) {
			ele_num += array[z].length;
		}
		
		// ��� ���ϱ� (�� / ����� ����)
		// �Ҽ��� 2�ڸ������� �ݿø��ؼ� ����ϱ�
		avg =  Math.ceil((sum / ele_num) * 100) / 100;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.println("ele_num : " + ele_num);
		
	}

}
