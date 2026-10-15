class Solution {
    public int reverseNumber(int n) {
        int r=0;
        while(n>0){
            int m=n%10;
            r=(r*10)+m;
            n=n/10;
        }
        return r;
    }
}