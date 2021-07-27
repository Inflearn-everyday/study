package step12;

import java.io.IOException;

public class _1427 {
    public static void main(String[] args) throws IOException {
        int R;
        int[] arr = new int[10];
        while ((R = System.in.read() - '0') >= 0) {
            arr[R]++;
        }
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print(i);
            }
        }
    }
}