package Programmers;
import java.util.*;

/* 나누어 떨어지는 숫자 배열 */
public class Solution_28 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(solution(arr, divisor));
    }

    static int[] solution(int[] arr, int divisor) {
        int answerCnt = 0;
        int arrInt = 0;
        int[] answer;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answerCnt++; //담을 배열 자릿수 결정
            }
        }
        if(answerCnt == 0){
            answer = new int[1];
            answer[0] = -1;
        } else{
            answer = new int[answerCnt];
            for(int i=0; i< arr.length; i++){
                if(arr[i]%divisor == 0){
                    answer[arrInt] = arr[i];
                    arrInt++;
                }
            }
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

/*
int count=0;
int two=0;
for(int i=0; i< arr.length; i++){
    if(arr[i]%divisor==0)
   count++;
}
int[] ret = new int[count];
for(int i=0; i< arr.length; i++){
    if(arr[i]%divisor==0)
    ret[two++]=arr[i];
}
    Arrays.sort(ret);
    return ret;
}
*/