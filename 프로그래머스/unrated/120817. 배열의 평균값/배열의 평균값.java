class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for(int num:numbers) {
            answer += num; // 배열을 순회하며 배열의 값을 누적한다.
        }
        answer = answer/numbers.length;
        return answer;
    }
}