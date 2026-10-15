class Solution {
    public int largestDigit(int n) {
        if(n==0) return 0;
        int max=0;
        while(n>0){
            int m=n%10;
            max=Math.max(max,m);
            n=n/10;
            if(max==9) break;
        } 
        return max;

    }
}