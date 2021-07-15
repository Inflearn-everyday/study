import java.util.*;

public class WordChain {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Map<String, Integer> map = new HashMap<String, Integer>();

        int fail = 0;
        char lastLetter = '0';

        for (int i=0; i < words.length; i++) {
            String word = words[i];
            char firstLetter = word.charAt(0);

            if (i != 0 && firstLetter != lastLetter) {
                fail = i;
                break;
            }

            if (map.get(word) != null) {
                fail = i;
                break;
            } else {
                map.put(word, 1);
            }

            lastLetter = word.charAt(word.length() - 1);
        }

        answer[0] = fail == 0 ? 0 : (fail % n) + 1;
        answer[1] = fail == 0 ? 0 : (fail / n) + 1;

        return answer;
    }
}
