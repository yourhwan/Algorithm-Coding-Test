import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // 빈도수와 해당 정수를 key와 value로 저장하기 위해 Map 선언
        
        // 빈도수를 저장하기 위해 배열을 순회하는 반복문
        for(int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }
        // .getOrDefault(Object key, V DefaultValue)
        // key는 값을 가져와야하는 요소의 키
        // DefaultValue는 지정된 키에 매핑 되어진 value가 없으면 반환되어야 하는 기본값
        // 반환값 key값이 존재하면 매핑되어 있는 값을 반환, 그렇지 않으면 기본값을 반환
        
        int mode = -1; // 최빈값의 초기 값을 -1로 선언
        int maxFreq = 0; // 최빈값의 빈도수 초기값을 0으로 선언
        
        // 반복문을 통해 Map을 순회하며 key와 value 조회
        // Map.Entry는 인터페이스로 Map의 내부 인터페이스로 포함되어 있다. Map의 각 항목에 할당되어 있는 key와 value에 접근할 수 있다.
        // Map.Entry<Integer,Integer> entry는 frequencyMap.entrySet()을 통해 가져온 Map의 모든 Key와 Value를 저장해두는 임시 데이터 구조의 역할을 한다고 생각하면 된다.
        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            
            if(freq > maxFreq) {
                mode = num; // 최빈값 업데이트
                maxFreq = freq; // 최빈값의 빈도수 업데이트
            }
            else if(freq == maxFreq) {
                mode = -1; // 최빈값이 여러개일 경우 최빈값의 초기값인 -1으로 업데이트 
            }
        }
        
        return mode;
    }
}