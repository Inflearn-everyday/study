import java.util.Scanner;

public class Q5622 {
    public static void main(String[] args) {
        String[] dial = new String[]{
                "ABC", "DEF",
                "GHI", "JKL", "MNO",
                "PQRS", "TUV", "WXYZ"
        };

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int answer = 0;

        for (char ch : input.toCharArray()) {
            for (int i = 0; i < dial.length; i++) {
                if (dial[i].contains(Character.toString(ch))) {
                    answer += (i+3);
                }
            }
        }

        System.out.println(answer);
    }
}
