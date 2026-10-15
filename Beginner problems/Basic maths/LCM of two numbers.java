class Solution {
    public int LCM(int n1, int n2) {
        int max=Math.max(n1,n2);
        while(true){
            if(max%n1==0&&max%n2==0){
                return max;
            }
            max++;
        }

    }
}