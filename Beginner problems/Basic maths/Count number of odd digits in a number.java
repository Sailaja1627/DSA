class Solution {
    public int countOddDigit(int n) {
        if(n==0) return 1;
        int c=0;
        while(n>0){
            int m=n%10;
            if(m%2!=0){
                c++;
            }
            n=n/10;
        }
        return c;


    }
}