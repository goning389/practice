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
        Scanner sc = new Scanner(System.in);
        String me = sc.next();
        String doc = sc.next();
        int meCnt = 0;
        int docCnt = 0;
        for(int i=0; i<me.length(); i++){
            if(me.charAt(i) == 'a'){
                meCnt++;
            }
        }
        for(int i=0; i<doc.length(); i++){
            if(doc.charAt(i) == 'a'){
                docCnt++;
            }
        }
        if(meCnt >= docCnt){
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
