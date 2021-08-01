package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
//        Set<Integer> set = new HashSet(N);

        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            arr[i] = tmp;
//            set.add(tmp);
        }

//        Integer[] sorted_arr = new Integer[set.size()];
//
//        set.toArray(sorted_arr);
//        Arrays.sort(sorted_arr);
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < sorted_arr.length; j++) {
//                if (arr[i] == sorted_arr[j]) {
//                    sb.append(j + " ");
//                    break;
//                }
//            }
//        }
//        System.out.println(sb);

        /*
        공통된 값 제거하여 오름차순 정렬, 매핑하여 탐색
        hashset -> array : printstream 시간초과 / stringbuilder 시간초과
        map(K(data), V(index))
         */

        int idx = 0;
        int[] sorted_arr = arr.clone();
        Arrays.sort(sorted_arr);
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < sorted_arr.length; i++) {
            if(m.containsKey(sorted_arr[i]) == false)
                m.put(sorted_arr[i], idx++);
        }

        for (int i = 0; i < N; i++) {
            sb.append(m.get(arr[i]) + " ");
        }
        System.out.println(sb);
    }
}