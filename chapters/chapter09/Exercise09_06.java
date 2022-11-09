package chapters.chapter09;

public class Exercise09_06 {
    public static void main(String[] args) {
        //Stopwatch

        StopWatch stopWatch = new StopWatch();
        int[] arr = getArr();
        stopWatch.start();
        sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.time());
    }

    public static int[] getArr() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        return arr;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minInd = j;
                }
            }
            if (i != minInd) {
                arr[minInd] = arr[i];
                arr[i] = min;
            }
        }

    }
}
