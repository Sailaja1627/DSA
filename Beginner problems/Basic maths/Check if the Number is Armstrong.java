class Solution {
    public boolean isArmstrong(int n) {
        int m=n;
        int r=0;
        while(n>0){
            int t=n%10;
            r=r+(t*t*t);
            n=n/10;
        }
        return r==m;
    }
}