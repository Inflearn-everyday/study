import java.util.Scanner;

public class Q2941 {
    static String[] croatiaAlphabet = new String[] {
            "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="
    };

    public static int getAlphabetCount(String input) {
        for (int i = 0; i < croatiaAlphabet.length; i++) {
            if (input.contains(croatiaAlphabet[i])) {
                input = input.replace(croatiaAlphabet[i], "~");
            }
        }

        return input.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(getAlphabetCount(input));
    }
}
