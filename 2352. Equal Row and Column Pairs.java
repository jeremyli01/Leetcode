class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> rowMap = new HashMap<>();
        Map<String, Integer> colMap = new HashMap<>();
        int ans = 0;
        for (int row = 0; row < grid.length; row++) {
            String rowKey = toKey(grid[row]);
            rowMap.put(rowKey, rowMap.getOrDefault(rowKey, 0) + 1);
        }
        for (int col = 0; col < grid[0].length; col++) {
            int[] colArr = new int[grid.length];
            for (int row = 0; row < grid.length; row++) {
                colArr[row] = grid[row][col];
            }
            String colKey = toKey(colArr);
            colMap.put(colKey, colMap.getOrDefault(colKey, 0) + 1);
        }

        for (String s : rowMap.keySet()) {
            ans += rowMap.get(s) * colMap.getOrDefault(s, 0);
        }
        return ans;
    }
    private String toKey(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num);
            sb.append(",");
        }
        return sb.toString();
    }
}