class Solution {
public int[] searchRange(int[] nums, int target) {
int[] ans = new int[2];
ans[0] = firstOccurrence(nums, target);
ans[1] = lastOccurrence(nums, target);

    return ans;
}

int firstOccurrence(int[] nums,int target){
    int s = 0, e = nums.length - 1, mid, in = -1;
    
    while(s <= e){
        mid = s + (e - s) / 2;
        
        if(nums[mid] == target){
            in = mid;
            e = mid - 1;
        }
        
        else if(target < nums[mid])
            e = mid - 1;
        
        else
            s = mid + 1;
    }
    
    return in;
}

int lastOccurrence(int[] nums,int target){
    int s = 0, e = nums.length - 1, mid, in = -1;
    
    while(s <= e){
        mid = s + (e - s) / 2;
        
        if(nums[mid] == target){
            in = mid;
            s = mid + 1;
        }
        
        else if(target < nums[mid])
            e = mid - 1;
        
        else
            s = mid + 1;
    }
    
    return in;
}
}