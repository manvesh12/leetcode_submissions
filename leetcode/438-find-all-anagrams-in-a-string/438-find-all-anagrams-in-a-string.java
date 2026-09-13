class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
    int n = p.length();
    int m = s.length();
       HashMap <Character,Integer> h1 = new HashMap <>();
    HashMap<Character,Integer> h2 = new HashMap<>();
    ArrayList<Integer> arr = new ArrayList<>();

    if(n>m){
        return arr;
    }
 
    for(char ch : p.toCharArray()){
        h1.put(ch,h1.getOrDefault(ch,0)+1);
    }for(int i = 0 ;i<n;i++){
        char ch = s.charAt(i);
        h2.put(ch,h2.getOrDefault(ch,0)+1);

    }
    if(h1.equals(h2)){
       arr.add(0);
    }
    for( int i =n;i<m;i++){
        int a = i-n;
        
        char remove = s.charAt(a);
        h2.put(remove,h2.getOrDefault(remove,0)-1);
        if(h2.get(remove)==0){
            h2.remove(remove);
        }
        char add = s.charAt(i);
        h2.put(add,h2.getOrDefault(add,0)+1);

         if(h1.equals(h2)){
            arr.add(a+1);
         }

    }
    return arr;
    }
}