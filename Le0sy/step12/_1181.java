package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class _1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> arr_set = new HashSet<String>();

        for (int i = 0; i < N; i++) {
            arr_set.add(br.readLine());
        }

        String[] arr = new String[arr_set.size()];
        arr_set.toArray(arr);

        Arrays.sort(arr, comp);

        for (String s : arr) {
            System.out.println(s);
        }
    }

    static Comparator<String> comp = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            int l1 = o1.length();
            int l2 = o2.length();
            if (l1 == l2) {
                return o1.compareTo(o2);
            } else return l1 - l2;
        }
    };
}