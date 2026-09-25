class Solution {
    public void reverse(int[] nums, int S, int E) {
        while (S < E) {
            int temp = nums[S];
            nums[S] = nums[E];
            nums[E] = temp;
            S++;
            E--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
}