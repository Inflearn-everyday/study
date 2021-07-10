public class reverseArray {
    public int[] solution(long n) {
        String str = n + "";
        int[] answer = new int[str.length()];

        for (int i=str.length()-1; i>=0; i--) {
            answer[i] = (int) str.charAt(str.length() - i - 1) - '0';
        }

        return answer;
    }
}
