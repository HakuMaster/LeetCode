package leet1;

import java.util.*;

/**
 * Created by ll on 17-12-16.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0 ; i<nums.length ; i++) {
            for(int j = 0; j< nums.length; j++){
               if (nums[i]+nums[j] == target&&i!=j){
                  return new int[]{i,j};
               }
            }
        }
        throw  new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum2(nums, 9);
        System.out.println(ints);
    }
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i< nums.length; i++){
            map.put(nums[i],i);
        }
        for (int j = 0; j < nums.length; j++){
            if (map.containsKey(target - nums[j]) && map.get(target - nums[j])!= j){
                Integer i = map.get(target - nums[j]);
                return  new int[]{i,j};
            }
        }
throw new IllegalArgumentException("No two sum solution");
    }
}
