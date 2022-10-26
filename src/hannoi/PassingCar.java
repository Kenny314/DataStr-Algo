package hannoi;

public class PassingCar {
    public int solution(int[] A) {
        if(A == null || A.length == 0){
            return 0;
        }
        int countOne = 0;
        int pair = 0;
        for(int i = A.length-1;i>=0;i--){
            if(A[i] == 1){
                countOne++;
            } else {
                pair += countOne;
                if(pair == 1000000000)
                    return -1;
            }
        }
        return pair;
    }



    public static void main(String[] args) {
        PassingCar pc = new PassingCar();
        int[] A = new int[]{0,0,1,0,1,1};
        int sum = pc.solution(A);
        System.out.println(sum);
    }
}
