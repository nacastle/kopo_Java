package kr.ac.kopo.day02;

import java.util.Random;
import java.util.Scanner;

public class RandomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		
		int random = r.nextInt(); // 임의의 정수를 추출
		
		System.out.println("추출된 정수 : " + random);
		
		
		// 0 ~ 9 사이 난수 추출
		
		int num = r.nextInt(10); // 난수 중 10으로 나눈 나머지 값을 추출 => 0~9
		System.out.println(num);

		
		// 1 ~ 10 사이 난수 추출
		
		int num2 = r.nextInt(10) + 1; // 1~10 까지 난수
		
		r.nextInt();
		
		
		/* ++num 과 num++ 의 차이
		 * 
		 * ++num
		 * num++
		*/
	}

}
