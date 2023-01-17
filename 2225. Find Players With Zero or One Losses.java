class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> winner = new ArrayList<>();
        List<Integer> loser = new ArrayList<>();
        for (int[] match : matches) {
            int win = match[0];
            int lose = match[1];
            count.put(win, count.getOrDefault(win, 0));
            count.put(lose, count.getOrDefault(lose, 0) + 1);
        }

        for (int player : count.keySet()) {
            if (count.get(player) == 0) {
                winner.add(player);
            } else if (count.get(player) == 1) {
                loser.add(player);
            }
        }
        Collections.sort(winner);
        Collections.sort(loser);
        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        ans.get(0).addAll(winner);
        ans.get(1).addAll(loser);
        return ans;
    }
}