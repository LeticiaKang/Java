package from_ch1_to_ch4;

import java.util.Scanner;

public class ch_3_2_ractice_������{

	public static void main(String[] args) {

// 4��
		int pencils = 534;
		int students = 30;
		
		// ???? 1�??? �?�??? ?��?? �???
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// ?��?? ?��?? �???
		int pencilsLeft = pencils - (pencilsPerStudent * students);
		System.out.println("4�? : " + pencilsLeft);
		
// 5��
		int var1 = 5;
		int var2 = 2;
		double var3 = (double) var1 / var2;
	//	double var3 = var1 / (double) var2;
		int var4 = (int) (var3 * var2);
		System.out.println("5�? : " + var4);
		
// 6��
		int value = 356;
		System.out.println( "6�? 방�?1 : " + (value - 56) );
		

		int v = 365;
		int v11 = v / 100 * 100;
		System.out.println("6�? 방�?2 : " + v11);
		
		
// 7��
		float v1 = 10f;
		double v2 = (double) v1 / 100 ;
		if (v2 == 0.1) {
			System.out.println("7�? : " + "10%??????.");
		} else {
			System.out.println("7�? : " + "10%�? ????????.");
		}

// 8��
		int lengthTop = 5;
		int height = 7;
		int lengthBottom = 10;
		double area = (double) (lengthBottom + lengthTop)/2 * height;
		System.out.println("8�? : " + area);
					
// 9��
		Scanner sc = new Scanner(System.in);
		/*		
		System.out.print("�? �?�? ??: ");
		double one = sc.nextDouble();
		
		System.out.print("?? �?�? ??: ");
		double two = sc.nextDouble();
				
	//	String result = (two == 0.0) ? "무�????" :  String.valueOf(one / two);
		
	if ( two == 0.0) {
			System.out.println("9�? : 결과 : 무�????");
		} else {
			System.out.println("9�? : 결과 : " + one / two);
		};
		
//		System.out.println("9�? : 결과: " + result);
	*/	
// 10��
		int c1 = 10;
		int c2 = 3;
		int c3 = 14;
		double c4 = c1 * c1 * Double.parseDouble(c2 + "." + c3);
		System.out.println("10�? : ???? ???? : " + c4);
		
		
// 11��
		
		System.out.print("???��??: ");
		String name = sc.nextLine();

		System.out.print("?��?��????: ");
		String pw_str = sc.nextLine();
		int pw_int = Integer.parseInt(pw_str);
		
		String ID = "java";
		/*		
		if (name.equals(ID)) {
			if (pw_int == 12345) {
				System.out.println("�?그�?? ?�공!");
			}else {
				System.out.println("�?그�?? ?��?? : ?��?��???? ??�?");
		}
		}else {
			System.out.println("�?그�?? ?��?? : ???��?? 존�?��??�? ????");
		}
*/
		if (name.equals(ID)) {
			String result1 = (pw_int == 12345) ? "�?그�?? ?�공" : "�?그�?? ?��??! ?��?��???? ??�?"; 
			System.out.println(result1);
		}else {
			System.out.println("�?그�?? ?��??! ???��?? 존�?��??�? ????");
		}
		

		
		}
	}

