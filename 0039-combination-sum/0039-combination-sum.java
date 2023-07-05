class Solution {
        
  public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<List<Integer>> targetList= new ArrayList<>();
      Arrays.sort(nums);
    combination(nums, target, 0,0,targetList, new ArrayList<>());
    return targetList;
}

public static void combination(int[] arr, int target, int cs,int i, List<List<Integer>> ans, List<Integer> temp){
    if(cs>target){
        return;
    }
    if(cs==target){
        Collections.sort(temp);
        if(!ans.contains(temp)){
        ans.add(new ArrayList<>(temp));
        }
        return;
    }
    
    for(int j=i;j<arr.length;j++){
        cs+=arr[j];
        temp.add(arr[j]);
        combination(arr,target,cs,j,ans,temp);
        cs-=arr[j];
        temp.remove(temp.size()-1);
    }


   }
}

