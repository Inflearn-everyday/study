import java.util.*;

class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Double> fail = new HashMap<>();
        LinkedHashMap<Integer, Double> result = new LinkedHashMap<>();

        // 실패율 계산
        for (int i=1; i<=N; i++) {
            int reachedCount = getReachedPlayer(i, stages);
            int unclearedCount = getUnclearedPlayer(i, stages);

            double failureRate = (reachedCount == 0) ? 0 : ((double) unclearedCount / (double) reachedCount);

            fail.put(i, failureRate);
        }

        fail.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        Set<Integer> keySet = result.keySet();

        Integer[] keyArray
                = keySet.toArray(new Integer[keySet.size()]);


        answer = Arrays.stream(keyArray).mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public int getReachedPlayer(int currentStage, int[] stages) {
        int result = 0;
        for (int i=0; i<stages.length; i++) {
            if (stages[i] >= currentStage) {
                result++;
            }
        }
        return result;
    }

    public int getUnclearedPlayer(int currentStage, int[] stages) {
        int result = 0;
        for (int i=0; i<stages.length; i++) {
            if (stages[i] == currentStage) {
                result++;
            }
        }
        return result;
    }
}
