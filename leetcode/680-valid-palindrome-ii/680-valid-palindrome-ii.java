class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i =0 ;
         int j = n-1;
         while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
               return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
            i++;
            j--;
         }
         return true;
    }
    boolean isPalindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
             right--;
        }
        return true;
    }
}