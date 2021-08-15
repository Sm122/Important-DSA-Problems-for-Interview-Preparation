class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        for(int i =0;i<2;i++)
        {
            res[i]=-1;
        }
        int l =0;
        int r = nums.length-1;
        while(l<=r)
        {
           int mid = l + (r-l)/2;
            if(target>nums[mid])
            {
                l=mid+1;
                continue;
            }
            else if(target<nums[mid])
            {
                r=mid-1;
                continue;
            }
            else{
               if(mid == 0||nums[mid]!=nums[mid-1])
               {
                   res[0]=mid;
                   break;
               }
                else{
                    r=mid-1;
                }         
            }
        }
        l=0;
        r=nums.length-1;
         while(l<=r)
        {
           int mid = l + (r-l)/2;
            if(target>nums[mid])
            {
                l=mid+1;
                continue;
            }
            else if(target<nums[mid])
            {
                r=mid-1;
                continue;
            }
            else{
               if(mid == nums.length-1 || nums[mid]!=nums[mid+1])
               {
                   res[1]=mid;
                   break;
               }
                else{
                    l=mid+1;
                }         
            }
        }
        return res;
        
    }
}
