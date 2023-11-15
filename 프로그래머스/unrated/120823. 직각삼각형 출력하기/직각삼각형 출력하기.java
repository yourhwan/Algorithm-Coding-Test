import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(1<=n&&n<=10) {
            for(int i=1; i<=n; i++) {
                for(int k=0; i>k; k++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        
    }
}