package step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1260 {
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        list = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            list[f].add(l);
            list[l].add(f);
        }

        for (int i = 1; i < N + 1; i++) {
            Collections.sort(list[i]);
        }

        visited = new boolean[N + 1];
        DFS(V);
        sb.append('\n');

        visited = new boolean[N + 1];
        BFS(V);

        System.out.println(sb);
    }

    static void BFS(int V) {
        Queue<Integer> need_visit = new LinkedList<>();
        need_visit.add(V);
        visited[V] = true;

        while (!need_visit.isEmpty()) {
            int tmp = need_visit.poll();
            sb.append(tmp).append(' ');
            for (int i : list[tmp]) {
                if (!visited[i]) {
                    visited[i] = true;
                    need_visit.add(i);
                }
            }
        }
    }

    static void DFS(int V) {
        if (visited[V]) {
            return;
        }

        visited[V] = true;
        sb.append(V).append(' ');

        for (int i : list[V]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}