class Solution {
    public String sortSentence(String s) {
//         String str[] = s.split(" ");
//         String res[] = new String [str.length];
        
//         for( String x: str){
//             int idx = (x.charAt(x.length()-1)-'0');
//             res[idx-1]=x.substring(0,x.length()-1);
            
//         //     int idx = (x.charAt(x.length()-1)-'0');
//         // res[idx-1] = x.substring(0, x.length()-1);
//         }
        
//         String k = "";
//         for(int i=0;i<res.length-1;i++){
//             k+=res[i];
//             k+=" ";
//         }
        
//         k+=res[res.length-1];
        
//         // for(String k: str){
//         //     int n = k.length()-1;
//         //     char c =k.charAt(n);
//         //     int x = Character.getNumericValue(c);
//         //     res[x-1] = k.substring(0,n);
//         // }
//         // String sk="";
//         //  sk = String.valueOf(res);
//         return sk;
        
        String st[] = s.split(" ");
        String res[]= new String[st.length];
        for(String y: st){
            int x= y.length();
            int lastletter = (y.charAt(x-1)-'0');
            res[lastletter-1]= y.substring(0,x-1);
            
        }
        String k="";
        for(int i=0;i<res.length;i++){
            if(i==res.length-1){
                k=k+res[i];
                break;
            }
            else{
              k=k+res[i]+" ";
              
            }
        }
        
        return k;
        
    }
}