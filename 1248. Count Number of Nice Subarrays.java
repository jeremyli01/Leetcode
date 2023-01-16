class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        int curr = 0;
        int ans = 0;
        counts.put(0, 1);
        for (int num : nums) {
            curr += num % 2;
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }
        return ans;
    }
}