package from_ch1_to_ch4;

import java.util.Scanner;

public class ch_3_2_ractice_¿¬»êÀÚ{

	public static void main(String[] args) {

// 4¹ø
		int pencils = 534;
		int students = 30;
		
		// ???? 1ëª??? ê°?ì§??? ?°í?? ê°???
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// ?¨ì?? ?°í?? ê°???
		int pencilsLeft = pencils - (pencilsPerStudent * students);
		System.out.println("4ë²? : " + pencilsLeft);
		
// 5¹ø
		int var1 = 5;
		int var2 = 2;
		double var3 = (double) var1 / var2;
	//	double var3 = var1 / (double) var2;
		int var4 = (int) (var3 * var2);
		System.out.println("5ë²? : " + var4);
		
// 6¹ø
		int value = 356;
		System.out.println( "6ë²? ë°©ë?1 : " + (value - 56) );
		

		int v = 365;
		int v11 = v / 100 * 100;
		System.out.println("6ë²? ë°©ë?2 : " + v11);
		
		
// 7¹ø
		float v1 = 10f;
		double v2 = (double) v1 / 100 ;
		if (v2 == 0.1) {
			System.out.println("7ë²? : " + "10%??????.");
		} else {
			System.out.println("7ë²? : " + "10%ê°? ????????.");
		}

// 8¹ø
		int lengthTop = 5;
		int height = 7;
		int lengthBottom = 10;
		double area = (double) (lengthBottom + lengthTop)/2 * height;
		System.out.println("8ë²? : " + area);
					
// 9¹ø
		Scanner sc = new Scanner(System.in);
		/*		
		System.out.print("ì²? ë²?ì§? ??: ");
		double one = sc.nextDouble();
		
		System.out.print("?? ë²?ì§? ??: ");
		double two = sc.nextDouble();
				
	//	String result = (two == 0.0) ? "ë¬´í????" :  String.valueOf(one / two);
		
	if ( two == 0.0) {
			System.out.println("9ë²? : ê²°ê³¼ : ë¬´í????");
		} else {
			System.out.println("9ë²? : ê²°ê³¼ : " + one / two);
		};
		
//		System.out.println("9ë²? : ê²°ê³¼: " + result);
	*/	
// 10¹ø
		int c1 = 10;
		int c2 = 3;
		int c3 = 14;
		double c4 = c1 * c1 * Double.parseDouble(c2 + "." + c3);
		System.out.println("10ë²? : ???? ???? : " + c4);
		
		
// 11¹ø
		
		System.out.print("???´ë??: ");
		String name = sc.nextLine();

		System.out.print("?¨ì?¤ì????: ");
		String pw_str = sc.nextLine();
		int pw_int = Integer.parseInt(pw_str);
		
		String ID = "java";
		/*		
		if (name.equals(ID)) {
			if (pw_int == 12345) {
				System.out.println("ë¡?ê·¸ì?? ?±ê³µ!");
			}else {
				System.out.println("ë¡?ê·¸ì?? ?¤í?? : ?¨ì?¤ì???? ??ë¦?");
		}
		}else {
			System.out.println("ë¡?ê·¸ì?? ?¤í?? : ???´ë?? ì¡´ì?¬í??ì§? ????");
		}
*/
		if (name.equals(ID)) {
			String result1 = (pw_int == 12345) ? "ë¡?ê·¸ì?? ?±ê³µ" : "ë¡?ê·¸ì?? ?¤í??! ?¨ì?¤ì???? ??ë¦?"; 
			System.out.println(result1);
		}else {
			System.out.println("ë¡?ê·¸ì?? ?¤í??! ???´ë?? ì¡´ì?¬í??ì§? ????");
		}
		

		
		}
	}

