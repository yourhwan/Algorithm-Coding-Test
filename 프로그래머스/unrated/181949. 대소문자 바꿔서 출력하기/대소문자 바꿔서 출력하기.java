import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rs = "";
        
        for(Character c : str.toCharArray()) {
            
            if(Character.isUpperCase(c)) {
                rs += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)) {
                rs += Character.toUpperCase(c); 
            }
        }// end of for()-------------------------
        
        System.out.println(rs);
    }
}