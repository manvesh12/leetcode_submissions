class Solution {
    public int mySqrt(int x) {
        int low = 0 ;
        int high = x/2;
        if(x<2){
            return x;
        }
        while(low<=high){
            long mid = low + (high-low)/2;
            if(mid * mid == x){
                return (int) mid;
            }else if (mid * mid < x ){
                low =(int) (mid+1);
            }else{
                high = (int) (mid-1);
            }
        }
        return (int)high;
    }
}