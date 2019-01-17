package _801_820;

public class _807_MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] left = new int[grid.length];
        int[] top = new int[grid[0].length];
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                left[i] = Math.max(left[i], grid[i][j]);
                top[j] = Math.max(top[j], grid[i][j]);
            }
        }
        int increase = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                increase += Math.min(left[i], top[j]) - grid[i][j];
            }
        }
        return increase;
    }
}
