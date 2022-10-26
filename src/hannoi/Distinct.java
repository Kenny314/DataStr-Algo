package hannoi;

import java.util.Arrays;

public class Distinct {

    public int solution2(int[] nums) {
        Arrays.sort(nums);
        //取数组元素的长度
        int len = nums.length;
        //如果最大元素为负值；则最后3个数组元素的乘积为最大值
        if(nums[len-1]<0)
            return nums[len-1]*nums[len-2]*nums[len-3];
        //否则，数组元素有正数，也有负数，这时先计算最后三个数组元素的乘积（对应数组元素全部为正数的情况）
        int p1 = nums[len-1]*nums[len-2]*nums[len-3];
        //然后计算数组中最后一个元素与数组中第1个元素，第2个元素的乘积（对应数组元素存在负数的情况）
        int p2 = nums[len-1]*nums[0]*nums[1];
        //返回两者中较大的一个乘积结果
        return p1 > p2?p1:p2;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A == null || A.length == 0){
            return -1;
        }
        int[] result = Arrays.stream(A).distinct().toArray();
        if(result != null){
            return result.length;
        }
        return 0;
    }

    public static void main(String[] args) {
        Distinct d = new Distinct();
//        int[] A = new int[]{2,3,3,2,3,1};
        int[] A = new int[]{0,1};
        int result = d.solution(A);
        System.out.println(result);
    }
}
