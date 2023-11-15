class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0; i < num_list.length; i++) {
            answer[num_list.length - i - 1] = num_list[i];
            // num_list.length - i - 1 를 해주는 이유는 다음과 같다.
            // 배열 num_list의 사이즈가 5일 경우 반복문은 0~4 즉 총 5회가 실행된다.
            // 이때 배열은 0부터 시작하기 때문에 num_list.length에 i만큼 빼준 후 -1을 해주어야 4번째 원소, 즉 마지막 배열의 원소를 출력할 수 있다. 이것을 다시 배열 num_list에 담아주면 된다.
            // 이후 반복문을 통해 계속 반복해주면 원소의 순서를 거꾸로 뒤집은 배열을 return할 수 있다.
        }
        return answer;
    }
}