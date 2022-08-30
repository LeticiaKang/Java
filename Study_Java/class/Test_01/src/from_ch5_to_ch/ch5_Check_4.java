package from_ch5_to_ch;

public class ch5_Check_4 {
	
	public static void main(String[] args) {
		
		int max = 0;
		int min= 0;
		int[] array = { 9, 5, 3, 8, 2 };  // 5
		
		for (int a = 0 ; a < (array.length-1) ; a++) {
			if ( array [a] < array [a+1] ) {
			//	max = array [a];
				min = array [a];
			}
		}
		
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
	}
}
