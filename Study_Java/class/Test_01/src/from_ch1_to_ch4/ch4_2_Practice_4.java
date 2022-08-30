package from_ch1_to_ch4;

public class ch4_2_Practice_4 {

	public static void main(String[] args) {
		
		for ( int x = 1 ; x < 11 ; x++ ) {
			for ( int y = 1 ; y < 11 ; y++ ) {
				if ((4 * x + 5 * y) == 60) {
					System.out.printf("ÇØ : (%d, %d)\n", x, y);
				}
			}
		}

	}

}
