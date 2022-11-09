package chapters.chapter09;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long time() {
        return endOfTime() - startOfTime();
    }

    public long startOfTime() {
        return startTime;
    }

    public long endOfTime() {
        return endTime;
    }
}
