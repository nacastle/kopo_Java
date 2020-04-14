package kr.ac.kopo.day03;

/* 중첩 반복문
 * 
 * 별찍기(*)
 * 
*/
public class LoopMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int cnt = 0;
//		for ( ; cnt < 5; cnt++) {
//			System.out.print("*");
//			
//		}
//		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	} // 변수 cnt 는 삭제

	
	
	
	
}
