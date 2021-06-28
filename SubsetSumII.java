// Problem link : https://leetcode.com/problems/subsets-ii/

class Solution {
    public void generateSubsets(int[] nums,int index,List<Integer>subset,List<List<Integer>>res)
    {
       res.add(new ArrayList<>(subset));
       for(int i =index;i<nums.length;i++)
       {
           if(i>index&&nums[i]==nums[i-1])
               continue;
           subset.add(nums[i]);
           generateSubsets(nums,i+1,subset,res);
           subset.remove(subset.size()-1);
           
       }
       
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       int n =nums.length;
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(nums,0,subset,res);
        return res;
    }
}
