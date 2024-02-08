package BaekJoon;

import java.util.*;
/*
[list.remove]

index 1 삭제
list.remove(1);

value가 1인 element 삭제
list.remove(Integer.valueOf(1));
*/
public class Solution_4999 {
    public static void main(String[] args) {
        int[] notSubmitNum = new int[2];
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=30; i++){
            list.add(i);
        }

        for(int i=1; i<=28; i++){
            int submitNum = sc.nextInt();
            list.remove(Integer.valueOf(submitNum));
        }

        list.sort(Comparator.naturalOrder());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
