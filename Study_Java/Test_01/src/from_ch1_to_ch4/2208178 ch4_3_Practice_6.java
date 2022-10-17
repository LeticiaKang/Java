package from_ch1_to_ch4;

public class ch4_3_Practice_6 {

	public static void main(String[] args) {

		for ( int x = 1; x < 5; x++ ) {
			for ( int y = 4; y > 0; y--) {
				if ( x < y ) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();

		String star = "" ;
		for ( int x = 1 ;  x < 5; x++ ) {
			star += "*";
			System.out.printf("%4s\n", star);
		}

		
	}
}
