class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int n = s.length();
        int j = i + k - 1;
        int tempcount = 0;
        int count = 0;

        while (j < n) {

            if (i <= j) {

                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u') {
                    tempcount++;
                }

                i++;
            } 
            else {
                if (tempcount > count) {
                    count = tempcount;
                }

                // next overlapping window
                i = i - k + 1;
                j = i + k - 1;

                tempcount = 0;
            }
        }

        if (tempcount > count) {
            count = tempcount;
        }

        return count;
    }
}