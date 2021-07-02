import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Boj2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = reverse(Integer.parseInt(st.nextToken())); //734 -> 437
        int y = reverse(Integer.parseInt(st.nextToken())); //893 -> 398
        
        System.out.print(x > y ? x : y);
        
    }
    
    private static int reverse(int n){
        int ret = 0;
        int pValue = 100;
        while(n != 0){
            ret += (n % 10) * pValue;
            n /= 10;
            pValue /= 10;
        }
        return ret;
    }
}
