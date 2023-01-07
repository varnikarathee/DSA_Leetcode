class Solution {
    public String longestCommonPrefix(String[] strs) {
        return lcp(strs,0,strs.length-1);
    }
    public String lcp(String [] s, int l , int r){
        if(l==r){
            return s[l];
        }
        else{
            int m = (l+r)/2;
            String left = lcp(s,l,m);
            String right= lcp(s,m+1,r);
            return commonprefix(left,right);
        }

    }

    public String commonprefix(String left, String right){
        int min =Math.min(left.length(),right.length());
        for(int i=0;i<left.length() && i<right.length();i++){
            if(left.charAt(i)!=right.charAt(i)){
                return (left.substring(0,i));
            }
        }
        return left.substring(0,min);
    }
}