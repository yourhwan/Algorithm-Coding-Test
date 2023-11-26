class Solution {
    public String solution(int age) {
        String answer = "";
        String a = String.valueOf(age);
        String[] arr = a.split("");
        
        for(String change : arr) {
            answer += (char)(Integer.parseInt(change)+97); 
        }
        
        return answer;
    }
}
// 아스키코드를 이용하는 문제
// 아스키코드에서 A는 65, a는 97이다.
// 문자열을 Integer 타입으로 변환하고 97을 더하면 아스키코드의 a가 나온다. 이후 char타입으로 형변환을 해주어 다시 answer에 담아준다.
// 나이는 int로 선언되어있지만, answer의 경우 String 이기 때문에 형변환이 필수다.