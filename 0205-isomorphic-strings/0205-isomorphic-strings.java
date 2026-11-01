class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n != m)
            return false;
        Map<Character,Character> mp = new HashMap<>();
        Set<Character> used = new HashSet<>();
        for(int i=0;i<n;i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(mp.containsKey(sChar)){
                if(mp.get(sChar) != tChar)
                    return false;
            }
            else{
                if(used.contains(tChar))
                    return false;
                mp.put(sChar,tChar);
                used.add(tChar);
            }
        }
        return true;
    }
}