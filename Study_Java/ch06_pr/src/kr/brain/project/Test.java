package kr.brain.project;

import java.lang.reflect.Array;
import java.util.*;

public class Test {
	   
	   public static void main(String[] args) {
	      int [] num = {2,33,5,22,4,11,6,36,8,34,33,7,37,39,15,11,35,13,10,19};
	      
	      String[] name = {"�躸��","�̿���","����ȯ","�輼ȭ", "���ñ���","����ȯ","�ſ���", "�ֿ̾�", "������", "������", "�̼���", "������", "������", "��ȿ��", "������", "������", "�Ǽ���", "�㼺��", "��ȣ��", "����ȣ"};
	      

	      Scanner sc = new Scanner(System.in);
	   
	      int score = 0;
	      int answer;
	      
	      System.out.println("������? (�� : 1, �� : 2)");
	      answer = sc.nextInt();
	      
	      if(answer == 1) {
	      }
	      else if(answer == 2) {
	         score = score + 50;
	      }
	      System.out.println(score);
	      
	      System.out.println("�Ȱ��� ����? (�� : 1, �ƴϿ� : 2)");
	      answer = sc.nextInt();
	      
	      if(answer == 1) {
	         score += 5;
	      }
	      else if(answer == 2) {
	      }
	      
	      
	      System.out.println("���̴�? (96��� �̻� : 1, 95��� : 2, 94��� : 3, 93��� ���� : 4)");
	      answer = sc.nextInt();
	      
	      if(answer == 1) {
	         score += 1;
	      }
	      else if(answer == 2) {
	         score += 2;
	      }
	      else if(answer == 3) {
	         score += 3;
	      }
	      else if(answer == 4) {
	         score += 4;
	      }
	      
	      System.out.println("�� ���� �ɾҳ���? (1�� : 1, 2�� : 2, 3�� : 3)");
	      answer = sc.nextInt();
	      
	      if(answer == 1) {
	         score += 10;
	      }
	      else if(answer == 2) {
	         score += 20;
	      }
	      else if(answer == 3) {
	         score += 30;
	      }
	      
	      System.out.println("�̸��� '��'�� ������?( �� : 1, �ƴϿ� : 2");
	      answer = sc.nextInt();
	      
	      if(answer == 1) {
	         score += 100;
	      }
	      else if(answer == 2) {
	         score += 0;
	      }
	      
	      System.out.println(score);
	      int position = -Arrays.binarySearch(num, score);
	      System.out.println(position);
	      
	      System.out.println("����� " + name[position] + "�� �����߱���!!");
	      
	      
	      
	   }
	}
