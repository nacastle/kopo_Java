package kr.ac.kopo.day01;

import java.util.Scanner;

/*
 * Scanner 클래스: 키보드를 통해 정수, 실수, 문자열, 논리값 (문자는 제외)을 입력받는 기능을 제공하는 클래스
 * 
 */

public class ScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		/*
		 * System.out.println("정수를 입력하세요 : "); int a = sc.nextInt(); int c = a + 10;
		 * System.out.println(c);
		 * 
		 * 
		 * System.out.println("true or false ? :"); boolean b = sc.nextBoolean();
		 * 
		 * System.out.println(b);
		 */
		
		/*
		 * System.out.println("문자열을 입력하세요 : "); String str = sc.next(); // 공백까지만 문자열 인식
		 * System.out.println(str);
		 */
		
		System.out.println("문자열을 입력하세요 : ");
		String str2 = sc.nextLine(); // 공백 포함 문자열 인식
		System.out.println(str2);
		
		double c = sc.nextDouble();
		
	}

}
