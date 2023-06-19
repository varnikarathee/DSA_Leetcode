class Solution {
    public boolean canJump(int[] nums) {
      int max=0;
        for(int i=0;i<nums.length;i++){
        if(i==nums.length-1) return true;
        if(max==0 && nums[i]==0) return false;
        if(nums[i]>max)max= nums[i];
            max--;
        }
        return false;
    }
}