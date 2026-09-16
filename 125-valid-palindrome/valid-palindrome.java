class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        int n=s.length();
        for(int i=0;i<n;i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                s1=s1+s.charAt(i);
            }
        }
        s1=s1.toLowerCase();
        String s2= new StringBuilder(s1).reverse().toString();
        if(s1.equals(s2)){
            return true;
        }
        else {
            return false;
        }

    }
    
}