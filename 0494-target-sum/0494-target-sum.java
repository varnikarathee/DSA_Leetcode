class Solution {
    public int findTargetSumWays(int[] nums, int target) {
     // ArrayList<Integer> list = expression(0,0,nums);
     //    int count=0;
     //    for(int i: list){
     //        if(i==target){
     //            count++;
     //        }
     //    }
        
        return expression(0,0,nums,target);
    }
    public int expression(int x,int i, int [] nums, int target){
       if(i==nums.length){
          if(x==target){return 1;}
          else{return 0;}
       }
         int c1=0,c2=0;
         c1+= expression(x+nums[i],i+1,nums,target);
         c2+= expression(x-nums[i],i+1,nums,target);
        
        return c1+c2;
       
    }
}