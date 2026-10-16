class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int e=0,o=1;
        int n=nums.length;
        while(e<n && o<n){
            if(nums[e] % 2 ==0)
                e = e+2;
            else if(nums[o] % 2 != 0)
                o = o+2;
            else{
                int temp = nums[e];
                nums[e] = nums[o];
                nums[o] = temp;
                e = e+2;
                o = o+2;
            }
        }
        return nums;
    }
}