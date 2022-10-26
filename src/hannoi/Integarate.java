package hannoi;

public class Integarate {
    public String solution(int A, int B) {
        int b_sep=0;
        if(B % 2 == 0){
            b_sep = B / 2;
        } else {
            b_sep = B / 2 + 1;
        }
        int a_sep=0;
        if(A % 2 == 0){
            a_sep = A / 2;
        } else {
            a_sep = A / 2 + 1;
        }
        //0 begin with b, 1 begin with a
        int tip = -1;
        //start with B
        if(b_sep >= a_sep){
            tip = 0;
        } else {
            tip = 1;
        }
        return "";
    }
}
