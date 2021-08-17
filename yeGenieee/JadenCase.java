public class JadenCase {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String firstLetter = s.charAt(0) + "";

        sb.append(firstLetter.toUpperCase());

        for (int i = 1; i < s.length(); i++) {
            String current = s.charAt(i) + "";

            if (current.equals(" ")) {
                sb.append(" ");
            } else if (s.charAt(i - 1) == ' ') {
                sb.append(current.toUpperCase());
            } else {
                sb.append(current.toLowerCase());
            }
        }

        return sb.toString();
    }
}
