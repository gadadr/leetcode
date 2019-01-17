package _561_580;

public class _566_ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r * c) {
            return nums;
        }
        int[][] matrix = new int[r][c];
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums[0].length; j++) {
                int x = i * nums[0].length + j;
                matrix[x/c][x%c] = nums[i][j];
            }
        }
        return matrix;
    }
}
