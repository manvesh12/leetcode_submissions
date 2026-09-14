class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int  n = strs.length;
        boolean  [] visited = new boolean[n];
        List<List<String>> a1 = new ArrayList<>();
        for( int i = 0 ;i<n;i++){
            if(visited[i]){
                continue;
            }
            HashMap<Character,Integer> h1 = frequency(strs[i]);
            ArrayList<String> arr = new ArrayList<>();
            arr.add(strs[i]);
            visited[i]= true;

            for( int j = i+1;j<n;j++){
                if(visited[j]){
                continue;
            }
            
            HashMap<Character,Integer> h2 = frequency(strs[j]);
            
            if(h1.equals(h2)){
                    visited[j]= true;
                    arr.add(strs[j]);
            }
            }

a1.add(arr); 
            }
          
return a1   ;
        }
        public HashMap<Character, Integer> frequency(String s) {

    HashMap<Character, Integer> h = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {

        char ch = s.charAt(i);

        h.put(ch, h.getOrDefault(ch, 0) + 1);
    }

    return h;
}
        
    }
