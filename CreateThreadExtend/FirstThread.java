public class FirstThread extends Thread {



	@Override
	public void run() {
		for (int i = 1 ; i <= 5 ; i++ ) {
			System.out.println(i + " from " + Thread.currentThread().getName());
		}
	}
}



