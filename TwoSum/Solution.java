package TwoSum;

import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static int[] helper(int[] nums, int target){
        HashMap<Integer, Integer> mapper = new HashMap<>();
        for (int i=0;i<nums.length; i++){
            if (mapper.containsKey(target-nums[i])){
                return new int[]{i, mapper.get(target-nums[i])};
            }
            mapper.put(nums[i], i);
        }

        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[] nums = {3,2,4};

        int target = 6;

        System.out.println(Arrays.toString(helper(nums, target)));
    }
}