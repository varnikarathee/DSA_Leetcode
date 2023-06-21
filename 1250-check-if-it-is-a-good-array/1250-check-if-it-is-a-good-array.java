class Solution {
    public boolean isGoodArray(int[] nums) {
        //gcd of numbers
        if(nums.length == 0){
            return false;
        }
        int ans = nums[0];
        for(int i = 1;i < nums.length;i++){
            ans = gcd(ans, nums[i]);
        }
        if(ans == 1) return true;
        else return false;
    }
    public int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b % a, a);
    }
}