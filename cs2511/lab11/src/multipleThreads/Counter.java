package multipleThreads;

public class Counter implements Runnable {
	private static int counter = 0;
	
	public void increament() {
		counter++;
		System.out.println(Counter.counter);
	}
	@Override
	public void run() {
		increament();
		increament();
		increament();
	}
	
	public static void main(String[] args) {
		Runnable r1 = new Counter();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
