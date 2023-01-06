class Solution {
public String reverseWords(String s) {
        // int lastSpaceIndex = -1;
        // int len = (int)s.size();
        // for (int strIndex = 0; strIndex <= len; strIndex++) {
        //     if (strIndex == len || s[strIndex] == ' ') {
        //         int startIndex = lastSpaceIndex + 1;
        //         int endIndex = strIndex - 1;
        //         while (startIndex < endIndex) {
        //             char temp = s[startIndex];
        //             s[startIndex] = s[endIndex];
        //             s[endIndex] = temp;
        //             startIndex++;
        //             endIndex--;
        //         }
        //         lastSpaceIndex = strIndex;
        //     }
        // }
        // return s;
        
        String z="";

        String [] str = s.split(" ");

        for (int j=0;j<str.length;j++){
          String y="",x="";
          x=str[j];
           for(int i=x.length()-1;i>=0;i--){

               y=y+x.charAt(i);

           }

           str[j]=y;

           
          

        }


        for( int i=0;i<str.length-1;i++ ){
          z+=str[i];
          z+=" ";
        }

        z+=str[str.length-1];

       
        return z;


        

    };

      
        

















        // int lastSpaceIndex = -1;
        // int len = (int)s.size();
        // for (int strIndex = 0; strIndex <= len; strIndex++) {
        //     if (strIndex == len || s[strIndex] == ' ') {
        //         int startIndex = lastSpaceIndex + 1;
        //         int endIndex = strIndex - 1;
        //         while (startIndex < endIndex) {
        //             char temp = s[startIndex];
        //             s[startIndex] = s[endIndex];
        //             s[endIndex] = temp;
        //             startIndex++;
        //             endIndex--;
        //         }
        //         lastSpaceIndex = strIndex;
        //     }
        // }

        // String [] chars =s.split(" ");

        // String [] res= new String[chars.length+chars.length-1];
        
        // for(String x: chars){
        //     int j= x.length()-1;
        //     int i= 0;
        //     while(i<j){
        //         char temp = x[i];

        //         i++;
        //         j--;
        //     }

        // }

        // for(int i=0;i<chars.length;i++){
        //    if(i!=chars.length-1)
        //    {  
        //        res[i]=chars[i];
        //        res[i+1]=" ";
        //    }
        //    else{
        //        res[i]=chars[i];
        //    }
        // }

        // String sk ="";
        // sk=String.valueOf(res);




    //     return s;
    // }
}