import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a + b;

        String d = c.trim(); // d를 if 문 외부에서 선언하고 값을 설정

        if (a.length() >= 1 && a.length() <= 10 && b.length() >= 1 && b.length() <= 10) {
            System.out.println(d);
        }
    }
}
