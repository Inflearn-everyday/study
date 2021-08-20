import java.util.*;

public class Printer2 {
    /**
     * input으로 들어오는 priorities를 locations와 묶어서 Task로 정의
     */
    class Task {
        int location;
        int priority;

        public Task(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Task> queue = new LinkedList<>(); // 문서를 넣을 큐

        // 큐에 일단 문서들을 넣음
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Task(i, priorities[i]));
        }

        int now = 0;

        while (!queue.isEmpty()) {
            // 큐에서 가장 앞에 위치한 Task 뽑아서 큐에 남아있는 Task 중에 현재보다 우선순위가 높은 작업이 있는지 확인
            Task current = queue.poll();

            boolean higherPriority = false;

            for (Task t : queue) {
                if (t.priority > current.priority) {
                    higherPriority = true;
                }
            }

            if (higherPriority) { // 우선순위 높은 작업이 있으면 뒤로 보내서 다시 큐에 넣음
                queue.add(current);
            } else { // 현재 작업이 가장 큰 우선순위면 출력
                now++;

                if (current.location == location) { // 찾던 요청이면 출력하고 종료
                    answer = now;
                    break;
                }

            }
        }
        return answer;
    }
}
