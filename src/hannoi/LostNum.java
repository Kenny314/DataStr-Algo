package hannoi;

import java.util.Arrays;

public class LostNum {
    public int solution(int[] A) {
        if(A == null || A.length == 0 ){
            return 1;
        }

        double sum = (A.length+1)*(1 + (A.length+1))/2;

        for(int n : A){
            sum -= n;
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        LostNum l = new LostNum();
//        int[] A = new int[]{1, 2, 4, 5,6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] A = new int[]{};
        int re = l.solution(A);

        System.out.println(re);
    }
}
