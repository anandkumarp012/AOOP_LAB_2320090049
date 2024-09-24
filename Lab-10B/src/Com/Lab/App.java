package Com.Lab;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundedBuffer<String> buffer = new BoundedBuffer<>(10);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
	}

}
