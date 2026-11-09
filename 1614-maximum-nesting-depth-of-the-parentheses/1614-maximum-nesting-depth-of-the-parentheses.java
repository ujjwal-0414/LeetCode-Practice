class Solution {
    public int maxDepth(String s) {
        int ans=0,depth=0;
        for(char ch:s.toCharArray()){
        if(ch=='(')
            depth++;
        else if(ch==')')
            depth--;
        ans = ans<depth ? depth:ans;
        }
        return ans;
    }
}