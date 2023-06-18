class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> list= new ArrayList<>();
        
        int top =0;
        int bottom= mat.length-1;
        int left= 0;
        int right= mat[0].length-1;
        
        while(true){
            for(int i=left;i<=right;i++){
                list.add(mat[top][i]);
            }
            top++;
            if(top>bottom || left>right){
                break;
            }
            
            for(int i=top;i<=bottom;i++){
                list.add(mat[i][right]);
            }
            right--;
            if(top>bottom || left>right){
                break;
            }
            for(int i=right;i>=left;i--){
                list.add(mat[bottom][i]);
            }
            bottom--;
            if(top>bottom || left>right){
                break;
            }
            for(int i=bottom;i>=top;i--){
                list.add(mat[i][left]);
            }
            left++;
            if(top>bottom || left>right){
                break;
            }
            
        }
        return list;
    }
}