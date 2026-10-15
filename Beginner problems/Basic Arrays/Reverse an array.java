class Solution {
    public void reverse(int[] arr, int n) {
        int l=0;int r=n-1;
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
    }
}

