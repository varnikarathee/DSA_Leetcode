class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int maxM=Integer.MIN_VALUE;
        int lastKnownGreater=1;
        int i=0;
        while(i<points.length)
        {
            if(lastKnownGreater<=i)
            {
                lastKnownGreater=i+1;
            }
            for(int j=lastKnownGreater;j<points.length;j++)
            {
                if(points[j][0]>(k+points[i][0]))
                {
                    break;
                }
                int temp=points[i][1]+points[j][1]+Math.abs(points[j][0]-points[i][0]);
                if(temp>maxM)
                {
                    maxM=temp;
                    lastKnownGreater=j;
                }
            }
            i++;
        }
        return maxM;
    }
}