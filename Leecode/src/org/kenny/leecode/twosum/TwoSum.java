package org.kenny.leecode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Inte
 *
 * @author Kenny WANG
 * @create 2022/11/18 10:39
 */
public class TwoSum {
    private Map<Integer, Integer> keep;

    /**
     * https://leetcode.com/problems/two-sum/
     * @param nums
     * @param target
     * @return
     * 6ms 46.1MB
     */
    public int[] twoSum(int[] nums, int target) {
        /*
        如果数组的value有重复，就会被覆盖，因为只找到最近的一个，所以不存在问题。
         */
        Map<Integer,Integer> keep = new HashMap<>(nums.length);
        for(int i = 0;i < nums.length;i++){
            //
            int complement = target - nums[i];
            if(keep.containsKey(complement)){
                return new int[]{keep.get(complement),i};
            } else {
                keep.put(nums[i],i);
            }
        }
        return null;
    }

    /**
     * 2次循环
     * @param nums
     * @param target
     * @return
     * 15ms, 47.2MB
     */
    public int[] twoSum2(int[] nums, int target){
        Map<Integer,Integer> keep = new HashMap<>(nums.length);
        for(int i = 0;i<nums.length;i++){
            if(keep.containsKey(nums[i]) && nums[i] * 2 == target){
                return new int[]{i,keep.get(nums[i])};
            }
            keep.put(nums[i],i);
        }
        Arrays.sort(nums);
        for(int i = 0;i< nums.length;i++){
            int comp = target - nums[i];
            int index = Arrays.binarySearch(nums,comp);
            if( index >= 0){
                return new int[]{keep.get(nums[i]),keep.get(comp)};
            }
            continue;
        }
        return null;
    }

    /**
     * 使用数组嵌套循环来进行比较
     * @param nums
     * @param target
     * @return
     * 89ms 42.4MB
     */
    public int[] twoSum3(int[] nums, int target){
        for(int i = 0; i < nums.length - 1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
                continue;
            }
            continue;
        }
        return null;
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] a = new int[]{3,2,4};
        int[] result = twoSum.twoSum2(a,6);
    }
}
