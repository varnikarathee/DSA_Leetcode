class Solution {
    public int search(int[] nums, int target) {
      
        return helper(nums,target,0,nums.length-1);
    }
    public static int helper(int [] nums, int target,int s, int e){
        int mid = s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            return helper(nums, target,s,mid-1);
        }
        else{
            return helper(nums,target,mid+1,e);
        }
    }
}