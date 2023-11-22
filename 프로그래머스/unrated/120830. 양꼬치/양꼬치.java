class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int s = n/10;
        int y = n*12000;
        int d = k*2000-(2000*s);
        
        answer = y+d;
        
        return answer;
    }
}