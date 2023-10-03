class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2]; //홀수 개수만큼의 배열의 크기 설정.
        int k = 0;
        
        for(int i=1; i<=n; i++) { // 배열의 크기만큼 반복문을 실행, 조건문에 충족되면 배열에 추가해준다.
            if(i%2 == 1) {
                answer[k] = i; // i를 2로 나누었을 때 나머지가 1인 경우, 즉 홀수 일 경우 배열에 추가해준다. 이후 k는 1씩 증가해주며 배열을 순회한다.
                k++;
            }
        }
        
        return answer;
    }
}