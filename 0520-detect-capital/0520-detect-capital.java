class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
                cnt++;
        }
        if(cnt == 0 || cnt == word.length())
            return true;
        return cnt == 1 && Character.isUpperCase(word.charAt(0));
    }
}