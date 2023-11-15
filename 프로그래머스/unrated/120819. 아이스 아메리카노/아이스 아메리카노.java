class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        if(0<=money&&money<=1000000) {
            answer[0] = money/5500;
            answer[1] = money%5500;
        }
        return answer;
    }
}