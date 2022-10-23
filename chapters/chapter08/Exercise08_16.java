package chapters.chapter08;

public class Exercise08_16 {
    public static void main(String[] args) {
        //Sort two-dimensional array

        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

    }

    public static void sort(int x[][]) {
        int[] min = new int[2];
        for (int row = 0; row < x.length - 1; row++) {
            min[0] = x[row][0];
            min[1] = x[row][1];
            int index = row;
            for (int i = row + 1; i < x.length; i++) {
                if (x[i][0] <= min[0] && (x[i][0] < min[1] || x[i][1] < min[0] || x[i][1] < min[1])) {
                    min[0] = x[i][0];
                    min[1] = x[i][1];
                    index = i;
                }
            }
            if (index != row) {
                x[index][0] = x[row][0];
                x[index][1] = x[row][1];
                x[row][0] = min[0];
                x[row][1] = min[1];
            }
        }
    }
}
