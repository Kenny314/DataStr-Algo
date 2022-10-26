package hannoi;

public class Jump {
    public int solution(int X, int Y, int D) {
        if(X < 0 || Y < 0 || D < 0){
            return -1;
        }
        if(X > Y)
            return -1;
        int integer = (Y - X) / D;

        int m = (Y - X) % D;

        if(m == 0){
            return integer;
        } else {
            return (integer + 1);
        }

    }

    public static void main(String[] args) {
        Jump j = new Jump();
        int r = j.solution(30,40,15);
        System.out.println(r);
    }
}
