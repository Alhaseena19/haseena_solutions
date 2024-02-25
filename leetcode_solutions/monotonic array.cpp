class Solution {
    public boolean isMonotonic(int[] nums) {
    if(nums.length<=2)
    {
        return true;
    }
    int diff1=nums[1]-nums[0];
    for(int i=2;i<nums.length;++i)
    {
        int diff2=nums[i]-nums[i-1];
        if(diff1*diff2 <0) return false;
        if(diff2!=0)
        {
             diff1=diff2;
        }

    }
    return true;
        
    }
}
   
