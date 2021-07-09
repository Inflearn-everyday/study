public class SecretMap {
    public static String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0; i<n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i=0; i<n; i++) {
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }

        return answer;
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        char[][] map1 = new char[n][n];
        char[][] map2 = new char[n][n];
        char[][] mapResult = new char[n][n];

        convertIntToBinary(n, arr1, map1);
        convertIntToBinary(n, arr2, map2);

        // 두 개의 비밀 지도를 겹쳐서 해독
        for (int i=0; i<map1.length;i++) {
            StringBuilder builder = new StringBuilder();
            for (int j=0; j<map1[i].length; j++) {
                if (map1[i][j] == '0' && map2[i][j] == '0') {
                    mapResult[i][j] = ' ';
                } else {
                    mapResult[i][j] = '#';
                }
                builder.append(mapResult[i][j]);
            }
            answer[i] = builder.toString();
        }

        return answer;
    }

    /**
     * 현재 숫자를 이진수로 변환하여 char 2차원 배열에 저장
     * @param current
     * @param array
     * @param map
     */
    private static void convertIntToBinary(int current, int[] array, char[][] map) {
        for (int i = 0; i< array.length; i++) {
            int num = array[i];
            int quotient = 1;
            int remainder = 0;
            StringBuilder sb = new StringBuilder();

            while (num > 1) {
                quotient = num / 2;
                remainder = num % 2;
                sb.append(remainder);
                num = num / 2;
            }
            sb.append(quotient);

            // 자릿수 맞춰주기
            while (sb.length() < current) {
                sb.append(0);
            }

            String result = sb.reverse().toString();

            for (int j=0; j<result.length(); j++) {
                map[i][j] = result.charAt(j);
            }
        }
    }
}