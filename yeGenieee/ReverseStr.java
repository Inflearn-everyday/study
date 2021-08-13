import java.util.Arrays;

public class ReverseStr {
    public String solution(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new StringBuilder(new String(charArr)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.solution("Zbcdefg") );
    }
}
