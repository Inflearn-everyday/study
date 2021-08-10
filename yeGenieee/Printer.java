import java.util.*;

class printer {
    public int solution(int[] priorities, int location) {
        int answer = 1;

        priorityqueue priority = new priorityqueue<>(collections.reverseorder());

        for (int task : priorities) {
            priority.add(task);
        }

        while (!priority.isempty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == (int) priority.peek()) {
                    if (i == location) {
                        return answer;
                    }
                    priority.poll();
                    answer++;
                }
            }
        }

        return answer;
    }
}