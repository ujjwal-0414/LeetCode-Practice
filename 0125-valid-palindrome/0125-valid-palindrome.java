class Solution {
    public boolean isPalindrome(String s) {
        s=correctFormat(s);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
   private String correctFormat(String s) {
    StringBuilder ans = new StringBuilder();
    for (char ch : s.toCharArray()) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            ans.append(Character.toLowerCase(ch));
        } else if (ch >= '0' && ch <= '9') {
            ans.append(ch);
        }
    }
    return ans.toString();
}
}