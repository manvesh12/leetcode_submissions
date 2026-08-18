class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int [] arr = new int [n];
        int z = 0 ;
        int a = n-1;
        for(int i = 0 ;i<n;i++){
            if(nums[i]==0){
                arr[z]=nums[i];
                z++;
            }else if(nums[i] == 2){
                arr[a] = nums[i];
                a--;
            }
            
        }
        for( int i = z ;i<=a;i++){
            arr[i] =1;
        }
        for(int i = 0 ;i<n;i++){
            nums[i]=arr[i];
        }
        
    }
}