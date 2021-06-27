// Problem Link : https://practice.geeksforgeeks.org/problems/subset-sums2234/1
class Solution{
    public static void resultSet(ArrayList<Integer> ar,int n ,int index,int sum,ArrayList<Integer> res)
    {
       if(index==n)
       {
           res.add(sum);
           return;
       }
       resultSet(ar,n,index+1,sum+ar.get(index),res);
       resultSet(ar,n,index+1,sum,res);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        // code here
        ArrayList<Integer> res  = new ArrayList<Integer>();
        resultSet(arr,n,0,0,res);
        Collections.sort(res);
        return res;
        
    }
}
