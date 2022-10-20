package chapters.chapter08;

public class Exercise08_10 {
    public static void main(String[] args) {
        //Largest row and column

        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("The largest row index : " + maxRow(matrix));
        System.out.println("The largest column index : " + maxColumn(matrix));

    }

    public static int maxRow(int[][] m) {
        int index = 0;
        int max = 0;
        for (int row = 0; row < m.length; row++) {
            int count = 0;
            for (int j = 0; j < m[row].length; j++) {
                if (m[row][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                index = row;
            }
        }
        return index;
    }

    public static int maxColumn(int[][] m) {
        int index = 0;
        int max = 0;
        for (int column = 0; column < m[0].length; column++) {
            int count = 0;
            for (int row = 0; row < m.length; row++) {
                if (m[row][column] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                index = column;
            }
        }
        return index;
    }
}
