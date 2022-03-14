class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int i = 0;
        int j = n;
        int curr = 0;
        while (i < n) {
            arr[curr] = nums[i];
            curr++;
            i++;
            arr[curr] = nums[j];
            curr++;
            j++;
        }
        return arr;   
    }
}
