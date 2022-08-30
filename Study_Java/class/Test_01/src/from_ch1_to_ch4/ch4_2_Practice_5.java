package from_ch1_to_ch4;

public class ch4_2_Practice_5 {

	public static void main(String[] args) {

		System.out.println("-------------1번째- 방법1---------------");
		String star = "" ;
		for ( int x = 1 ;  x < 5; x++ ) {
			star += "*";
			System.out.println(star);
		}

		System.out.println("-------------1번째- 방법2---------------");
		
		for ( int x = 1 ;  x < 5; x++ ) {
			for ( int y = 1 ;  y <= x; y++ ) {
				System.out.print("*");
				if ( x == y ) {
					System.out.println();
				}
			}
		
	}
		System.out.println("-------------2번째---------------");

		for ( int x = 4 ;  x > 0 ; x-- ) {
			for ( int y = 1 ;  y <= x ; y++ ) {
				System.out.print("*");
				if ( x == y ) {
					System.out.println();
				}
			}
		}
	
	System.out.println("-------------3번째---------------");
	
	for ( int x = 4 ;  x > 0 ; x-- ) {
		for ( int y = 1 ;  y <= 4 ; y++ ) {
			if ( y < x ) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
		
		
	}}
