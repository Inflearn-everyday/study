import java.util.*;

public class Q2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=0; i<n ;i++) {
            for (int j=n-i-1; j>0; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}