package pl.java;

public class Main {

	public static void main(String[] args) {
		testZoo();
	}

	public static void testZoo() {
		Lion lion = new Lion();
		ZooActivity<Zooable> zooAtivity = new ZooActivity<Zooable>(lion);
		zooAtivity.doSleep();
		
		
		Elephant elephant = new Elephant();
		ZooActivity<Zooable> zooAtivity1 = new ZooActivity<Zooable>(elephant);
		zooAtivity1.doEat();
		
		Monkey monkey = new Monkey();
		ZooActivity<Zooable> zooAtivity2 = new ZooActivity<Zooable>(monkey);
		zooAtivity2.doFun();
		
		Zebra zebra = new Zebra();
		ZooActivity<Zooable> zooAtivity3 = new ZooActivity<Zooable>(zebra);
		zooAtivity3.doRun();
		
	
	}
}
