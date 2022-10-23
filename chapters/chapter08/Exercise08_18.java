package chapters.chapter08;

public class Exercise08_18 {
    public static void main(String[] args) {
        //Shuffle rows

        int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void shuffle(int[][] arr) {
        int[] temp = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int i1 = (int) (Math.random() * arr.length);
            temp[0] = arr[i][0];
            temp[1] = arr[i][1];
            arr[i][0] = arr[i1][0];
            arr[i][1] = arr[i1][1];
            arr[i1][0] = temp[0];
            arr[i1][1] = temp[1];
        }
    }
}
