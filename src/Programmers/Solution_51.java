package Programmers;
import java.util.*;

/* 문자열 잘라서 정렬하기 */
public class Solution_51 {
    public static void main(String[] args) {
        String myString = "dxccxbbbxaaaa";
        System.out.println(solution(myString));
    }

    static String[] solution(String myString) {
        String[] myStringSplit = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(myStringSplit);
        for(int i=0; i<myStringSplit.length; i++){
            if(myStringSplit[i].length() > 0){
                list.add(myStringSplit[i]);
            }
        }
        //list->배열로 전환
        String[] answer = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}