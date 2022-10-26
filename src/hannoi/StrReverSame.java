package hannoi;

public class StrReverSame {
    public int solution(String S) {
        int result = -1;
        if(S == null || "".equals(S) || S.length()%2 == 0){
            return result;
        }

        StringBuilder sb = new StringBuilder(S);
        StringBuilder reverS = sb.reverse();
        if(S.equals(reverS.toString())){
            //对称字符串
            result = S.length()/2;
        } else {
            return result;
        }
        return  result;
    }

    public static void main(String[] args) {
        StrReverSame s = new StrReverSame();
        String ss = "rac565car";
        int t = s.solution(ss);
        System.out.println(t);
    }
}
