public class Matrix {
    public static void setZero(int[][] matrix) {
        boolean x = true;
        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i < row; i++) {
            if (matrix[0][i] == 0) {
                x = false;
            }
            for (int j = 1; j < column; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }


        if (matrix[0][0] == 0) {
            for (int j = 0; j < column; j++) {
                matrix[0][j] = 0;
            }
        }


        if (x) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{4, 4, 6, 7}, {8, 9, 0, 3}, {6, 0, 7, 2}, {8, 8, 5, 6}};

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        setZero(matrix);
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}


