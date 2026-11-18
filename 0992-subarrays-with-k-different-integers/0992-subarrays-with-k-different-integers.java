class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }
    private int atMost(int[]nums,int k){
        int l=0,r=0,cnt=0;
        Map<Integer,Integer> mp = new HashMap<>();
        while(r < nums.length){
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            if(mp.get(nums[r]) == 1)
                k--;
            while(k < 0){
                mp.put(nums[l],mp.get(nums[l])-1);
                if(mp.get(nums[l]) == 0)
                    k++;
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
}