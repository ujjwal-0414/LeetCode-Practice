class Solution {
    public boolean judgeSquareSum(int c) {
        long s = 0;
        long l=0;
        long h =(long)Math.sqrt(c);
        while(l<=h){
            s=l*l+h*h;
            if(s == c)
                return true;
            else if(s>c)
                h--;
            else
                l++;
        }
        return false;
    }
}