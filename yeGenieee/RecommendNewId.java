public class RecommendNewId {
    public String solution(String new_id) {
        String answer = "";

        answer = new_id.toLowerCase(); // 소문자로 치환
        answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자 제거
        answer = answer.replaceAll("[.]{2,}", "."); // 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
        answer = answer.replaceAll("^[.]|[.]$", ""); // 마침표가 처음이나 끝에 위치한다면 제거

        // 빈 문자열이면, a 대입
        if (answer.equals("")) {
            answer = "a";
        }

        // 길이가 16자 이상이면, 처음 15개 문자를 제외한 나머지 문자들을 모두 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15); // 제거
            answer = answer.replaceAll("[.]$", ""); // 마지막에 위치한 마침표 제거
        }

        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }


        return answer;
    }
}
