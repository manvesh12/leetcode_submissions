class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> h1 = new HashSet<>();
        int maxlen = 0;
        int left =0;

        for(int i =0; i<s.length()-1;i++){
            while(h1.contains(s.charAt(i))){
                h1.remove(s.charAt(left));
                left++;
            } 
            h1.add(s.charAt(i));
            maxlen =Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}