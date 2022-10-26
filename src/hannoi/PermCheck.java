package hannoi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A == null || A.length == 0){
            return 0;
        }
        int expectSum = 0;
        for(int i = 0;i<A.length+1;i++){
            expectSum += i;
        }

        Map<Integer,Integer> m = new HashMap();
        for(int i = 0 ;i<A.length;i++){
            int t = 0;
            if(m.get(A[i]) == null){
                m.put(A[i],t);
            } else {
                return 0;
            }

        }

        int sum = Arrays.stream(A).sum();
        if(sum - expectSum == 0){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        PermCheck pc = new PermCheck();
        int[] A = new int[]{1,4,1};
        int r = pc.solution(A);
        System.out.println(r);
    }
}
