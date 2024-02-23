package Programmers;

/* 하샤드 수 */
public class Solution_38 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    static boolean solution(int x) {
        boolean answer = true;
        String[] arr = String.valueOf(x).split("");
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        if(x%sum != 0){
            answer = false;
        }
        return answer;
    }
}