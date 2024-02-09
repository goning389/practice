package Programmers;
import java.util.*;

/* 두 개 뽑아서 더하기 */
public class Solution_4 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        System.out.println(solution(numbers));
    }

    static int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int result = 0;

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                result = numbers[i] + numbers[j];
                if(!list.contains(result)){
                    list.add(result);
                }
            }
        }
        //Collections.sort(list); -> list를 정렬한 후 answer에 넣는다.
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer); //-> answer에 넣은 후 배열을 정렬한다.
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
