// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int [] arr=new int[nums.length];
//         int k=0;
//         for(int i=0;i<nums.length/2;i++){
          
//             arr[k]=nums[i];
            
//             arr[k+1]=nums[i+(nums.length/2)];
//                k=k+2;
           
//         }
        
       
//         return arr;
//     }
// }

class Solution {
    public int[] shuffle(int[] arr, int n) {
        int[] ans = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length/2;i++){
            ans[k] = arr[i];
            ans[k+1] = arr[i+(arr.length/2)];
            k+=2;
        }
        return ans;
    }
}