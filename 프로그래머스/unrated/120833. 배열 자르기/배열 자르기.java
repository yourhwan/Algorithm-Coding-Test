import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        
        answer = Arrays.copyOfRange(numbers,num1,num2+1); 
        // 자바에서 기본으로 제공하는 Arrays 클래스를 사용
        // copyOfRange 함수는 첫번째 파라미터에서 기존 배열을 복사하고, 두번째 파라미터는 복사한 배열의 인덱스 시작 범위 지정, 세번째 파라미터는 복사한 배열의 인덱스 끝 범위 재지정(전 까지)
        return answer;
    }
}