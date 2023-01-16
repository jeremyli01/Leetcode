class Solution {
    public int countElements(int[] arr) {
        Set<Integer> elementSet = new HashSet<>();
        int ans = 0;
        for (int num : arr) {
            elementSet.add(num);
        }
        for (int num : arr) {
            if (elementSet.contains(num + 1)) {
                ans++;
            }
        }
        return ans;
    }
}