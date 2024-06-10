class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums); 
        List<List<Integer>> subset=new ArrayList<>();
        // ArrayList<Integer> ans=new ArrayList<>();
             
        dup(nums,subset,new ArrayList<>(),0);
 
        return subset;
    }
    
    public void dup(int[] nums, List<List<Integer>> subset,  ArrayList<Integer> ans,int idx){
       
         if(subset.contains(ans)) return;
         
        if(idx == nums.length){
            subset.add(new ArrayList<>(ans));
            return;
            
        }
        
        ans.add(nums[idx]);
        
        // take
        
        dup(nums,subset,ans,idx+1);
        // backtrack
         ans.remove(ans.size()-1);
        
        // not 
        
        dup(nums,subset,ans,idx+1);
        
        
    }
}