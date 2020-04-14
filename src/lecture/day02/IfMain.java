package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 기상시간에 따라 밥을 먹고 학교갈지 안먹고 갈지 결정
 * 
 * 
*/
public class IfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("기상한다");
		
		System.out.println("일어나는 시간 입력(ex. 7시 10분 = 710) : ");
		
		int time = sc.nextInt();
		sc.nextLine();
		
		
		if(time < 700) {
		System.out.println("밥먹고");
		}
		
		System.out.println("학교간다");
		*/

		
		
		/*
		 * System.out.println("기상한다");
		 * 
		 * System.out.println("출발한 시간 입력(ex. 7시 10분 = 710) : ");
		 * 
		 * int time = sc.nextInt(); sc.nextLine();
		 * 
		 * 
		 * if(time < 800) { System.out.println("걸어서"); } else {
		 * System.out.println("버스를타고"); }
		 * 
		 * System.out.println("학교간다");
		 * 
		 * 
		 * //조건 연산자를 활용한 방법 System.out.println(time > 800 ? "버스타고" : "걸어서" );
		 */
		
		System.out.println("기상한다");
		System.out.println("출발한 시간 입력(ex. 7시 10분 = 710) : ");
		int time = sc.nextInt(); sc.nextLine();
		
//		
//		if(time < 800) { 
//			System.out.println("걸어서"); 
//		} else  {
//			if (time < 815) {
//			System.out.println("버스를타고"); 
//			} else {
//			System.out.println("택시를타고");
//			}
//		System.out.println("학교를간다");
//		}
		
		
		if(time < 800) { 
			System.out.println("걸어서"); 
		}else if (time < 815)  {
			System.out.println("버스를타고");
		}else {
			System.out.println("택시를타고");
			}
		System.out.println("학교를간다");
		}
	
	
	
	
		
	}


