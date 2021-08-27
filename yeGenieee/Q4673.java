public class Q4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for (int i = 1; i < check.length; i++) {
            int n = getSum(i);

            if (n < 10001) {
                check[n] = true;
            }
        }

        for (int i = 1; i < check.length; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    public static int getSum(int num) {
        int sum = num;

        while (num != 0) {
            int current = num % 10;
            sum += current;
            num = num / 10;
        }

        return sum;
    }
}
