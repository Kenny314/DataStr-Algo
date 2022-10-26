package hannoi;

public class Solution2 {
    public int[] solution(int[] A , int K){
        if(A == null || A.length == 0)
            return A;
        //bigger than A.length, rotating is K % A.length
        if(K > A.length && A.length != 0)
            K = K % A.length;
        // judge rotate times
        if(K == A.length || K == 0)
            return A;
        int[] temp = new int[A.length];

        for(int j = 0,i = A.length - K; i < A.length; i++,j++){
            temp[j] = A[i];
        }
        for(int i = 0,j = K; j < temp.length; i++,j++){
            temp[j] = A[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] A = new int[]{3, 8, 9, 7, 6};
        int K = 33;
        Solution2 s = new Solution2();
        int[] r = s.solution(A,K);

        System.out.println("------");
        for(int i = 0;i < r.length;i++){
            System.out.println(r[i]);
        }
    }
}
