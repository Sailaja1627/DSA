class Solution{
    public boolean isPalindrome(int n) {
        int m=n;
        int r=0;
        while(n>0){
            int k=n%10;
            r=(r*10)+k;
            n=n/10;
        }
        return r==m;
    }
}