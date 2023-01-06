class Solution {
    public boolean checkOnesSegment(String s) {
        String word1="01";
        String word2="11";
      
       
        
        if(s.contains(word1)){
            return false;
        }
        if(s.contains(word2)){
            return true;
        }

        return true;
    }
}