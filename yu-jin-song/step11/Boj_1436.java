package step11;

import java.util.Scanner;

public class Boj_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int num = 666;
        String str = "";

        while(cnt != n) {
            str = String.valueOf(num++);
            if(str.contains("666"))
                cnt++;
        }

        System.out.println(str);
    }
}
