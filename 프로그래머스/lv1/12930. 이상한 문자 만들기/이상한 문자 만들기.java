class Solution {
    public String solution(String s) {
        String answer = "";
        
        boolean toUpper = true; // 대문자일 경우 참, 소문자일 경우 거짓
        
        StringBuilder sb = new StringBuilder();
        
        for(char chr : s.toCharArray()) {
            
            if(!Character.isAlphabetic(chr)) {
                sb.append(chr);
                // 공백문자의 경우 그대로 공백문자 처리를 해준다
                toUpper = true;
                // 공백문자는 대소문자 여부 판단을 못하기 때문에 다음 문자부터 대소문자 여부를 판단 후 대문자로 변환
                // 공백문자 다음에 오는 인덱스는 무조건 단어의 시작이므로 짝수취급(0번째 인덱스로 취급)
            }
            else { // else문의 경우 이미 알파벳임이 확인된 변수 c임. 때문에 대소문자 변환만 알맞게 진행해주면 된다.
                if(toUpper) {
                    sb.append(Character.toUpperCase(chr));
                }
                else {
                    sb.append(Character.toLowerCase(chr));
                }
                toUpper = !toUpper;
            }// end of else
            
        }// end of for
        
        return sb.toString();
    }
}