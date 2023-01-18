class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int ans = -1;
        for (int num : nums) {
            int digit = toDigit(num);
            if (!map.containsKey(digit)) {
                map.put(digit, new ArrayList());
            }
            map.get(digit).add(num);
        }

        for (int key : map.keySet()) {
            List<Integer> curr = map.get(key);
            if (curr.size() > 1) {
                Collections.sort(curr, Collections.reverseOrder());
                ans = Math.max(ans, curr.get(0) + curr.get(1));
            }
        }
        return ans;
    }
    private int toDigit(int num) {
        int digit = 0;
        while (num > 0) {
            digit += num % 10;
            num /= 10;
        }
        return digit;
    }
}