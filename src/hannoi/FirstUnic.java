package hannoi;

import java.util.HashMap;
import java.util.Map;

public class FirstUnic {
    public int solution(int[] A) {
        int result = -1;
        if(A == null || A.length == 0){
            return result;
        }
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i<A.length;i++){
            Integer num = map.get(A[i]);
            if(num == null){
                map.put(A[i],0);
            } else {
                map.put(A[i],num + 1);
            }
        }
        for(int i = 0;i<A.length;i++){
            Integer t = map.get(A[i]);
            if(t == 0){
                result = A[i];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 1, 4, 4,6, 6, 8, 9, 10, 11, 11, 11, 11, 15, 17, 17, 17, 19, 20};
        FirstUnic f = new FirstUnic();
        int r = f.solution(A);
        System.out.println(r);
    }
}
