// problem link: https://leetcode.com/problems/combination-sum/
class Solution {
    public void resultSet(int ar[],int index,int n ,int target,List<Integer> ds,List<List<Integer>> res)
    {
        if(target<0)
            return;
        else if(target==0)
        {
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i =index;i<n;i++)
        {
            if(i!=index && ar[i]==ar[i-1])
                continue;
            ds.add(ar[i]);
            resultSet(ar,i,n,target-ar[i],ds,res);
            ds.remove(ds.size()-1);
                
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=  new ArrayList<List<Integer>>();
        int n =candidates.length;
        Arrays.sort(candidates);
        resultSet(candidates,0,n,target,new ArrayList<Integer>(),res);
        return res;
    }
}
