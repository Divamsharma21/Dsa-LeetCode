class Solution {
    public void sortColors(int[] nums){
         // int s=0,l=nums.length;
        int z=0,o=0,t=0;
        for(int i=0;i<nums.length;i++){
            // for(int j=i+1;j<nums.length;j++){
            //    if(nums[i]>nums[j]){
            //        nums[i]=nums[j];
            //    } 
            // }   
            
            if(nums[i] == 0){
                z++;
            }
            
            else if(nums[i] == 1){
                o++;
            }
            else{
                t++;
            }
    }
        int j=0;
        for(int i=0;i<z;i++){
            nums[j]=0;
            j++;
        }
        
         for(int i=0;i<o;i++){
            nums[j]=1;
            j++;
        }
         for(int i=0;i<t;i++){
            nums[j]=2;
            j++;
        }
        
        
       
    }
}