package pl.java;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Lion lion = new Lion();
		Monkey monkey = new Monkey();
		Elephant elephant = new Elephant();
		Zebra zebra = new Zebra();
		
		ZooActivity<Zoo> zooActivity = new ZooActivity<Zoo>(zoo);
		zooActivity.doSleep();
		zooActivity.doEat();
		zooActivity.doRun();
		zooActivity.doFun();
		
		zooActivity.doingAnimals(lion);
		zooActivity.doSleep();
		
		zooActivity.doingAnimals(monkey);
		zooActivity.doFun();
		
		zooActivity.doingAnimals(elephant);
		zooActivity.doEat();
		
		zooActivity.doingAnimals(zebra);
		zooActivity.doRun();
	}

}
