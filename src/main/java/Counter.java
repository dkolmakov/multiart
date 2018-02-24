
public class Counter {
    private int counter;
    Counter(int init) {
        counter = init;
    }

    public int getAndIncrement() {
        int temp = counter;

        counter = temp + 1;

        return counter;
    }
}
