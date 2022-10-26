package hannoi;

import java.util.HashMap;
import java.util.Map;

public class DNA {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        Map<String,Integer> map = new HashMap();
        map.put("A",1);
        map.put("C",2);
        map.put("G",3);
        map.put("T",4);
        if(P == null || Q == null || P.length != Q.length){
            return null;
        }
        int[] result = new int[P.length];
        StringBuilder sb = new StringBuilder(S);
        for(int i = 0;i < P.length;i++){
            int s = P[i];
            int e = Q[i];
            String subStr = sb.substring(s,e+1);
            if(subStr.contains("A")){
                result[i] = map.get("A");
            } else if(subStr.contains("C")){
                result[i] = map.get("C");
            } else if(subStr.contains("G")){
                result[i] = map.get("G");
            } else {
                result[i] = map.get("T");
            }

        }
        return result;
    }

    public static void main(String[] args) {
        DNA d = new DNA();
        String s = "CAGCCTA";
        int[] P = new int[]{2,5,0};
        int[] Q = new int[]{4,5,6};

        int[] r = d.solution(s,P,Q);
    }
}
