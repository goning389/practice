package Programmers;

/* 수 조작하기 2 */
public class Solution_54 {
    public static void main(String[] args) {
        String binomial = "0 - 7777";
        System.out.println(solution(binomial));
    }

    static int solution(String binomial) {
        System.out.println(binomial);
        String[] array = binomial.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        int answer = 0;
        // ★★★ 배열 값을 비교할 때에는 == 쓰면 안 되고 꼭 equals로 해야함
        if(array[1].equals("+")){
            answer = a+b;
        } else if (array[1].equals("-")){
            answer = a-b;
        } else if (array[1].equals("*")){
            answer = a*b;
        }
        return answer;
    }
}