package pl.java;

public class ZooActivity<S extends Zooable> {
	private S zoo;
	
	public ZooActivity(S zoo) {
		this.zoo = zoo;
	}
	
	public void doingAnimals(S zoo) {
		this.zoo = zoo;
	}
	
	public void doSleep() {
		zoo.sleep();
	}
	
	public void doEat() {
		zoo.eat();
	}
	
	public void doRun() {
		zoo.run();
	}
	
	public void doFun() {
		zoo.fun();
	}
}
