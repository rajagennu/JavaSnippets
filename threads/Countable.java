package threads;

public class Countable implements Runnable {
	private Design d ;
	protected boolean doStop = false;
	public Countable(Design d) {
		this.d = d;
	}

	@Override
	public void run() {
		System.out.println("Design " + d.getName() + " has " + d.getVotes().size() + " votes");
		
	}
}

