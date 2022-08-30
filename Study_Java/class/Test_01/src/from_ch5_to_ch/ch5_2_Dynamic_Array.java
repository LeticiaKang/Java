package from_ch5_to_ch;

public class ch5_2_Dynamic_Array {

	public static void main(String[] args) {

		int[][] scores = new int[2][3];
		// 행의 길이가 2, 열의 길이가 3인 2차원 행렬이 만들어짐
		// 초기값은 "0"
		for ( int a = 0; a < 2; a++) {
			for ( int b = 0 ; b < 3 ; b++ ) {
			System.out.println("(a,b) = " + "(" + a + "," + b + ")");
			System.out.println("값 : " + scores[a][b]);
			}
		}
				
// ==============================================================//
		/* 수학처럼 사각형 형태의 행렬이 아닌 다차원으로 생성 가능
		 * P.191
		 */
		
		int [][] matrix = new int[2][];
		matrix[0] = new int[2];
		matrix[1] = new int[3];
		
		/* array이름.length : 행의 개수
		 * array이름[0].length : 0행의 열의 개수
		 * array이름[1].length : 1행의 열의 개수
		 */
		
// ======= P.192 배열속 배열=======================================================//
		
		
		int[][] java = { {88, 95, 80, 90, 90}, {92, 96, 81} };
		
		/* 열의 개수 최대값 구하기
		
		int[] java_max_column;
		int max_column = 0;
		
		// 열의 개수를 모아두는 배열의 길이를 행의 개수로 지정
		java_max_column = new int[java.length];
		

		// 배열의 길이 만큼 반복문을 통해 인덱스에 배열 넣기
		for (int x=0; x<java.length; x++) {
			java_max_column[x] = java[x].length;
		}
		
		// java_max_column에서 최대값 찾기
		for (int y=0; y < (java_max_column.length - 1); y++) {
			if (java_max_column[y] >= java_max_column[y+1]) {
				max_column = java_max_column[y];
			}
		}
		
		System.out.printf("max_column : %d\n", max_column);
*/		
		
		int sum = 0;
		
		for (int x=0; x<java.length; x++) {
			for (int y=0; y<java[x].length ; y++) {
				sum += java[x][y];
			}
		}
		
		System.out.println("sum : " + sum);
		
		
		
		
		
		
		/*
		
		
		int[][] mathScores = new int[2][3];
		
		for(int i=0; i < mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="
						+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		System.out.println();		
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="
						+javaScores[i][k]);
			}
		}		


*/

	}

}
