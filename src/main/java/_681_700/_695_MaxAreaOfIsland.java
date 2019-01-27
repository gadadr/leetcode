package _681_700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _695_MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int size = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int temp = calculateIslandSize(grid, i, j, 0);
                    size = Math.max(size, temp);
                }
            }
        }
        return size;
    }

    private int calculateIslandSize(int[][] grid, int i, int j, int count) {
        if (i<0 || i>=grid.length || j<0 || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        } else {
            grid[i][j] = -1;
            count++;
            count += calculateIslandSize(grid, i-1, j, 0)
                    + calculateIslandSize(grid, i+1, j, 0)
                    + calculateIslandSize(grid, i, j-1, 0)
                    + calculateIslandSize(grid, i, j+1, 0);

            return count;

        }
    }

    @Test
    public void test() {
        int[][] grid = new int[][]
                {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        int ans = maxAreaOfIsland(grid);
        Assertions.assertEquals(ans, 6);
    }

}
