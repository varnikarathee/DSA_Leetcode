class Solution {
    public void setZeroes(int[][] matrix) {
        
//         int m= matrix.length, n= matrix[0].length;
//         int[][] ans= new int[m*n][2];
//         String s="";
//         int v=0;
//          for(int i=0;i<m;i++){
//              for(int j=0;j<n;j++){
//                  if(matrix[i][j]==0){
// //                      r=i; c=j;
// //                      if(s.contains(Integer.toString(r))){
// //                          v++;
// //                      }
// //                      else if(s.contains(Integer.toString(c))){
// //                          v++;
// //                      }
// //                      else{
// //                      makezero(matrix,i,j,m,n);
// //                      s+= Integer.toString(i);
// //                      s+=Integer.toString(j);
                     
// //                     }
//                      ans[v][0]=i;
//                      ans[v][1]=j;
//                      v++;
                     
//                  }                 
//              }
//          }
        
//         for(int i=0;i<m;i++){
//             makezero(matrix,ans[i][0],ans[i][1],m,n);
            
//         }
        
//     }
    
//     public static void makezero(int[][] arr, int r,int c, int m, int n){
//         for(int i=0;i<m;i++){
//             arr[i][c]=0;
//         }
//         for(int j=0;j<n;j++){
//             arr[r][j]=0;
//         }
//     }
       int row= matrix.length;
        int col= matrix[0].length;
        int [] dummyRow = new int[row];
        int [] dummyCol = new int[col];
        Arrays.fill(dummyRow, -1);
        Arrays.fill(dummyCol, -1);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    dummyRow[i]=0;
                    dummyCol[j]=0;
                    
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dummyRow[i]==0 || dummyCol[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        
}
}

