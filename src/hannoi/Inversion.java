package hannoi;

public class Inversion {
    public int solution(int[] A) {
            if(A == null||A.length==0){
                return -1;
            }
            int count = 0;
            for(int i =0;i<A.length;i++){
                for(int j=i;j<A.length;j++){
                    if(A[j] < A[i]){
                        count++;
                        if(count == 1000000000){
                            return -1;
                        }
                    }
                }
            }
            return count;

    }

    public static void main(String[] args) {
        int[] A = new int[]{-1,6,3,4,7,4};
        Inversion in = new Inversion();
        int c = in.solution(A);
        System.out.println(c);
    }
}
