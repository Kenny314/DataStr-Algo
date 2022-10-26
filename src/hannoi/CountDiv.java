package hannoi;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int temp = A;//位置
        int sum=0;
        if(B < K){
            return 0;
        }
        //找到第一个可以整除的数字位置 头
        while(temp <= B){
            if(temp % K != 0){
                //骑士整除位置
                temp ++;
            } else {
                //倍数
                break;
            }
        }
        //找尾部
        int a = B;
        while(a <= A){
           if(a % K != 0){
               a--;
           } else {
               break;
           }
        }

        sum = (a - temp) / K + 1;

        return sum;
    }

    public static void main(String[] args) {
        CountDiv cd = new CountDiv();
        int result = cd.solution(0,1,11);
        System.out.println(result);
    }
}
