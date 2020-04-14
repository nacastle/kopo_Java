package kr.ac.kopo.day02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a = 10;
		 * 
		 * 선행증가와 후행증가, 선행감소와 후행감소 System.out.println(++n); // n = n+1 => 출력 // 먼저 증가 후
		 * 출력 System.out.println(a++); // n 출력 => n+1 // 먼저 출력 후 증가
		 * 
		 * System.out.println(a++); //5 System.out.println(++a); //7
		 * System.out.println(--a); //6 System.out.println(a ); //6
		 * System.out.println(a--); //6 System.out.println(a++); //5
		 * 
		 */ 
		
		
		/*
		 * int a = 1, b = -1, c = 0; //논리 세우는 순서에 따라 a, b, c, bool의 값이 다를 수 있음 boolean
		 * bool = ++a > 0 && ++b > 0; // 2 0 0 false boolean bool = --a > 0 && --b > 0;
		 * // 0 -1 0 false boolean bool = --b > 0 && --a > 0; // 1 -2 0 false
		 * 
		 * System.out.printf("a=%d b=%d c=%d bool=%b \n", a, b, c, bool);
		 */		
		
		
//		Scanner sc = new Scanner(System.in);
		
		
		// 짝수 확인
		/*
		 * int n = sc.nextInt(); sc.nextLine();
		 * 
		 * boolean result = n >= 0 && n%2 == 0;  // ** 논리 순서가 뒤바뀌면 틀린 결과값이나 에러가 날 수 있음
		 * 
		 * System.out.println("짝수 판단 여부: " + result);
		 */		
		
		
		//약수 여부 확인
		/*
		 * int a = sc.nextInt(); int b = sc.nextInt();
		 * 
		 * boolean result = b != 0 && a%b==0; // ** 논리 순서가 뒤바뀌면 틀린 결과값이나 에러가 날 수 있음
		 * 
		 * System.out.println("약수여부: " + result);
		 */	
		
		

		        Scanner sc = new Scanner(System.in);


		        System.out.println("초를 입력하세요 :");
		        int time = sc.nextInt(); //초 선언
		        sc.nextLine();

		        int hour = time / 3600;  // 시간 설정
		        int min = time % 3600 / 60;  // 분 설정
		        int sec = time % 3600 % 60;  // 초 설정

		        /*
		            성주씨 이렇게 조건을 걸게 되면 hour 가 0일 때, 즉 954초 입력하면 0시간 나오지 않나요????
		            조건을 다시한번 조정해주세요. ^^
		        */
		        
		        
		        
			        if (hour > 0) {
			        	System.out.print(hour + "시간 ");
			        }
			        if (min > 0) {
			        	System.out.print(min + "분 ");
			        }
			        if (sec > 0) {
			        	System.out.print(sec + "초 ");
			        }
			        
			        if (time <= 0) {
			        	System.out.print("설정된 시간이 없습니다.");
			        }
		        
		    }

}

