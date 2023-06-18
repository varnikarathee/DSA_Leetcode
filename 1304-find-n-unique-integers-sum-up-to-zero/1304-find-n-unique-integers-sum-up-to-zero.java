class Solution {
    public int[] sumZero(int n) {
        int[] sol=new int[n];
        
            sol[n/2]=0;
            for(int i=0;i<n/2;i++){
                sol[i]=i+1;
                sol[n-1-i]=-(sol[i]);
            }
       return sol;
        
    }
}