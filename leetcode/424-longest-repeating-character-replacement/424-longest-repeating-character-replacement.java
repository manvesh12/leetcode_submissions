class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0 ;
        int [] freq = new int[26];
        int n = s.length();
        int maxlen = 0 ;
        for( int right = 0 ;right<n;right++){
           freq[s.charAt(right) -'A']++;
           while(true){
            int maxfreq = 0 ;
            for( int i = 0 ;i<26;i++){
                maxfreq = Math.max(maxfreq,freq[i]);
            }
            int windowlength = right- left +1;
            int replacements = windowlength -maxfreq;

            if(replacements<=k){
                break;
            }
            freq[s.charAt(left)-'A']= freq[s.charAt(left)-'A'] -1;
            left++;
           }
           int windowlength = right-left+1;
           maxlen = Math.max(maxlen,windowlength);

        }
        return maxlen;
    }
}