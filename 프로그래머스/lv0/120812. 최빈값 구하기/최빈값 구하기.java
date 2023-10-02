import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] array) {
        // 배열의 값과 빈도수를 저장할 Map 생성
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // 배열을 순회하며 빈도수 계산
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = -1; // 최빈값 초기값을 -1로 설정
        int maxFrequency = 0; // 최빈값의 빈도수 초기값을 0으로 설정

        // Map을 순회하며 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            // 현재 값의 빈도수가 최빈값의 빈도수보다 큰 경우
            if (frequency > maxFrequency) {
                mode = num; // 최빈값 업데이트
                maxFrequency = frequency; // 최빈값의 빈도수 업데이트
            } else if (frequency == maxFrequency) {
                // 최빈값의 빈도수와 같은 경우
                mode = -1; // 최빈값이 여러 개인 경우 -1로 설정
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 2, 2, 3, 3, 3};
        int result = solution.solution(array);
        System.out.println("최빈값: " + result);
    }
}
