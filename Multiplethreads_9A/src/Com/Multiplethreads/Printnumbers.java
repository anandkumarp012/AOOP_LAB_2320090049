package Com.Multiplethreads;

public class Printnumbers {
    private final int max = 15;
    private int currentNumber = 1;

    public static void main(String[] args) {
    	Printnumbers numberPrinter = new Printnumbers();

        Thread t2 = new Thread(numberPrinter::printTwo);
        Thread t3 = new Thread(numberPrinter::printThree);
        Thread t4 = new Thread(numberPrinter::printFour);
        Thread t5 = new Thread(numberPrinter::printFive);
        Thread tNumber = new Thread(numberPrinter::printNumber);

        t2.start();
        t3.start();
        t4.start();
        t5.start();
        tNumber.start();

        try {
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            tNumber.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void printTwo() {
        while (currentNumber <= max) {
            if (currentNumber % 2 == 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                System.out.println("Divisible by 2: " + currentNumber);
                currentNumber++;
            }
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printThree() {
        while (currentNumber <= max) {
            if (currentNumber % 3 == 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                System.out.println("Divisible by 3: " + currentNumber);
                currentNumber++;
            }
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printFour() {
        while (currentNumber <= max) {
            if (currentNumber % 4 == 0 && currentNumber % 5 != 0) {
                System.out.println("Divisible by 4: " + currentNumber);
                currentNumber++;
            }
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printFive() {
        while (currentNumber <= max) {
            if (currentNumber % 5 == 0) {
                System.out.println("Divisible by 5: " + currentNumber);
                currentNumber++;
            }
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printNumber() {
        while (currentNumber <= max) {
            if (currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                System.out.println("Not divisible by 2, 3, 4, or 5: " + currentNumber);
                currentNumber++;
            }
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
