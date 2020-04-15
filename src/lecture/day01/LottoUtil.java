package lecture.day01;

import java.util.Random;

// 문서 설명 주석문 

/**
 * 로또와 관련된 여러 가지 기능을 가지고 있는 클래스 입니다.
 * 
 * @author Na
 * @since 2020.04.08
 * @version jdk 1.0 부터 사용가능
 * 
 */

public class LottoUtil {

/**
 * 오늘의 로또 확률을 알려주는 기능입니다.
 * @return 오늘의 로또 확률 (0~100)		
 */
		
	public static int todayProbability() {
		
		Random r = new Random();
		return r.nextInt(101);
		
		


	}

}
