class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = i+1 ; j < nums.length ; j++) {
                if(nums[i] + nums[j] == target) {
                    arr[k] = i;
                    k++;
                    arr[k] = j;
                }
            }
        }
        return arr;
    }
}