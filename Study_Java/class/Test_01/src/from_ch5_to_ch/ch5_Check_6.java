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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNum = Integer.parseInt(sc.nextLine());
			
			// 1을 선택
			if (selectNum == 1) {
				System.out.print("학생 수 > ");
				// 학생수를 입력 받아 sN에 대입
				studentNum = Integer.parseInt(sc.nextLine());
				
				// score의 길이를 정함 "
				scores = new int[studentNum];
				
			}else if(selectNum == 2) {
				// 0학생, 1학생, 2학생 마다 각 위치에 값을 대입
				
				for (int x = 0; x<studentNum; x++) {
					System.out.print("scores[" + x + "] > " );
					scores[x] = Integer.parseInt(sc.nextLine());
				}
				
			}else if(selectNum == 3) {
				for (int y = 0; y<studentNum; y++) {
					System.out.print("scores[" + y + "] > " + scores[y] +"\n");
				}
				
			}else if(selectNum == 4) {
				// 합을 구하기전 초기화 설정
				double scores_sum = 0;
				int scores_max = 0;
				// 합을 구하면서 최대값도 같이 구하기!
				for (int z=0; z<studentNum; z++) {
					scores_sum += scores[z];
					// 최대값 구하기
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
				System.out.println("최고 점수 > " + scores_max);
				System.out.println("평균 점수 > " + avg);
				
			}else if(selectNum == 5)  {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
		
	}

}
