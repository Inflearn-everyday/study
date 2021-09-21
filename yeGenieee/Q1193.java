import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        int round = 2;
        int start = 2;

        if (X == 1) {
            System.out.println("1/1");
        } else {
            while (start <= X) {
                start += round;
                round++;
            }
            round--;
            start -= round;

            int denominator = 1 + (X - start);
            int numerator = round - (X - start);
            if (round % 2 == 0) {
                System.out.println(denominator + "/" + numerator);
            } else {
                System.out.println(numerator + "/" + denominator);
            }
        }
    }
}
