public class MaskPhoneNumber {
    /**
     * 전화번호 for문 돌리면서 -> 끝 4자리 빼고 *로 바꿈
     * TimeComplexity : O(n) (문자열 길이-4 만큼 반복)
     * SpaceComplexity : O(1)
     * */
    public String solution(String phone_number) {
        // 더 나은 풀이 (굳이 StringBuffer를 쓸 필요가 없었다)
        char[] charArr = phone_number.toCharArray();
        for (int i=0; i<charArr.length - 4; i++) {
            charArr[i] = '*';
        }

        return String.valueOf(charArr);

        // 이전 풀이
//        StringBuffer sb = new StringBuffer();
//        for (int i=phone_number.length() - 1; i>-1; i--) {
//            if (i > phone_number.length() - 5) {
//                sb.append(phone_number.charAt(i));
//            } else {
//                sb.append("*");
//            }
//        }
//        return sb.reverse().toString();
    }
}
