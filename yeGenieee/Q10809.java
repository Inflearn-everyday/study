import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        int[] alphabet = new int[26];
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Arrays.fill(alphabet, -1);

        for (int i = 0; i < input.length(); i++) {
            int ch = input.charAt(i);
            if (alphabet[ch - 97] == -1) {
                alphabet[ch - 97] = i;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
