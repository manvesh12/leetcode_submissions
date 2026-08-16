class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int tempnear = 0 ;
        int near = Integer.MAX_VALUE; ;
        int t = 0 ;
        int answer = -1 ;
        for(int i = 0 ;i<drones.length;i++){
            tempnear = 0;
            t = drones[i][2];
            for( int j=0;j<2;j++){
                if(j == 0){
                 tempnear += Math.abs(drones[i][j] - target[j]);
                }
                if(j==1){
                    tempnear += Math.abs(drones[i][j]-target[j]);
                
            }
           
        }
             if(tempnear<=t && tempnear<near){
                near = tempnear;
                answer = i;
            }
        
    }
        return answer;
}
}