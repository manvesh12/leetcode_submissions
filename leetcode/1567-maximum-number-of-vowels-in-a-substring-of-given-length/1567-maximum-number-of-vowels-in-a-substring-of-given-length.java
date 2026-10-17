class Solution {
    public int maxVowels(String s, int k) {
        int i = 0 ;
        int n = s.length();
        int j = i+k-1;
         int tempcount = 0;
         int count = 0 ;
        while(j<=n){
            
            if(i<=j){
                 if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u') {
                    tempcount++;
                }
                if (tempcount>=count){
                    count  = tempcount;
                }
                i++;
            }else{
                j=i+k-1;
                 tempcount = 0;
            }

                }
        return count;
    }
}
