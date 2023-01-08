class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        
       return recur(n);   
    }
    
   
    public boolean recur(int n){
        if(n%3!=0 || n<3){
            return false;
        }
        if(n==3){
            return true;
        }
        return recur(n/3);
    }
}