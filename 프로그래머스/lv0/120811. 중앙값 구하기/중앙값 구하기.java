import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        // Arrays.sort(); 는 배열을 오름차순으로 정렬해준다.
        // 만약 내림차순으로 정렬하고자 한다면, Arrays.sort(array,Collections.reverseOrder());을 하면 된다.
        answer = array[array.length/2];
        // JAVA에서 /는 소수점 이하 부분이 버려지고 정수부만 나타난다. 때문에 /를 사용하는 것이 옳은 풀이다.

        return answer;
    }
}
