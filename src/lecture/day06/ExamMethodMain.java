package lecture.day06;

public class ExamMethodMain {
    public static void main(String[] args) {

        ExamMethod exam = new ExamMethod();

        int sum = exam.getSum(1,10); // 두 정수의 합
        System.out.println(sum);


        int totalSum = exam.getTotalSum(1,10); //  두 정수 사이 값들의 합
        System.out.println(totalSum);


        int[] nums = exam.getNums(); // 1~100사이의 난수 10개 출력
        for(int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println();


        System.out.print("배열의 크기 입력 : ");
        int size = exam.getNum();
        int[] nums2 = exam.getNums(size); // 1~100사이의 난수 size개 출력
        for(int i : nums2) {
            System.out.print(i+" ");
        }


        System.out.println("1-100사이 정수 입력");
        int max = exam.getNum();
        // 1~max 사이의 난수 size개만큼 추출
        int[] nums3 = exam.getNums(max,size);







    }
}
