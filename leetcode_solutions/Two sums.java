//Brute force Approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            
            for(int j=i+1;j<nums.length;j++)
            {
                 if(nums[i]+nums[j]== target)
                 {
                  return new int[]{i,j};
                 }
            }
        }
        return new int[]{};
        
        
    }
}
//Using Hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],i);
        }
         for(int i=0;i<nums.length;i++)
        {
            int c=target-nums[i];
            if(mp.containsKey(c) && mp.get(c)!=i)
            {
                return new int[]{i,mp.get(c)};
            }
        }
        return new int[0];
        
