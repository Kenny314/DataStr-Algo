package hannoi;

public class DispearingPair {
    public String solution(String S) {
        if(S == null ){
            return null;
        }
        if(S.equals("")){
            return "";
        }
        // write your code in Java SE 8
        char[] ch = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char a : ch){
            int size = sb.length();
            if(size > 0 && sb.charAt(size-1) == a){
                sb.deleteCharAt(size - 1);
            } else {
                sb.append(a);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DispearingPair dp =new DispearingPair();
        String S = "ACCAABBC";
        String r = dp.solution(S);
        System.out.println(r);
    }
}
