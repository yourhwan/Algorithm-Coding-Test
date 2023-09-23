class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        // int를 string으로 변환 후 문자열끼리 더해준다. 이후 Integer.parseInt()를 이용해 다시 int로 형변환을 해준다.
        
        
        answer = Math.max(ab,ba);
        // Math 클래스의 .max(a,b); 메소드는 인자 a와 b 중 더 큰 인자를 리턴 한다.
        // .min(a,b); 메소드는 더 작은 인자를 리턴 한다.
        
        return answer;
    }
}