class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> L1 = new ArrayList<>();
        for( int i = 0 ;i<=rowIndex;i++){
            List<Integer> row = new ArrayList <>();
            for( int j = 0;j<=i;j++){
                if(j==0 || j ==i){
                    row.add(1);
                }else{
                int left = L1.get(i-1).get(j-1);
                int right = L1.get(i-1).get(j);
                row.add(left+right);
            }
            }
            L1.add(row);
        }
        
       return L1.get(rowIndex);
    }
}