package from_ch5_to_ch;

public class ch5_2_New_Array_heap {

	public static void main(String[] args) {

		// score라는 Array 생성
		int[] score ;
		System.out.println();
		
		// 길이를 20이라 지정하고 각 인덱스 값은 0
		score = new int[20];
		
		// 0번째 값을 88이라고 한다.
		score[0] = 88;
		
		// 확인을 위해 0부터 20까지 출력한다.
		for ( int a = 0; a < 20 ; a++) {
			System.out.printf("score[%d] : %s\n", a,score[a]);
			
		}
		
		/* 새로운 배열을 만들어주는데, 길이는 3이고 값을 넣어줌
		 기존에 길이 20의 배열의 힙은 사용하기 않게 됨 
		 → p.174에 쓰레기 객체가 됨
		 
		 최초의 score라는 스택영역이 만들어짐 
		 score라는 스택에 길이 20인 힙이 만들어짐(이하 힙1 이라지칭)
		 동일한 스택에 길이가 3인 새로운 힙을 만듦
		 힙1은 쓰레기 객체로 자동으로 삭제
		*/
		score = new int[] { 25, 30, 50};
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[0]);
		
		
	}

}
