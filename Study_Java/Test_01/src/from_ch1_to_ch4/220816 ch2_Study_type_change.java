package from_ch1_to_ch4;

public class ch2_Study_type_change {

	public static void main(String[] args) {
  /*
		// double > float > long > int  > short > byte
		
		int intValue = 10;
		byte byteValue = (byte) intValue;
		// (byte) �� ���� ĳ���� �����ڸ� ����ؼ� ���� ��ȯ ����
		
		System.out.println(intValue);
		System.out.println(byteValue);
		
		intValue = 44032;
		char charValue = (char) intValue ;
		System.out.println(charValue);
		// �����ڵ� ��ȣ�� ���ڷ� �ٲ���. ������ �ȵ�! 
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println("intValue : " + intValue + ", " + "longValue : " + longValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue : " + intValue + ", " + "doubleValue : " + doubleValue);
		
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result3 = x + y;
		System.out.println(result3);
		// �� byte�� ���������� int ����Ǿ� �����. int�� �� ũ�ϱ�
		
		byte A1 = 100;
		int A2 = 1000;
		long A3 = 10000L;
		long result_A = A1 + A2 + A3;
		System.out.println(result_A);
		// �� 
		
		int x1 = 1;
		int x2 = 2;
		double x3 = x1 / x2;
		System.out.println(x3);
		
		char charX1 = 'A';   // �����ڵ� : 65
		char charX2 =  1;    // ���� : B
		int intX3 = charX1 + charX2;
		long longX3 = charX1 + charX2;
		double doubleX3 = charX1 + charX2;
		float floatX3 = charX1 + charX2;
		System.out.println(intX3);
		System.out.println(longX3);
		System.out.println(doubleX3);
		System.out.println(floatX3);
		System.out.println(charX1 + charX1);
		System.out.println(charX1);
		System.out.println(charX2);
	
		char c1 = 'a';
		char c2 = (char) (c1 + 1);
		System.out.println(c2);
		
		int d1 = 5;
		int d2 = 2;
		double result = (double) d1 / d2;
		System.out.println(result);

		double add1 = 3.4;
		double add2 = 2.7;
		int result12 = (int) (add1 + add2);
		System.out.println(result12);
*/		

		long k_long = 2L;
		float k_float = 1.8f;
		double k_double = 2.5;
		String k_str = "3.9";
		int result_int = (int) (k_double + k_float + k_long + (int) Double.parseDouble(k_str)) ;
		System.out.println(result_int);
		
		byte M1 = Byte.parseByte("10");
		int M2 = Integer.parseInt("1000");
		float M3 = Float.parseFloat("20.5");
		double M4 = Double.parseDouble("3.14159");
		
				
				
		
		
	}

}
