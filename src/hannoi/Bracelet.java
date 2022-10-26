package hannoi;

import java.util.LinkedList;
import java.util.Stack;

public class Bracelet {



    public int solution(String str) {


        if(str == null || "".equals(str)){
            return 1;
        }
        if(str.contains("VM")){
            return 1;
        }
        Stack<Character> stack = new Stack<Character>();
        // 如果该String长度为奇数，不匹配
        if (str.length() % 2 == 1) {
            System.out.println("No");
        } else {
            stack = new Stack<Character>();

            for (int i = 0; i < str.length(); i++) {
                if (stack.isEmpty()) {
                    stack.push(str.charAt(i)); // 当前栈是空的 存入当前位置的字符
                } else if (
                        ((stack.peek() == '[') && (str.charAt(i) == ']'))
                        || ((stack.peek() == '(') && (str.charAt(i) == ')'))
                        || ((stack.peek() == '{') && (str.charAt(i) == '}'))
                ) {
                    stack.pop(); // 满足上面的条件 表示相邻的两个字符是一对匹配的括号 进行出栈操作
                } else {
                    stack.peek();
                    stack.push(str.charAt(i));
                }
            }

            if (stack.isEmpty()) {
                return 1;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Bracelet b = new Bracelet();
        String S = "{[()()]}";
        int result = b.solution(S);
        System.out.println(result);
    }
}
