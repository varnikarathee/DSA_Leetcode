class Solution {
    public void reverseString(char[] s) {
        helper(s,0,s.length-1);
       
    }
    public void helper(char[] arr, int s, int e ){
        if(s>=e){
            System.out.println(Arrays.toString(arr));
            return;
        }
        
        char ch = arr[s];
        arr[s]=arr[e];
        arr[e]=ch;
        
        helper(arr,s+1,e-1);
    }
    
}