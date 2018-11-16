package multipleThreads;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("MyRunnable is running" + " " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread myThread = new Thread(new MyRunnable());
		System.out.println(myThread.getName());
		myThread.start();
	}
	
}
