import java.util.Stack;

public class RemoveAlphabetPair {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                char top = stack.peek();

                if (top == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.size() == 0 ? 1 : 0;
    }
}
