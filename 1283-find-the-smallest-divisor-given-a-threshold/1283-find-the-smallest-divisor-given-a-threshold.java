class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length>threshold)
            return -1;
        int low=1,high=max(nums);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumByD(nums,mid)<=threshold)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }

    private int max(int[]nums){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
            max=Math.max(max,nums[i]);

        return max;
    }

    private int sumByD(int[]nums,int mid){
        int sum=0;
        for(int n:nums)
            sum+=(n+mid-1)/mid;
        
        return sum;
    }
}