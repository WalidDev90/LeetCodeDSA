class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length() || haystack.length() == 0
                || needle.length() == 0){
            return -1;
        }
        int i=0;
        int j=0;
        while(i<haystack.length()){
            while(j<needle.length()){
                if(i == haystack.length()){
                    return -1;
                }
                if(haystack.charAt(i) == needle.charAt(j)){
                    i++;
                    j++;
                }
                else{
                    i=i-j+1;
                    j=0;
                }
            }
            return i-j;
        }
        return -1;
    }
}