class Solution {
    public boolean isPalindrome(String s) {
        boolean c = true;
        s.trim();
        
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(s.toLowerCase().charAt(i)==s.toLowerCase().charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}