package homework.day07String;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        String str = "abcde";

        System.out.println(str.indexOf('c',-1));

        String[] strArr = str.split("c");
        String str2 = "";

        for (int i = 0; i <= strArr.length-1; i++) {
            str2 += strArr[i];
        }
        System.out.println(str2);
    }
}
