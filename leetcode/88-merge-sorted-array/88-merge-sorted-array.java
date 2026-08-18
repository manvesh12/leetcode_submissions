class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int j = 0 ;
         for(int i = 0  ;i<n;i++){
            int key = nums2[i];
             j = m+i-1;
            while(j>=0 && key<nums1[j]){
                nums1[j+1]= nums1[j];
                
                j--;
            }
            nums1[j+1]= key ;
            
         }
    }
}