package lecture.day02;

import java.util.Scanner;

public class ScannerMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * 문자열을 입력: hello world
		 * 정수를 입력 : 123
		 * 문자열 : hello world    정수: 123
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * //문제 없음 System.out.println("문자열을 입력 :"); String str = sc.nextLine();
		 * 
		 * System.out.println("정수를 입력 : "); int num = sc.nextInt();
		 * 
		 * System.out.println("문자열: " + str + ", 정수: " + num);
		 * 
		 * 
		 * 
		 * //문제 발생: // 이유: 스캐너 클래스가 입력 버퍼를 사용하기 때문 System.out.println("정수를 입력 : "); int
		 * num2 = sc.nextInt();
		 * 
		 * System.out.println("문자열을 입력 :"); String str2 = sc.nextLine(); // nextLine:
		 * 엔터가 나올때까지 입력 받는 함수... 위에서 int 입력값 이후 엔터를 입력했기 때문에 그 엔터를 인식해서 다음 줄로 넘어간 것
		 * String str3 = sc.next(); // 그냥 next() 쓰면 정상 작동
		 * 
		 * System.out.println("문자열: " + str2 + ", 정수: " + num2);
		 * 
		 * 
		 * //버퍼는 문자를 하나하나씩 받는 공간
		 */
		
		/*
		 * System.out.println("첫번째 정수를 입력: ");
		 * 
		 * int n = sc.nextInt();
		 * sc.nextLine();
		 * 
		 * System.out.println("두번째 정수를 입력: "); 
		 * int n2 = sc.nextInt(); 
		 * sc.nextLine();
		 * 
		 * System.out.println("n : " + n + ", n2 : " +n2);
		 * 
		 * 
		 * int num3 = Integer.parseInt(sc.nextLine()); // **문자열을 정수화 시키는 방법
		 */
		
		
		
		
		
	
	}

}
