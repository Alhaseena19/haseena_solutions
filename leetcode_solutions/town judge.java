class Solution {
    public int findJudge(int n, int[][] trust) {//[[1,3],[2,3,[3,1]]]
   int trusting[]=new int[n+1];//[0,1,1,1]
   int trusted[]=new int[n+1];//[0,1,0,2]
   if(n==1) return n;
   for(int pair[]:trust)
   {
       trusting[pair[0]]+=1;
       trusted[pair[1]]+=1;
   }
   for(int i=0;i<n+1;i++)
   {
       if(trusting[i]==0 && trusted[i]==n-1)
       {
           return i;
       }
      
   }
    return -1;
 }
}
