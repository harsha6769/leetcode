class Solution {
    public int countCommas(int n) {
        int cnt =0;
        if(n<1000){
            return 0;
        }
        while(n>=1000){
            cnt++;
            n=n-1;
        }
        return cnt;
    }
}