package me.elyowon.programers;


import java.util.Collections;

/**
 * 2021.06.24
 */
public class L1_210624_비밀지도 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        int[] num = new int[arr1.length];

        int idx = 0;
        for (int j = 0; j < arr1.length; j++) {
            num[idx++] = arr1[j] | arr2[j];
        }

        for (int i : num) {
            System.out.println("i = " + i);
        }

        idx = 0;
        for (int i : num) {
            StringBuilder sb = new StringBuilder();

            while(i > 0){
                sb.append((i % 2 == 1) ? "#": " ");
                i /= 2;
            }
            while(sb.length() < n) sb.append(" ");
            sb.reverse();
            answer[idx++] =sb.toString();

        }
        return answer;
    }
}

