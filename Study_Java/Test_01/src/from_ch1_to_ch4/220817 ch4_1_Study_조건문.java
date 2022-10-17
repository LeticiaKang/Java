package from_ch1_to_ch4;

public class ch4_1_Study_조건문 {

	public static void main(String[] args) {
	/* ◀ 난수 생성 ▶
		 [ (Math.random() * 범위 최대값(미만)) + 시작을 원하는 값(양변 동일 적용) ]메소드를 사용 
		 document.write(Math.random()) : 소수점 이하 많은 자리수의 난수 생성
	*/
		int time = (int) (Math.random() * 3) +8;
		System.out.println("[time : " + time + "시]" );
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");               // ★ break가 없기 때문
		case 9:																// 조건에 맞는 case부터 차례로 출력
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 합니다.");
		default:
			System.out.println("case가 없으면 실행");
		}
		System.out.println("----------------------------");
		
		int time2 = (int) (Math.random() * 3) +8;
		System.out.println("[time2 : " + time + "시]" );
		switch(time2) {
		case 8:
			System.out.println("출근합니다.");				 // ★break가 있어서 
			break;															// case 조건에 맞는 출력문만 출력
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 합니다.");
			break;
		default:
			System.out.println("case가 없으면 실행");
			break;
		}
		System.out.println("----------------------------");
		
// ◀ If-else If-else문 ▶
		int score = 85;
		
		if (score >= 90) {
			System.out.println("점수가 100~90점 사이입니다.");
			System.out.println("등급 A입니다");
		} else if(score >= 80) {
			System.out.println("점수가 80~89점 사이입니다.");
			System.out.println("등급은 B입니다.");
		} else {
			System.out.println("점수가 80점 미만입니다.");
			System.out.println("등급은 C입니다.");
		}
		System.out.println("----------주사위 번호 생성 연습(if)-----------");

		int number = (int) (Math.random() * 6) + 1;
		System.out.println("number : "+ number);
		
		if (number == 1) {
			System.out.println("1 입니다.");
		}else if (number == 2) {
			System.out.println("2 입니다.");
		}else if (number == 3) {
			System.out.println("3 입니다");
		}else if (number == 4) {
			System.out.println("4 입니다.");
		}else if (number == 5) {
			System.out.println("5 입니다.");
		}else {
			System.out.println("6 입니다.");
		}

		System.out.println("----------직급별 월급 안내문(switch)-----------");
		String[] rank = {"부장" , "과장", " 사원"};
		double random = (Math.random() * (rank.length-1));
		int num = (int) Math.round(random);
		
		switch(rank[num]) {
			case "부장":
				System.out.println("700만원");
			break;
			case "과장":
				System.out.println("500만원");
			break;
			default:
				System.out.println("300만원");
			break;
		}
		System.out.println("검증용 : " + rank[num]);

		System.out.println("----------메뉴 선정----------");
		String[] menu = {"메밀", "돈가스",  "마라탕",  "파스타", "미정국수", "초밥",  "쭈꾸미",  "칼국수",  "쌀국수", "오늘의 메뉴(진심식탁)"};
		double today = Math.floor((Math.random() * (menu.length)));
		int today_int = (int) today;
		System.out.printf("오늘 메뉴는 %s입니다!\n", menu[today_int]);
	
	}

}
