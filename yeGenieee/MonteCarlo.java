class MonteCarlo {
    public static void main(String[] args) {
        solution(new int[] {5}, new int[] {5}, new int[] {5}, new int[] {92, 83, 14, 45, 66, 37, 28, 9, 10, 81});
    }
    public static int solution(int[] x, int[] y, int[] r, int[] v) {
        int answer = 1;

        int left = x[0] - r[0];
        int right = x[0] + r[0];
        int bottom = y[0] - r[0];
        int top = y[0] + r[0];

        int count = 0;

        // l값 구하기
        for (int i = 0; i < x.length; i++) {
            int current = x[i] - r[i];
            if (current < left) {
                left = current;
            }
        }

        // r 값 구하기
        for (int i = 0; i < x.length; i++) {
            int current = x[i] + r[i];
            if (current > right) {
                right = current;
            }
        }

        // b 값 구하기
        for (int i = 0; i < y.length; i++) {
            int current = y[i] - r[i];
            if (current < bottom) {
                bottom = current;
            }
        }

        // t 값 구하기
        for (int i = 0; i < y.length; i++) {
            int current = y[i] + r[i];
            if (current > top) {
                top = current;
            }
        }

        System.out.println(" left, right, bottom, top  " + left+ " , " + right  + " , "  + bottom + " , " + top);

        //  난수 좌표가 원 안에 있는지 구하기
        for (int i = 0; i < v.length; i += 2) {
            int convertedX = (left + v[i] % (right - left));
            int convertedY = (bottom + v[i+1] % (top - bottom));

            for (int j = 0; j < r.length; j++) {
                if (isInCircle(x[j], y[j], r[j] ,convertedX, convertedY)) {
                    count++;
                }
            }
        }

        int vertexLen = v.length / 2;

        answer = (int) ( ((double) count / (double) vertexLen) * (right - left) * (top - bottom));

        return answer;
    }

    public static boolean isInCircle(int circleX, int circleY, int radius, int convertedX, int convertedY) {
        double pow1 = Math.pow(radius, 2);
        double pow2 = Math.pow((circleX - convertedX), 2);
        double pow3 = Math.pow((circleY - convertedY), 2);

        return (pow1) >= (pow2 + pow3);
    }

}
