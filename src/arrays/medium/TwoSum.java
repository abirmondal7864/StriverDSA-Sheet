package arrays.medium;

import java.util.HashMap;
import java.util.Map;

class TwoSum{
    public int[] twoSum(int[] nums, int target) { 
        Map<Integer, Integer> map = new HashMap<>();  
        for (int i = 0; i < nums.length; i++) { 
            int needed = target - nums[i]; 
            if (map.containsKey(needed))  
                return new int[] { map.get(needed), i };
            map.put(nums[i], i); // adds the number and its index to the map  
        }   
        return new int[] {}; 
    }
}