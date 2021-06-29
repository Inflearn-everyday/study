class LottoMinMax {
    public int[] solution(int[] lottos, int[] win_nums) {
        int matched = 0;
        int zeroCount = 0;

        for (int i=0; i<lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }

            for (int j=0; j<win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    matched++;
                    break;
                }
            }
        }

        return new int[]{ 7 - Math.max(matched+zeroCount,1), 7 - Math.max(matched,1)};
    }
}