class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
        if(bloomDay.length<val)
        return -1;
         int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }
        int low=min,high=max;
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }

    private boolean possible(int[]bloomDay,int mid,int m,int k){
        int c=0,b=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid)
            c++;
            else{
                b+=c/k;
                c=0;
            }
        }
            b+=c/k;
            if(b>=m)
            return true;
            else
            return false;
    }
}