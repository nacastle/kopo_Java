package homework.day12.StackQueue.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackUtil {

    public void stackInput(String msg, Stack<String> st, Scanner sc) {
        System.out.println(msg);
        st.push(sc.nextLine());
    }

    public void stackDelete(String msg, Stack<String> st) {
        System.out.println(msg);
        System.out.println("삭제된 데이터: " + st.pop());
    }

    public void showStackData(Stack<String> myStack) {
        System.out.println(myStack);
    }

    public void showLastData(String msg, Stack<String> st) {
        System.out.println(msg);
        System.out.println("마지막 데이터: " + st.peek());
    }

    public void isStackEmpty(String msg, Stack<String> myStack) {
        System.out.println(msg);
        if (myStack.isEmpty()) {
            System.out.println("A. 네, 비어있습니다.");
        } else {
            System.out.printf("A. 아니요, %d개 데이터가 있습니다.\n",myStack.size());
        }
    }

    public void searchString(String msg, Stack<String> myStack, Scanner sc) {

        System.out.println("찾을 문자열을 입력하세요.");
        String wantedString = sc.nextLine();
        System.out.println(msg);
        System.out.println("A. "+(myStack.search(wantedString)) + "번");
    }
}
