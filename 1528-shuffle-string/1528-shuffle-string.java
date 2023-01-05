class Solution {
    public String restoreString(String s, int[] indices) {
    //    char [] chars= s.toCharArray();
    //     for(int i=0;i<indices.length;i++){
            
    //        char ch = s.charAt(i);
    //        chars[indices[i]]=ch;             
    //     } 
        
    //     s=String.valueOf(chars);
    //     return s;
    
    // char[] chars = s.toCharArray();
    // for(int i=0;i<indices.length;i++){
    //     chars[indices[i]]=s.charAt(i);
    // }
    // s=String.valueOf(chars);
    // return s;
    
    char[] chars = s.toCharArray();
    for(int i=0;i<indices.length;i++){
        chars[indices[i]]=s.charAt(i);

    }
    s=String.valueOf(chars);
    return s;


    // char[] chars= s.toCharArray();
    // String r="";
    // for(int i=0;i<chars.length;i++){
    //     r=r+chars[indices[i]];
    // }
     
    //  return r;

    }
}