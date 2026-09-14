class Solution {
    public int compress(char[] chars) {
        int count = 0 ;
        int n = chars.length;
        int i = 0 ; 
        int j = 0 ;
         int temp = 0 ;
        while(i<n){
            count = 0 ;
            while(j<n && chars[i]==chars[j]){
            count ++;
             j++;
            }
            chars[temp] = chars[i];
            temp++;
            if(count >1){
                String s = String.valueOf(count);
                for(char ch : s.toCharArray()){
                chars[temp] = ch;
                temp++;
                }
            }
            i = j;
        }
        return temp;
    }
}