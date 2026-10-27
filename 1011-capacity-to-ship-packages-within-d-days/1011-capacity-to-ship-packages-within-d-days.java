class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=maxEle(weights);
        int high=sumArr(weights);
        while(low<=high){
            int mid=low+(high-low)/2;
            int reqDays=daysReq(weights,mid);
            if(reqDays<=days)
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }


    private int daysReq(int[]weights,int mid){
        int day=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                day+=1;
                load=weights[i];
            }
            else
            load+=weights[i];
        }
        return day;
    }

    private int maxEle(int[]weights){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++)
            max=Math.max(max,weights[i]);
        return max;
    }

    private int sumArr(int[]weights){
        int sum=0;
        for(int i=0;i<weights.length;i++)
            sum+=weights[i];
        return sum;
    }

}