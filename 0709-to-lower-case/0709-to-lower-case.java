class Solution {
    public String toLowerCase(String s) {
        char [] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90 ){
                chars[i]=(char)(s.charAt(i)+32);            }
        }
        
        return new String(chars);
    }
}