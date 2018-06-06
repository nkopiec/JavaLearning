package pl.java;

public class ForestGrow<S extends Forestable> {
	public S forest;
	
	public ForestGrow(S forest) {
		this.forest = forest;
	}
	
	public void rustleForest(S forest) {
		this.forest = forest;
	}
	
	public void attemptGrow() {
		forest.grow();
	}
}
