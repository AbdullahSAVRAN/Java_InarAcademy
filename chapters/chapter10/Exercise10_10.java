package chapters.chapter10;

public class Exercise10_10 {
    public static void main(String[] args) {
        //The Queue class

        Queue queue = new Queue();
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
