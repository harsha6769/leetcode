class Solution {

    public long countCommas(long n) {

        long cnt = 0;

        while (n >= 1000) {

            if (n >= 1000000000000000L) {
                cnt += (n - 1000000000000000L + 1) * 5;
                n = 999999999999999L;

            } else if (n >= 1000000000000L) {
                cnt += (n - 1000000000000L + 1) * 4;
                n = 999999999999L;

            } else if (n >= 1000000000L) {
                cnt += (n - 1000000000L + 1) * 3;
                n = 999999999L;

            } else if (n >= 1000000L) {
                cnt += (n - 1000000L + 1) * 2;
                n = 999999L;

            } else {
                cnt += n - 1000 + 1;
                n = 999;
            }
        }

        return cnt;
    }
}