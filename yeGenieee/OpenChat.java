import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class OpenChat {
    public String[] solution(String[] record) {
        ArrayList<String> chat = new ArrayList<>(); // 채팅방에 뿌려줄 메시지를 저장
        Map<String, String> map = new HashMap<>(); // (userId, nickname) 을 갖는 맵

        for(String str : record){
            StringTokenizer st = new StringTokenizer(str); // record 배열에 있는 문자열을 공백으로 자름 (기본 delimeter가 공백 문자)

            String command = st.nextToken(); // 입장 / 퇴장 / 닉네임 변경의 행위에 대한 문자열
            String userId = st.nextToken(); // 유저 id
            String nickname = ""; // 사용자 닉네임

            // 퇴장의 경우는 record에 두 단어만 있지만, 입장 & 닉네임 변경은 닉네임이 가장 마지막에 분리된 문자열임
            if(!command.equals("Leave")){
                nickname = st.nextToken();
            }

            // 입장 / 퇴장 / 닉네임 변경에 따라 채팅방 메시지 일단 생성
            switch(command){
                // 입장
                case "Enter":
                    map.put(userId, nickname);
                    chat.add(userId + "님이 들어왔습니다.");
                    break;
                // 퇴장
                case "Leave":
                    chat.add(userId + "님이 나갔습니다.");
                    break;
                // 닉네임 변경
                case "Change":
                    map.put(userId, nickname);
                    break;
            }
        }

        String[] answer = new String[chat.size()];
        int index = 0;

        // uid를 각 사용자의 닉네임으로 대체
        for(String str : chat){
            int end = str.indexOf("님");  // 7
            String userId = str.substring(0, end); // uid1234

            answer[index++] = str.replace(userId, map.get(userId)); // uid1234 --> Prodo // Prodo님이 들어왔
        }

        // 1. 닉네임을 변경 (uid1234 -> Muzi -> Prodo) Prodo
        // 2. Enter , Leave : result 에 추가

        return answer;
    }
}
