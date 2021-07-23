import java.util.ArrayList;

public class DoNotLikeSameNumber {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        int preNum = 10;
        for (int i=0; i<arr.length;i++) {
            if (preNum != arr[i]) {
                answer.add(arr[i]);
            }
            preNum = arr[i];
        }

        return answer.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
