package Programmers;

/* 글자 지우기 */
public class Solution_31 {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(solution(my_string, indices));
    }

    static String solution(String my_string, int[] indices) {
        String answer = "";
        String[] array = my_string.split("");

        for(int i=0; i<indices.length; i++){
            array[indices[i]] = "";
        }
        for(int i=0; i<array.length; i++){
            answer += array[i];
        }
        return answer;
    }
}