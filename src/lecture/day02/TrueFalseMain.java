package kr.ac.kopo.day02;

import java.util.Random;
import java.util.Scanner;

public class TrueFalseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int a = 1, b = -1, c = 0; //논리 세우는 순서에 따라 a, b, c, bool의 값이 다를 수 있음 boolean
		 * bool = ++a > 0 && ++b > 0; // 2 0 0 false boolean bool = --a > 0 && --b > 0;
		 * // 0 -1 0 false boolean bool = --b > 0 && --a > 0; // 1 -2 0 false
		 * 
		 * System.out.printf("a=%d b=%d c=%d bool=%b \n", a, b, c, bool);
		 */		
		
		
		Scanner sc = new Scanner(System.in);
		
		
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
		
		Random r = new Random();
		
		int n = r.nextInt(10);
		int n2 = r.nextInt(10);
		
		
		System.out.printf("n= %d, n2= %d \n", n, n2);
		
		/*
		 * int max = (n > n2 ? n : n2); // 이 문장 기억
		 * 
		 * ? 이전 : 조건문
		 * ? 이후 : 출력할 값
		 * 
		 * System.out.println("max: " + max);
		 */		
		
		String result = ( n > n2 ? "n > n2" : (n == n2 ? "n = n2" : "n < n2"));
		System.out.println(result);
		
		
	

	}

}
