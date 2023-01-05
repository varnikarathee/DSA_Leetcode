class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//         int count=0;
//         int i=0;
//         if(ruleKey.equals("type"))
//             i=0;
//         else if(ruleKey.equals("color"))
//             i=1;
//         else
//             i=2;
            
            
//         for(List<String> list: items){
           
//                     if(list.get(i).equals(ruleValue)){
//                         count++;
//                     }}
        
//         return count;
        int count =0;
        int i=0;
        switch(ruleKey){
            case "type": i=0;
                         break;
            case "color": i=1;
                         break;
            case "name": i=2;
                         break;
            default: i=0;
                
        }
        
        for(List<String> l: items){
            if(l.get(i).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}