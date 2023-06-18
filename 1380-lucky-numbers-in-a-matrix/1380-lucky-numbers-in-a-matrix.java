class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int m= mat.length;
//         int n= mat[0].length;
//         int [] mi= new int[m];
//         int [] mx= new int[n];
        
//         Arrays.fill(mi, Integer.MAX_VALUE);
        
//         for(int i=0;i<m;++i){
//             for(int j=0;j<n;++j){
//                 mi[i]= Math.min(mat[i][j], mi[i]);
//                 mx[j]= Math.min(mat[i][j], mx[j]);
//             }
//         }
        
//         for(int i=0;i<m;++i){
//             for(int j=0;j<n;++j){
//                 if(mi[i]==mx[j]){
//                     list.add(mi[i]);
//                     break;
//                 }
//             }
//         }
        int m = matrix.length, n = matrix[0].length;
        int[] mi = new int[m], mx = new int[n];
        Arrays.fill(mi, Integer.MAX_VALUE);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                mi[i] = Math.min(matrix[i][j], mi[i]);
                mx[j] = Math.max(matrix[i][j], mx[j]);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (mi[i] == mx[j])  {
                    res.add(mi[i]);
                    break;           // credit to @Ausho_Roup
                }
            }
        }
        
     return res;
        
        
    }
}