class Solution {
    public int splitArray(int[] nums, int k) {
        if(k>nums.length)
        return -1;
        int low=maxEle(nums);
        int high=sumArr(nums);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(splitArr(nums,mid)<=k)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }

    private int splitArr(int[]nums,int mid){
        int st=1,m=0;
        for(int n:nums){
            if((m+n)<=mid)
                m+=n;
            else{
                st++;
                m=n;
            }
        }
        return st;
    }

    private int maxEle(int[]nums){
        int max=Integer.MIN_VALUE;
        for(int n:nums)
            max=Math.max(max,n);
        return max;
    }

    private int sumArr(int[]nums){
        int sum=0;
        for(int n:nums)
            sum+=n;
        return sum;
    }
}