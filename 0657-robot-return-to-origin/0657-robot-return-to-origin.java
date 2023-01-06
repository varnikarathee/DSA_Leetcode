class Solution {
    public boolean judgeCircle(String moves) {
        char [] chars = moves.toCharArray();
        int sumx=0, sumy=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='L'){
                sumx+=-1;
            }
            else if (chars[i]=='D'){
                sumy+=-1;
            }
            else if (chars[i]=='R'){
                sumx+=1;
            }
            else{
                sumy+=1;
            }
        }
        
        if(sumx==0 && sumy==0){
            return true;
        }
        else{
            return false;
        }
    }
}