package step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _2606 {
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer>[] list;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pc = Integer.parseInt(br.readLine());
        int net = Integer.parseInt(br.readLine());

        list = new ArrayList[pc + 1];

        for (int i = 1; i < pc + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < net; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l1 = Integer.parseInt(st.nextToken());
            int l2 = Integer.parseInt(st.nextToken());

            list[l1].add(l2);
            list[l2].add(l1);
        }

        visited = new boolean[pc + 1];
        DFS(1);
        System.out.println(result - 1);
    }

    static void DFS(int V) {
        if (visited[V]) {
            return;
        }

        result++;

        visited[V] = true;
        for (int i : list[V]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
