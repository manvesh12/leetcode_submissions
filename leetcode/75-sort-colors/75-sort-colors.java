class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int [] arr = new int [n];
        int z = 0 ;
        int a = n-1;
        int i = 0;
        while(i<=a){
            if(nums[i]==0){
                int temp = nums[z];
                nums[z]=nums[i];
                nums[i]=temp;
                z++;
                i++;
            }else if(nums[i] == 1){
                i++;
            }else{
                int temp = nums[i];
                nums[i] = nums[a];
                 nums[a] = temp;
                 a--;
            }
            
        }
       
        
    }
}