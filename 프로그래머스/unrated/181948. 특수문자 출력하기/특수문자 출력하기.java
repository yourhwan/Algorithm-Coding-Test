import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("!@#$%^&*(\\\'\"<>?:;");
        
        // \를 출력하려면 \\, '는 \', "는 \" 를 입력해주면 된다. 이것을 이스케이프 시퀀스라고 한다.
        // 오랜만에 봐서 까먹었지만 자주 사용하는 만큼 잘 기억해두자. 
        
        System.out.println(sb);
    }
}