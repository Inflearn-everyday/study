public class Challenge1 {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (numbers[i] == arr[j]) {
                    arr[j] = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}
