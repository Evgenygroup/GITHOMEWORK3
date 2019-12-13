public class CounterThread implements Runnable {

    Counter counter;
    boolean flag;

    public CounterThread(Counter counter, boolean flag) {
        this.counter = counter;
        this.flag = flag;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (flag) counter.increment();
            else counter.decrement();
        }
    }
}
