class Solution {
    public boolean halvesAreAlike(String s) {
  Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int counter = 0;
        int i = 0;
        int j = s.length() - 1;
        
        while(i < j){
            if(set.contains(s.charAt(i))) counter++;
            if(set.contains(s.charAt(j))) counter--;
            i++;
            j--;
        }
        return counter==0;
        
        
        
}    
    
}