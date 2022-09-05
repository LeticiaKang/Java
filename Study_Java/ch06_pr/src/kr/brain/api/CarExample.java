package kr.brain.api;

import java.text.SimpleDateFormat;
import java.util.*;

public class CarExample {
	public static void main(String[] args)/*throws classNotException*/{
		//Exception������ ���ܰ� �߻��ϸ� ȣ���� �޼ҵ�� �����ض�

//=================================================================//
		Class clazz = Car.class;

//=================================================================//
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(date));  // ������ ��¥�� ������
		
		
//		Class �������� = �ٸ�Ŭ������.class;
		System.out.println(clazz.getPackageName() + "." + clazz.getSimpleName());
		// getPackaeName ��Ű�� �̸� �� ��ü�� ������
		// getSimpleName : class�̸� �� ��ü�� ������
		// getName : ��Ű��.Ŭ���� ��ü�� ������
		
		try {
			Class clazz1 = Class.forName("kr.brain.api.Car");
			System.out.println(clazz1.getPackageName());
		}
		catch (Exception classNotException) {
			// TODO: handle exception
		}{
			System.out.println("����");			
		}
	
//=================================================================//
		// Calendar�� �߻�Ŭ���� �Դϴ�
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow.DAY_OF_MONTH);
		System.out.println(rightNow.get(Calendar.YEAR));
		//Calendar��ü�� rightNow��� ���������� �̿��Ͽ� get�̶�� �޼ҵ带 �̿��� �������� ����������.
		
//===== ENUM =====================================================//
		int dow = rightNow.get(Calendar.DAY_OF_WEEK);
		Week today = null;
		for(Week w : Week.values())
			System.out.println(w);
		//���������� ������ 
		
		// �ְ� ��ġ�� �ε����� ��Ÿ��
		// �Ͽ���:0 �� �����:5
		switch (dow) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		System.out.println(dow + "�� " + today);
		
		
		
		
	}
}