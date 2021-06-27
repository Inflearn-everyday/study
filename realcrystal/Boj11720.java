import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int result = 0;
        for(int i = 0; i < N; i++){
            result += Character.getNumericValue(input.charAt(i));
        }
        System.out.print(result);
    }
}
