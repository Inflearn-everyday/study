import java.util.Arrays;

public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;

        // 배열을 정렬 - min은 배열의 처음, max는 배열의 맨 끝
        Arrays.sort(people); // [50, 50, 70 ,80]

        int min = 0; // 최솟값의 위치의 역할

        // max + min이 limit을 넘으면 혼자 간다
        for (int max = people.length - 1; min <= max; max--) {
            if (people[min] + people[max] <= limit) {
                min++;
            }
            answer++; // 현재 최댓값 혼자 구명보트 탔다고 표시
        }

        return answer;
    }
}
