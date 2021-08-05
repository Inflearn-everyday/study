import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Boj11729{
    
  	static StringBuilder sb = new StringBuilder();
    static int count = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        move(n, 1, 2, 3);
        System.out.println(count);
        System.out.println(sb);
    }
    
    private static void move(int n, int from, int by, int to){
        if(n == 1){
            sb.append(from + " " + to + "\n");
            count++;
            return;
        }
        move(n - 1, from, to, by);
        move(1, from, by, to);
        move(n - 1, by, from, to);
    }
}
