import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int result = 0;
        for(int i = 0; i < S.length(); i++){
            int idx = S.charAt(i) - 'a';
            if(arr[idx] == -1) arr[idx] = i;
        }
        System.out.print(arr[0]);
        for(int i = 1; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }
}
