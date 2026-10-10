class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int presum=0,cnt=0;
        for(int i=0;i<nums.length;i++){
            presum += nums[i];
            int remove=presum -k;
            if(map.containsKey(remove)){
                cnt += map.get(remove);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}