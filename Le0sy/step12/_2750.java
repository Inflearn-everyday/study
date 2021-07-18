package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int tmp;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        _2750.selectionSort(arr, N);
    }

    static void selectionSort(int arr[], int size) {
        int tmp, tmp_idx;
        for (int i = 0; i < size - 1; i++) {
            tmp_idx = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[tmp_idx] > arr[j]) {
                    tmp_idx = j;
                }
            }
            tmp = arr[tmp_idx];
            arr[tmp_idx] = arr[i];
            arr[i] = tmp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void bubbleSort(int arr[], int size) {
        int tmp;
        boolean sorted = false;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                    sorted = true;
                }
            }
            if (!sorted) {
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    static void insertionSort(int arr[], int size) {
        int tmp;
        boolean sorted = false;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
