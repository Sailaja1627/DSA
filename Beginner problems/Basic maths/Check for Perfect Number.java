class Solution {
    public boolean isPerfect(int n) {
        if(n<=1) return false;
        int m=n;
        int r=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                r=r+i;
                if(i!=n/i){
                    r+=n/i;
                }
            }
        }
        return r==m;

    }
}