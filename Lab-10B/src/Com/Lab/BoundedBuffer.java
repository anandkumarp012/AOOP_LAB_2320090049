package Com.Lab;
import java.util.LinkedList;
import java.util.Queue;
public class BoundedBuffer<T> {
	private final int capacity;
    private final Queue<T> buffer;

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
    }

    public synchronized void put(T item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
        }
        buffer.add(item);
        notifyAll();
    }

    public synchronized T take() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        T item = buffer.poll();
        notifyAll();
        return item;
    }
}
