package lecture.day06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMain01 {
    public static void main(String[] args) {
        String str = new String(); // 이건 값이 바로 나옴
        String str2 = new String("Hello World!"); // 이건 값이 바로 나옴

        char[] chars = {'a', 'b', 'c', 'd'};
        String str3 = new String(chars); // 이건 값이 바로 나옴
        String str4 = new String(chars, 1, 3); // 이건 값이 바로 나옴


        System.out.println("str : " +str+" "+str.length()); // + 문자열의 길이
        System.out.println("str2 : " + str2+" "+str2.length());
        System.out.println("str3 : " +str3+" "+str3.length());
        System.out.println("str4 : " + str4+" "+str4.length());

        System.out.println("str4의 세번째 문자는 : " + str4.charAt(2));


        str = "Hello there!";
        chars = new char[15];
        str.getChars(0,str.length(),chars,0);
        System.out.println(Arrays.toString(chars));



    }


}
