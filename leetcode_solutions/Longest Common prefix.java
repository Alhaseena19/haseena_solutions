class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    String String_1= strs[0];
    String String_2=strs[strs.length-1];
    int i=0;

    while((String_1.length()>i ) && (String_2.length()>i))
    {
        if(String_1.charAt(i) != String_2.charAt(i))
        {
            return (String_1.substring(0,i));
        }
        i++;
    }
    return String_1 ;
        
    }  
}
