package from_ch5_to_ch;

import java.util.*;

public class ch5_Check_6 {

	public static void main(String[] args) {

		boolean run = true;
		
		int studentNum = 0;
		int[] scores = null;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------------------------");
			System.out.print("����> ");

			int selectNum = Integer.parseInt(sc.nextLine());
			
			// 1�� ����
			if (selectNum == 1) {
				System.out.print("�л� �� > ");
				// �л����� �Է� �޾� sN�� ����
				studentNum = Integer.parseInt(sc.nextLine());
				
				// score�� ���̸� ���� "
				scores = new int[studentNum];
				
			}else if(selectNum == 2) {
				// 0�л�, 1�л�, 2�л� ���� �� ��ġ�� ���� ����
				
				for (int x = 0; x<studentNum; x++) {
					System.out.print("scores[" + x + "] > " );
					scores[x] = Integer.parseInt(sc.nextLine());
				}
				
			}else if(selectNum == 3) {
				for (int y = 0; y<studentNum; y++) {
					System.out.print("scores[" + y + "] > " + scores[y] +"\n");
				}
				
			}else if(selectNum == 4) {
				// ���� ���ϱ��� �ʱ�ȭ ����
				double scores_sum = 0;
				int scores_max = 0;
				// ���� ���ϸ鼭 �ִ밪�� ���� ���ϱ�!
				for (int z=0; z<studentNum; z++) {
					scores_sum += scores[z];
					// �ִ밪 ���ϱ�
					if (scores_max <= scores[z]) {
						scores_max = scores[z];
					}
				}
				
/*				for (int i = 0; i < scores.length; i++) {
*					scores_max = (scores_max < scores[i]) ? scores[i] : scores_max ;
*					scores_sum += scores[i];
*				}
*/				
				double avg = (scores_sum / (double) studentNum);
				System.out.println("�ְ� ���� > " + scores_max);
				System.out.println("��� ���� > " + avg);
				
			}else if(selectNum == 5)  {
				run = false;
			}
			
		}
		System.out.println("���α׷� ����");
		
	}

}
