package from_ch5_to_ch;

public class ch5_2_Array {

	public static void main(String[] args) {

System.out.println("------P.180 연습------\n");
		
		int[] score = { 83, 90, 87 };
		
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2] + "\n");
		
		int sum_score = 0;
				
		for( int a=0; a < 3; a++ ) {
			sum_score += score[a];
		}
		
		System.out.println("총 합 : " + sum_score);
		
		double aver_score = (double) sum_score / score.length;
//		double aver_score = (double) sum_score / 3.0;
		
		aver_score = Math.ceil(aver_score * 100) / 100;
		// 소수점 2번째 자리 표현 방법 : 100을 곱하고 (반)올림, 버림 후 100 나눔
		
		System.out.println("평균 : " + aver_score + "\n");
		
System.out.println("------P.180 연습2------\n");

		int[] score_2 = { 83, 90, 87, 75, 84 };
		
		System.out.println("score_2[0] : " + score_2[0]);
		System.out.println("score_2[1] : " + score_2[1]);
		System.out.println("score_2[2] : " + score_2[2]);
		System.out.println("score_2[3] : " + score_2[3]);
		System.out.println("score_2[4] : " + score_2[4] + "\n");
		
		int sum_score_2 = 0;
				
		for( int a=0; a < score_2.length ; a++ ) {
			sum_score_2 += score_2[a];
		}
		
		System.out.println("총 합 : " + sum_score_2);
		
		double aver_score_2 = (double) sum_score_2 / (double) score_2.length;
		
		aver_score_2 = Math.ceil(aver_score_2 * 100) / 100;
		// 소수점 2번째 자리 표현 방법 : 100을 곱하고 (반)올림, 버림 후 100 나눔
		
		System.out.println("평균 : " + aver_score_2 + "\n");

System.out.println("------P.182 연습------\n");

		int [] ex_1;
		ex_1 = new int[] { 83, 90, 87 };
		int sum_ex_1 = 0;
		for(int a = 0; a < 3; a++) {
			sum_ex_1 += ex_1[a];
		}
		
		System.out.println("총합 : " + sum_ex_1);
		
		int sum2_ex_1 = add ( new int[] { 83, 90, 97 });
		System.out.println("총합 : " + sum2_ex_1);
		
		System.out.println("------------------");
		}
		
		public static int add(int[] ex_1) {
			int sum3_ex_1 = 0;
			for (int a = 0; a < 3; a++) {
				sum3_ex_1 += ex_1[a];
			}
			
			return sum3_ex_1;
			
			
		}
	
}
