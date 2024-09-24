package Com.Lab;

public class Consumer extends Thread{
	private final BoundedBuffer<String> buffer;

    public Consumer(BoundedBuffer<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                String item = "Item " + i;
                buffer.put(item);
                System.out.println("Produced: " + item);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
