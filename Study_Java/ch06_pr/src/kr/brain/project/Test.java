package kr.brain.project;

import java.lang.reflect.Array;
import java.util.*;

public class Test {
	   
	   public static void main(String[] args) {
	      int [] num = {2,33,5,22,4,11,6,36,8,34,33,7,37,39,15,11,35,13,10,19};
	      
	      String[] name = {"김보성","이예지","송정환","김세화", "남궁기태","정지환","신우진", "이애연", "정명훈", "윤소정", "이소현", "정수영", "강은정", "진효영", "서인혁", "이종수", "권소현", "허성백", "이호재", "김윤호"};
	      

	      Scanner sc = new Scanner(System.in);
	   
	      int score = 0;
	      int answer;
	      
	      System.out.println("성별은? (남 : 1, 여 : 2)");
	      answer = sc.nextInt();
	      
	      if(answer == 1) {
	      }
	      else if(answer == 2) {
	         score = score + 50;
	      }
	      System.out.println(score);
	      
	      System.out.println("안경을 유무? (네 : 1, 아니오 : 2)");
	      answer = sc.nextInt();
	      
	      if(answer == 1) {
	         score += 5;
	      }
	      else if(answer == 2) {
	      }
	      
	      
	      System.out.println("나이는? (96년생 이상 : 1, 95년생 : 2, 94년생 : 3, 93년생 이하 : 4)");
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
	      
	      System.out.println("몇 열에 앉았나요? (1열 : 1, 2열 : 2, 3열 : 3)");
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
	      
	      System.out.println("이름에 'ㅎ'이 들어가나요?( 네 : 1, 아니오 : 2");
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
	      
	      System.out.println("당신은 " + name[position] + "을 생각했군요!!");
	      
	      
	      
	   }
	}
