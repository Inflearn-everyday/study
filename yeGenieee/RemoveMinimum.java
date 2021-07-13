public class RemoveMinimum {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }
        int[] answer = new int[arr.length - 1];

        int minIndex = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }

        for (int i=minIndex+1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }

        for (int i=0; i<answer.length; i++) {
            answer[i] = arr[i];
        }

        return answer;

    }
}
