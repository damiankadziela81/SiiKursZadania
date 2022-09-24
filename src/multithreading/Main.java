package multithreading;

public class Main {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyTask(1000));
		Thread thread2 = new Thread(new MyTask(2000));
		Thread thread3 = new Thread(new MyTask(3000));
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
