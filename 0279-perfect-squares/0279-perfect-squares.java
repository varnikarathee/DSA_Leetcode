class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        int max=Integer.MAX_VALUE;
        Arrays.fill(dp,max);
        dp[0]=1;
        for(int i=1;i*i<=n;i++){
            
            dp[i*i]=1;
        }int min=1;
       ArrayList<Integer> list=new ArrayList();
        for(int i=1;i<=n;i++){
            double num=(double)i;
            if(checkPerfectSquare(num)){
                min=(int)num;
                list.add(min);
                dp[i]=1;
            }else{
                for(int j=0;j<list.size();j++){
                    dp[i]=Math.min(dp[i],dp[list.get(j)]+dp[i-list.get(j)]);
                }
                
            }
           
            

        }return dp[n];
    }
    static boolean checkPerfectSquare(double number){   
          double sqrt=Math.sqrt(number);   
          return ((sqrt - Math.floor(sqrt)) == 0);   
    }  
}