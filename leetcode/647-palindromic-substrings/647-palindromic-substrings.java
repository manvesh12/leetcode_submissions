class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0 ;

        for(int i = 0;i<n;i++) {
           count = count + isPalindrome(s,i,i);
           count= count + isPalindrome(s,i,i+1);
        }
        return count;

    }
    public int isPalindrome(String s, int left, int right){
        int n = s.length();
        int c = 0 ;
      while(left>=0 && right<n){
        if(s.charAt(left)==s.charAt(right)){
            c++;
        }else{
            break;
        }
        left--;
        right++;
      }
      return c;
    }
}