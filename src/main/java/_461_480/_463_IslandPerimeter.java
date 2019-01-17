package _461_480;

public class _463_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i=0; i<grid.length; i++) {
            int gaps = 0;
            boolean zero = false;
            for (int j=0; j<grid[0].length; j++) {
                if (!zero && grid[i][j] == 1) {
                    zero = true;
                    gaps++;
                } else {
                    zero = false;
                }
            }
            perimeter += gaps*2;
        }
        for (int i=0; i<grid[0].length; i++) {
            int gaps = 0;
            boolean zero = false;
            for (int j=0; j<grid.length; j++) {
                if (!zero && grid[j][i] == 1) {
                    zero = true;
                    gaps++;
                } else {
                    zero = false;
                }
            }
            perimeter += gaps*2;
        }
        return perimeter;
    }
}
