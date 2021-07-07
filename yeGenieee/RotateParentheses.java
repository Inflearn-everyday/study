import java.util.*;

public class RotateParentheses {
    public int solution(String s) {
        int answer = 0;

        String rotated = s;


        for (int i=0; i<s.length(); i++) {
            // 회전한 문자열
            rotated = rotated.substring(1, s.length()) + rotated.charAt(0);
            if (isValidParenthesis(rotated)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isValidParenthesis(String parenthesis) {
        Stack<Character> stack = new Stack<>();
        stack.clear();

        for (int i=0; i<parenthesis.length(); i++) {
            char ch = parenthesis.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.empty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if (ch == ')' && top == '(') {
                        stack.pop();
                    } else if (ch == '}' && top == '{') {
                        stack.pop();
                    } else if (ch == ']' && top == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.empty();
    }
}
