package multithreading;

public class MyTask implements Runnable{
	
	private int sleep;
	
	public MyTask(int sleep) {
		this.sleep = sleep;
	}

	@Override
	public void run() {
		System.out.println("Start: " + sleep);
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Test: " + sleep);
		
	}

}
