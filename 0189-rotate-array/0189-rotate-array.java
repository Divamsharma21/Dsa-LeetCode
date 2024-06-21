class Solution {
    public void rotate(int[] nums, int k) {
        // int[] temp =new int[nums.length];
//         for(int i=0;i<k;i++){
//             for(int j=0;j<nums.length;j++){
//                 temp[j] = nums[j];
//                 nums[j]=nums[nums.length-1];
//                 nums[nums.length-1]=temp[j];
//             }
//         }
        
        k = k % nums.length; 
        if(k < 0){ 
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
        
  
      public void reverse(int[] nums,int i,int j) { 
         int li = i;
        int ri = j;
        
        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            
            li++;
            ri--;
        }
      }
 
}