import java.util.*;

public class FindKimInSeoul {
    public String solution(String[] seoul) {
        int idx = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + idx +"에 있다";
    }
}
