class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        // 입력 문자열(my_string)에서 인덱스 0부터 s-1까지의 부분 문자열을 answer에 복사합니다.
        answer = my_string.substring(0, s);

        // 그 다음, 덮어쓸 문자열(overwrite_string)을 answer에 추가합니다.
        answer += overwrite_string;

        // 덮어쓴 문자열 다음부터 원래 문자열(my_string)의 끝까지의 부분 문자열을 answer에 추가합니다.
        answer += my_string.substring(s + overwrite_string.length(), my_string.length());

        // 최종 결과인 answer를 반환합니다.
        return answer;
    }
}