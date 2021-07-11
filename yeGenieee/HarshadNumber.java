public class HarshadNumber {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int num = x;

        while(num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        if (x % sum == 0) {
            return true;
        }

        return answer;
    }
}
