package step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<pq> q;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int P = 0;
            st = new StringTokenizer(br.readLine());
            q = new LinkedList<>();
            for (int j = 0; j < N; j++) {
                int parseInt = Integer.parseInt(st.nextToken());
                pq pq = new pq(parseInt, 0);
                if (j == M) { // pq라는 클래스 생성, f 필드를 통해 결과로 원하는 queue 구분
                    pq.setF(1);
                }
                q.add(pq);
            }
            int result = 0;
            while (q.size() > 0) {
                int max = 0, maxIdx = 0;
                for (int j = 0; j < q.size(); j++) {
                    pq poll = q.poll();
                    if (poll.getPr() > max) {
                        max = poll.getPr();
                        maxIdx = j;
                    }
                    q.add(poll);
                }
                // 해당 queue 내의 가장 높은 우선순위를 찾아 해당 우선순위의 index 추출

                for (int j = 0; j < maxIdx; j++) {
                    q.add(q.poll());
                }

                // 가장 높은 우선순위 index 까지 poll()

                pq p = q.poll();
                result++;

                // 가장 높은 우선순위 poll() 후 출력 횟수(result) 증가

                if (p.getF() == 1) {
                    sb.append(result).append("\n");
                    break;
                }
                // 현재 poll()로 뽑아낸 데이터가 출력 횟수를 구하기 위한 데이터인지 판단
            }
        }
        System.out.println(sb);
    }
}

class pq {
    int pr;
    int f;

    public pq(int pr, int f) {
        this.pr = pr;
        this.f = f;
    }

    public int getPr() {
        return pr;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getF() {
        return f;
    }
}