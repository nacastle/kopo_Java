package kr.ac.kopo.day01;

import java.util.Scanner;

public class PrintMain {

	public static void main(String[] args) {
		
		System.out.printf("%-10d \t %s\n", 10, "ABC");
		System.out.printf("%-10d \t %s\n", 1234, "DE");
		System.out.printf("%-10d \t %s\n", 8, "Hello"); // %-d: 왼쪽 정렬, %10d 열 칸 여유 생성
		System.out.printf("%.4f\n", Math.PI); // 반올림 기능: 소수점 첫째자리까지로 반올림 
		System.out.printf("%.1f\n", 12.46 - 0.05); // 버림 하고 싶을 때 논리 : xx.xx - 0.05
		
		System.out.println(10 + "ABC");
		System.out.println(10 + 12.34);
		System.out.println("A" + "BC");
		System.out.println('A' + 'B'); // char 타입... A=65, B=66  *아스키 코드: a => 97, 0 => 48
		//A와 B가 유니코드로 바뀌어서 계산돼...
		//아스키 코드: 소문자, 대문자, 숫자문자, 특수문자, 공백문자로 구성... 1byte = 256가지(8bit = 2의 8승) 표현 가능
		//유니코드: 모든 문자 표현 가능... 한글, 한자 등등 2byte(65000, 16bit = 2의 16승)
		//자바는 유니코드 기반... 따라서 한글도 표현 가능
		System.out.println("진짜?");
		System.out.println(10 + 'A'); // 10 + 65(=A) = 75
		System.out.println('A');
		System.out.printf("%c\n", 'A');
		
		System.out.println(3+4.5);
		
		
		double b = 3;  // 3은 int 지만 데이터형 변환 생략 가능 (작은 거를 큰 거에 넣는 것이기 때문에)
		int a = (int) 4.123; // 3.123은 double 타입이기 때문에 명시적 변환이 필요 (큰 거를 작은 거에 넣는 것이기 때문)
		
		System.out.println(a);
		System.out.println("b:" + b);
		
		System.out.println((int) 'A'); // A를 유니코드화 하기 위해 정수형으로 명시적 변환
		System.out.println((char) 65); // 65 --> A 를 위해 문자형으로 명시적 변환
		
		
		System.out.println("\\/");  // 문자 \ 를 찍기 위해 \\를 사용
		System.out.printf("%%%%\n"); // printf로 문자 %를 찍기 위해 %%
		System.out.println("\"");  // 문자 "를 찍기 위해 \" 로 입력
		System.out.println("%");
		
		// 문서 주석은 /** */ 를 활용
		
		
		System.out.printf("%.3f", 3.3957);
		
		
		
		
		
		
	}
}
