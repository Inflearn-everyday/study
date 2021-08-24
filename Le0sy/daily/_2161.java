package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _2161 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        while (list.size() > 1) {
            sb.append(list.poll()).append(' ');
            list.add(list.poll());
        }
        System.out.println(sb.append(list.poll()));
    }
}