import java.util.Stack;

public class ClawMachine {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<Integer>();
        int answer = 0;

        for (int position : moves) {
            for (int i=0; i<board.length; i++) {
                int toy = board[i][position - 1];
                if (toy == 0) {
                    continue;
                }
                if (!stack.empty() && stack.peek() == toy) {
                    stack.pop();
                    answer = answer + 2;
                } else {
                    stack.push(toy);
                }

                board[i][position - 1] = 0;
                break;
            }

        }

        return answer;
    }
}
