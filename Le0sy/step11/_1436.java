package step11;

import java.util.ArrayList;
import java.util.Scanner;

public class _1436 {
    public static void main(String[] args) {
        int cnt = 0;
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (String.valueOf(i).contains("666")) {
                arr.add(String.valueOf(i));
                cnt++;
            }
            if(cnt > 10000) break;
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(arr.get(N-1));
    }
}