class Solution {
    public static char findKthBit(int n, int k) {
        String res=Bs(n);
        return res.charAt(k-1);
    }
    public static String invert(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c: str.toCharArray()){
            if(c=='1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        return sb.toString();
    }
    
    private static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    
    public static String Bs(int n){
        if(n==1){
            return "0";
        }
        String x= Bs(n-1);
        String y=reverse((invert(x)));
         
        return x+"1"+y;
        
    }
}
