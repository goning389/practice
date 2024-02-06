package Programmers;
import java.util.*;

/* 완주하지 못한 선수 */
public class Solution_20240129 {
    public static void main(String[] args) {
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
