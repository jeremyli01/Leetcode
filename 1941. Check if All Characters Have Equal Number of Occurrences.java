class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        Set<Integer> freqSet = new HashSet<>(freq.values());
        return freqSet.size() == 1;
    }
}