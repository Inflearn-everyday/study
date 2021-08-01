import java.util.*;

public class PickTwoAndGetSum {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<numbers.length; i++) {
            for (int j=i; j< numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;

    }
}
