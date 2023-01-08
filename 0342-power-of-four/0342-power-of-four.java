class Solution {
    public boolean isPowerOfFour(int n) {
        
    if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        
       return recur(n);   
    
    }
     public boolean recur(int n){
        if(n%4!=0 || n<4){
            return false;
        }
        if(n==4){
            return true;
        }
        return recur(n/4);
    }
}