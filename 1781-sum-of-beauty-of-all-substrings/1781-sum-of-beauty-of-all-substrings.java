class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int[]freq = new int[26];
            for(int j=i;j<n;j++){
                int ind=s.charAt(j)-'a';
                freq[ind]++;
                int mn=Integer.MAX_VALUE;
                int mx=0;
                for(int f:freq){
                    if(f>0){
                        mn=Math.min(mn,f);
                        mx=Math.max(mx,f);
                    }
                }
                ans += (mx-mn);
            }
        }
        return ans;
    }
}