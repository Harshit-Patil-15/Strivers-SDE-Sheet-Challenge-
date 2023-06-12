class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        if(n==1) return 1;
        int[][] temp=new int [n][2];
        for(int i=0;i<n;i++){
            temp[i][0]=start[i];
            temp[i][1]=end[i];
        }
        Arrays.sort(temp,(a,b)->a[1]-b[1]);
        int endMetting=temp[0][1];int count=1;
         for(int i=1;i<n;i++){
            if(temp[i][0]>endMetting){
                count++;
                endMetting= temp[i][1];
            }
        }
        return count;
    }
}
