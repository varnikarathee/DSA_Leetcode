class Solution {
    public String freqAlphabets(String s) {
        
        // int check = 2;
        // String ans = "";
        // for(int i = 0 ; i < s.length() ; i++)
        // {
        //     if(i < s.length()-2 && s.charAt(i+check)=='#')
        //     {
        //         int m = Character.getNumericValue(s.charAt(i));
        //         int n = Character.getNumericValue(s.charAt(i+1));
        //         int z = m*10 + n;
        //         ans = ans+(char)('a'+z-1);
        //         i=i+check;
        //     }
        //     else
        //     {
        //         int m = Character.getNumericValue(s.charAt(i));
        //         ans = ans+(char)('a'+m-1);
        //     }

            
        // }
        
        String ans="";
        for(int i=0;i<s.length();i++){
            if(i<s.length()-2 && s.charAt(i+2)=='#'){
                int m = Character.getNumericValue(s.charAt(i));
                 int n = Character.getNumericValue(s.charAt(i+1));
                 int z=m*10+n;
                 ans=ans+(char)('a'+z-1);
                 i=i+2;

            }
            else{
                 int m = Character.getNumericValue(s.charAt(i));
                 ans=ans+(char)('a'+ m-1);
            }
        }
        return ans;
    
    }
}