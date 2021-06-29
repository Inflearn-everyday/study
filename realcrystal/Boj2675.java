import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int T;
        String S;
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            T = Integer.parseInt(st.nextToken());
            S = st.nextToken();
            for(int j = 0; j < S.length(); j++){
                for(int k = 0; k < T; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
