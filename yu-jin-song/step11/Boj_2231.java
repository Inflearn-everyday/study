package step11;

import java.util.Scanner;

public class Boj_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s;
        int sum, min = n;

        for(int i=1; i<n; i++){
            sum = i;
            s = String.valueOf(i);

            for(int j=0; j<s.length(); j++){
                sum += Character.getNumericValue(s.charAt(j));
            }

            if(sum == n && i < min)
                min = i;
        }

        if(min == n)
            min = 0;

        System.out.println(min);
    }
}
