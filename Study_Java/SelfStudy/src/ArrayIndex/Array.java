package ArrayIndex;

import java.util.*;

public class Array {
	public static void main(String[] args) {
		
	int [] arr = {1, 2, 3, 4, 5};
			
			int index = Arrays.binarySearch(arr, 5);
			// binarySearch�� ����ϸ�ȴ�. 
			// �Ű� �����δ� 1. �迭�� �̸� , 2. �ش� �迭�� ã���� �ϴ� ������
			// ������ �ڵ带 �ۼ����ָ� �ȴ�.
			
			System.out.println(index + " �� �ش��ϴ� �� -> " + arr[index]);
		
	}
}
