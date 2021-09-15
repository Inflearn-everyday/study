import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            if (isGroupWord(input)) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static boolean isGroupWord(String word) {
        boolean isGroupWord = true;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            int cnt = map.getOrDefault(ch, 0);

            if (cnt > 0) {
                if (word.charAt(i-1) != ch) {
                    isGroupWord = false;
                    break;
                }
            } else {
                map.put(ch, cnt+1);
            }
        }

        return isGroupWord;
    }
}
