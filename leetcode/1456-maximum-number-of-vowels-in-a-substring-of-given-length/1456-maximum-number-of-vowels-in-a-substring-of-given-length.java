class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int n = s.length();
        int j = i + k - 1;
        int tempcount = 0;
        int count = 0;

        // First window
        while (i <= j) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {
                tempcount++;
            }
            i++;
        }

        count = tempcount;

        // Next windows
        i = 1;
        j = i + k - 1;

        while (j < n) {

            if (s.charAt(i - 1) == 'a' || s.charAt(i - 1) == 'e' ||
                s.charAt(i - 1) == 'i' || s.charAt(i - 1) == 'o' ||
                s.charAt(i - 1) == 'u') {
                tempcount--;
            }

            if (s.charAt(j) == 'a' || s.charAt(j) == 'e' ||
                s.charAt(j) == 'i' || s.charAt(j) == 'o' ||
                s.charAt(j) == 'u') {
                tempcount++;
            }

            count = Math.max(count, tempcount);

            i++;
            j++;
        }

        return count;
    }
}