package Programmers;
import java.util.*;

/* 제일 작은 수 제거하기 */
public class Solution_21 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(solution(arr));
    }

    static int[] solution(int[] arr) {
        int[] answer = {};
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArr);
        int remove = copyArr[0];
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != remove){
                list.add(arr[i]);
            }
        }
        if(arr.length > 1){
            answer = new int[arr.length-1];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
