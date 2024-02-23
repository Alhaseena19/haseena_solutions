class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<=words.length-1;i++)
        {
            int l=0;
            int r=words[i].length()-1;
            String temp="";
            for(char a:words[i].toCharArray())
            {
                if(words[i].charAt(l)==words[i].charAt(r))
                {
                   temp+=a;
                   l++;r--;
                }
            }
            if(temp.equals(words[i]))
            {
                return words[i];
               
            }
        }
        return "";
        
        
  
    }
}
