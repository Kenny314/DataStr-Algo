package hannoi;

import java.util.Arrays;
import java.util.Stack;

public class Solution3 {
    public int solution(int[] arr){
        int result = 0;
        for(int i : arr)
            result ^= i;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,2,5,3,3,4,4};
        Solution3 s = new Solution3();
        int r = s.solution(arr);
        System.out.println(r);
    }
}
