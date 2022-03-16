class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();
        int maxi = 0;
        for (int i=0; i<candies.length; i++) {
            maxi = Math.max(maxi, candies[i]);
        }
        for (int i:candies) {
            arr.add(i >= maxi - extraCandies);
        }
        return arr;
    }
}