package hannoi;

public class Power {
    public int solution(int N) {
        if(N == 0){
            return -1;
        }
        if(N % 2 != 0){
            return 0;
        }
        String bin = Integer.toBinaryString(N);
        String[] b = bin.split("");
        int count = 0;
        for(int i = b.length -1;i!=0;i--){
            int  temp = Integer.parseInt(b[i]);
            if(temp == 0){
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Power p = new Power();
        int r = p.solution(100000);
        System.out.println(r);
    }
}
