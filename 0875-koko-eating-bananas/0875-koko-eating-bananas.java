class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=maxElement(piles);
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            int hrs=time(piles,mid);
            if(hrs<=h){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }

    private int time(int[]piles,int hours){
        int hr=0;
        for(int i=0;i<piles.length;i++)
            hr += Math.ceil((double)piles[i]/(double)hours);
        return hr;
    }

    private int maxElement(int[]piles){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
            max=Math.max(max,piles[i]);
        return max;
    }

}