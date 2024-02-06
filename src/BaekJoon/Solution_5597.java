package BaekJoon;
import java.util.*;

public class Solution_5597 {
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
