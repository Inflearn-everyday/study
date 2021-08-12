public class DotProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i=0; i<a.length; i++) {
            int current = a[i] * b[i];
            answer += current;
        }

        return answer;
    }
}
