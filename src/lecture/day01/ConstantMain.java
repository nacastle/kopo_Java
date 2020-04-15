package lecture.day01;

public class ConstantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI = 3.14;  // 상수화 하기 위해 final 붙이고 대문자화 (상수는 대문자로 구성)
		int radius = 10;
		double area = radius * radius * PI;
		
		System.out.println(area);
		
		
		radius = 5;
		area = radius * radius * PI;
		System.out.println(area);

	}

}
