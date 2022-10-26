package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Deleting {
    //maximum
    public int solution(int N) {
        int DEL_NO = 5;
        if(N / 10 == 0){
            throw new ArithmeticException("at least two digits decimal");
        }
        String strN = String.valueOf(N);
        if(!strN.contains("5")){
            throw new ArithmeticException("wrong number");
        }
        long count = strN.chars().filter(ch -> ch == '5').count();
        int[] result = new int[(int) count];
        byte[] subNum = strN.getBytes();
        int pos = 0;
        count = 0;
        StringBuffer sb = new StringBuffer();

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < strN.length();i++ ){
            map.put(i,Integer.parseInt(String.valueOf(strN.charAt(i))));
        }
        map.keySet().iterator();

        Arrays.sort(result);
        return result[result.length - 1];
    }

    public static void main(String[] args) {
        Deleting d = new Deleting();
        d.solution(545551);
    }
}
