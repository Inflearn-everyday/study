package daily;

import java.io.IOException;

public class _11718 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = System.in.read()) != -1) {
            sb.append((char) c);
        }
        System.out.println(sb);
    }
}