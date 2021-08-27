public class Q15596 {
    long sum(int[] a) {
        long ans = 0;

        for (int current : a) {
            ans += current;
        }

        return ans;
    }
}
