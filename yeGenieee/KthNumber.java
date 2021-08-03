import java.util.Arrays;

public class KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int r = 0; r < commands.length; r++) {
            int[] subArray = Arrays.copyOfRange(array,commands[r][0]-1,commands[r][1]);
            Arrays.sort(subArray);
            answer[r] = subArray[commands[r][2]-1];
        }

        return answer;
    }
}
