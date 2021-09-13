public class ConvertBinary {
    public int[] solution(String s) {
        int[] answer = new int[2];

        String current = s;

        int count = 0;
        int round = 0;

        while (!current.equals("1")) {
            round++; // answer[0]++;
            count += findZero(current);

            current = current.replaceAll("0","");

            int len = current.length();
            current = Integer.toBinaryString(len);
        }

        answer[0] = round;
        answer[1] = count;

        return answer;
    }

    public int findZero(String str) {
        int cnt = 0;

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '0') {
                cnt++;
            }
        }

        return cnt;
    }
}
