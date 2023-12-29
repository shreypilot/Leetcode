class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isRow = false;
        boolean isCol = false;

        // Check if the first row or column needs to be set to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if (i == 0) isRow = true;
                    if (j == 0) isCol = true;
                }
            }
        }

        // Set elements to zero based on the first row and column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set the first row to zero
        if (isRow) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }

        // Set the first column to zero
        if (isCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
