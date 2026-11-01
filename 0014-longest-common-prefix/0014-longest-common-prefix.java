class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String n=strs[0];
        String w=strs[strs.length-1];
        int i=0;
        while(i<n.length() && i<w.length()){
            if(n.charAt(i)==w.charAt(i))
            i++;
            else
            break;
        }
        return n.substring(0,i);
}
}