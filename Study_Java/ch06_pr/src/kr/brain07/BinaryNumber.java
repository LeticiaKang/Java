package kr.brain07;

import java.util.*;

public class BinaryNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ют╥б : ");
		int number = Integer.parseInt(sc.nextLine()); 
		
		int binLen = 0;
		boolean stop = true;
		
		while(stop) {
			if (number >=  (int) Math.pow(2, binLen) & number < (int) Math.pow(2, binLen+1)) {
				stop = false;}
			else;{
				binLen++;}
		
		}

		int[] binArr = new int[binLen];//10
		int num = number; int share = 1; int rest = 1;
		while(share != 0) {
			for (int x = 0; x < binLen ; x++) {
				share = (int) (num / 2);
				rest = num % 2;
//				System.out.printf("num : %d, share : %d, rest : %d\n", number, share, rest);
				num = share;
				binArr[x] = rest;
//				System.out.println(binArr[x]);
				
			}
		}
		
		for (int a = (binArr.length -1) ; a >= 0 ; a--) {
			System.out.print(binArr[a]);
		}
		System.out.println("");
		String binaryNumber = "";
		
	//	System.out.println("\n" + binArr.length);
		//binArr.length = 10
		
		for(int y = 0; y < binArr.length ; y++) {
			if( y > 0 && (y % 4 == 0 )) {
				binaryNumber = binArr[y] + "_" + binaryNumber ;
			}
			else {
				binaryNumber =  "" + binArr[y] + binaryNumber;
			}
			
		}
		
		System.out.println(binaryNumber);
		
	}
}
