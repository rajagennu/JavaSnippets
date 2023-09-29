package threads;

public class Votable implements Runnable {

	private Design d; 
	protected boolean doStop = false;
	public Votable(Design d) {
		this.d = d;
	}
	
	@Override
	public void run() {
		System.out.println("Voting going on for design " + d.getName());
		d.getVotes().add(1L);
	}
}

