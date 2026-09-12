class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m){
            return false;

        }
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
         
         for( int i =  0 ;i<n;i++){
            char ch = s1.charAt(i);
            if(!h1.containsKey(s1.charAt(i))){
                h1.put(ch,1);
            }else{
                h1.put(ch,h1.getOrDefault(ch,0)+1);
            }
         }
         
        for( int i = 0 ;i<n;i++){
            char ch = s2.charAt(i);
            h2.put(ch,h2.getOrDefault(ch,0)+1);
        }
        if(h1.equals(h2)){
            return true;
        }
        for( int i = n ;i<m;i++){

            char add = s2.charAt(i);
            h2.put(add,h2.getOrDefault(add,0)+1);
            char remove = s2.charAt(i-n);
            h2.put(remove,h2.get(remove)-1);
            if(h2.get(remove)==0){
                h2.remove(remove);
            }

            if(h1.equals(h2)){
                return true;
            }
        }
        return  false;

            }
        }
   