class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,List<String>> map = new HashMap<>();
        for(String s : strs){
        HashMap<Character,Integer> h1 = new HashMap<>();
            for(char ch : s.toCharArray()){
                h1.put(ch,h1.getOrDefault(ch,0)+1);
            }
            if(!map.containsKey(h1)){
                map.put(h1,new ArrayList<>());
            }
            map.get(h1).add(s);
        }
        return new ArrayList<>(map.values());
    }
}