package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();

        int[] arr = new int[26];

        int max = -1;
        char result = 0;

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) (i + 'A');
            } else if (max == arr[i]) {
                result = '?';
            }
        }

        System.out.println((char) (result));
    }
}