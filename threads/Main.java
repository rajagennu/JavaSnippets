package threads;

public class Main {
	public static void main(String[] args ) {
		Design d1 = new Design(1, "D1");
		Votable votingRunnable01 = new Votable(d1);
		Thread votingThread01 = new Thread(votingRunnable01);
		votingThread01.start();
		
		Countable countable01 = new Countable(d1);
		Thread countableThread01 = new Thread(countable01);
		countableThread01.start();
		
		Design d2 = new Design(2, "D2");
		Votable votingRunnable02 = new Votable(d2);
		Thread votingThread02 = new Thread(votingRunnable02);
		votingThread02.start();
		
		Countable countable02 = new Countable(d2);
		Thread countingThread02 = new Thread(countable02);
		countingThread02.start();
		
		Design d3 = new Design(3, "D3");
		Votable votingRunnable03 = new Votable(d3);
		Thread votingThread03 = new Thread(votingRunnable03);
		votingThread03.start();
		
		Countable countable03 = new Countable(d3);
		Thread countingThread03 = new Thread(countable03);
		countingThread03.start();
	}
}