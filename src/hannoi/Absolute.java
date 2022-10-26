package hannoi;

import java.util.Arrays;

public class Absolute {
    public int solution(int[] A) {
        if(A == null || A.length == 1){
            return -1;
        }
        int p = 1;
        int abs = 1000000;
        int sum = Arrays.stream(A).sum();

        for(int i = 0;i < A.length;i++){
            int t = Math.abs(sum - A[i]);
            if(t < abs)
                abs = t;

        }
        return 0;
    }
}
