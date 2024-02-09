package Programmers;
import java.util.*;

/* 완주하지 못한 선수 */
public class Solution_1 {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(participant, completion));
    }

    static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}
