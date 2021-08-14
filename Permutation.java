class Solution {
    public void generateSolution(int[] nums,List<List<Integer>> res,List<Integer> ds)
    {
        if(ds.size()==nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
            
        for(int i =0;i<nums.length;i++)
        {
            if(ds.contains(nums[i]))
                continue;
            ds.add(nums[i]);
            generateSolution(nums,res,ds);
            ds.remove(ds.size()-1);
            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        generateSolution(nums,res,new ArrayList<Integer>());
        return res;
    }
}
