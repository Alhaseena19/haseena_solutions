class Solution {
    public boolean isPalindrome(int x) {
     int n=x;
     int sum=0;
     if(x<0 ||(x!=0 && x%10==0) ) return false;

     while(n>0)
     {
         int r=n%10;
         sum = sum*10+r;
         n=n/10;

     }
     if(sum==x)
     {
         return true;
     }
     else
     {
         return false;
     }
        
    }
}
