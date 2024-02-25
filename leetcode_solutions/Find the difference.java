class Solution {
    public char findTheDifference(String s, String t)
    {
    int[] a= new int[26];
    int[] b= new int[26];
    char e='\0';
    for(char c:s.toCharArray())
    {
        a[c-97]++;
    }
    for(char d:t.toCharArray())
    {
        b[d-97]++;
    }
    for(int i=0;i<a.length;i++)
    {
        if(a[i]!=b[i]) 
        {
         e=(char)(97+i);
        }
    }
    return e;
    }
}
