class Solution {
    
         boolean palin(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!= str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if(s==null||s.length()<1){
            return "";
        }
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(palin(sub)&&sub.length()>longest.length()){
                    longest=sub;
                }
            }
        }
        return longest;
    }
}