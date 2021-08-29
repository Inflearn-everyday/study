import java.io.*;

public class Q1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int cycle = 0;
        int next = N;
        while (true) {
            int sum = 0;
            if (cycle != 0 && N == next) {
                break;
            }

            sum = (next % 10) + (( next / 10) % 10);
            next = ((next % 10) * 10) + (sum % 10);
            cycle++;
        }

        bw.write(cycle + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
