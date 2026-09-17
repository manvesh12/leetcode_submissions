class Solution {
    public boolean isIsomorphic(String s, String t) {
       int n =  s.length();
       int m = t.length();
       HashMap<Character,Character> h1 = new HashMap<>();
        HashMap<Character,Character> h2 = new HashMap<>();

        if(n!=m){
            return false;
        }
        else{
            for(  int i = 0 ;i<n;i++){
                char a = s.charAt(i);
                char b = t.charAt(i);
                if(h1.containsKey(a) && h1.get(a)!=b){
                    return false;
                }
                if(h2.containsKey(b) && h2.get(b)!=a){
                    return false;
                }
                h1.put(a, b);
                h2.put(b, a);
            }
            return true;
        }
    }
}