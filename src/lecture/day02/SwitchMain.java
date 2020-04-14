package kr.ac.kopo.day02;

import java.util.Random;
import java.util.Scanner;


// 동등 비교는 switch 문으로 짜기도 함
/* 
 * 1~3 정수 입력
 * 1 => One 출력
 * 2 => TWO 출력
 * 3 => THREE 출력
 * 그외 => ERROR

*/
public class SwitchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Random r = new Random();
//		
//		int n = r.nextInt(5) + 1;
//		
//		System.out.println("랜덤한 정수:" + n);
//		
//		// 동등 비교는 switch 문으로 짜기도 함
//
//		switch(n) {
//		case 1:
//			System.out.println("ONE");
//			break;
//		case 2:
//			System.out.println("TWO");
//			break;
//		case 3:
//			System.out.println("THREE");
//			break;
//		default :
//			System.out.println("ERROR");
//		}
		

		
		//		if 구문으로 짜기
//		if (n == 1) {
//			System.out.println("ONE");
//		}else if (n==2) {
//			System.out.println("TWO");
//		}else if (n==3) {
//			System.out.println("THREE");
//		}else {
//			System.out.println("ERROR");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 계절은? :");
		
		String season = sc.nextLine();
		
		System.out.println("season:" + season);

		// if문을 활용한 방법
//		if (season.equals("봄")) {  // 문자열에 대한 검증일 경우 equals 함수가 필요 
//			System.out.println("3월에서 5월");
//		}
		
		
		
		switch (season) { // 문자열에 대한 검증일 경우 switch가 좀 더 편할 때가 있음
		case "봄" :   // case를 몰아서 사용 가능
		case "spring" :
		case "Spring" :
			System.out.println("3월에서 5월");
			break;
		case "여름" :
			System.out.println("6월에서 8월");
			break;
		case "가을" :
			System.out.println("9월에서 11월");
			break;
		case "겨울" :
			System.out.println("12월에서 2월");
			break;
		}
		
		
	}
}
