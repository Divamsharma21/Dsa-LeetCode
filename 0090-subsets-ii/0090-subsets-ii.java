class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subset=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
             Arrays.sort(nums); 
        dup(nums,subset,ans,0,nums.length);
 
        return subset;
    }
    
    public void dup(int[] nums, List<List<Integer>> subset,  ArrayList<Integer> ans,int idx,int n){
       
         if(subset.contains(ans)) return;
         
        if(idx == n){
            subset.add(new ArrayList<>(ans));
            return;
            
        }
        
        ans.add(nums[idx]);
        
        // take
        
        dup(nums,subset,ans,idx+1,n);
        // backtrack
         ans.remove(ans.size()-1);
        
        // not 
        
        dup(nums,subset,ans,idx+1,n);
        
        
    }
}