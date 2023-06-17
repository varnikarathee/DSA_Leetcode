class Solution {
     public int[] plusOne(int[] digits) {
        
//         StringBuilder builder= new StringBuilder();
//         for(int num: digits){
//             builder.append(num);
//         }
        
//         long number= Long.parseLong(builder.toString());
        
//         String temp1= Long.toString(number);
        
//         number++;
        
//         String temp2= Long.toString(number);
        
//         int[] arr1;
//         int[] arr2;
        
//         if(temp1.length()==temp2.length()){
//             arr1= new int[temp2.length()];
        
//             for(int i=0;i<temp2.length();i++){
//             arr1[i]= Character.getNumericValue(temp2.charAt(i));
//           }
//             return arr1;
            
//          }
//           else{
//               arr2= new int[temp1.length()+1];
        
//             for(int i=0;i<temp2.length();i++){
//             arr2[i]= Character.getNumericValue(temp2.charAt(i));
//            }
//               return arr2;
//           }
        
         for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
       
        

    }
    
}