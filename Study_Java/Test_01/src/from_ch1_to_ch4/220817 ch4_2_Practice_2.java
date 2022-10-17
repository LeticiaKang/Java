package from_ch1_to_ch4;

public class ch4_2_Practice_2  {
	public static void main(String[] args) {

		int sum = 0;
		
		for ( int a = 1; a < 101; a++) {
			if ( a % 3 == 0) {
				sum += a;
			}
		}
		System.out.println("รัวี : "+ sum);
		
}}
