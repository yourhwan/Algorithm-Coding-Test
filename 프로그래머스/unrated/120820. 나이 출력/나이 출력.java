class Solution {
    public int solution(int age) {
        int answer = 0;
        if(0<age&&age<=120) {
            answer = 2022-age+1;
        }
        return answer;
    }
    /*
        java에서 제공하는 time 패키지를 사용하면 년도의 변화를 직접 수정할 필요 없이 현재 날짜정보를 얻어올 수 있다. (까먹고 있었는데 다시 상기시킬 수 있어서 정말 도움이 되었던 문제.)
        
        만약 다시 풀게 된다면, 다음과 같이 풀 것이다.
        
        LocalDate currentYear = LocalDate.now().getYear();
        answer = currentYear - age + 1;
    */
}