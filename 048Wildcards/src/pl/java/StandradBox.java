package pl.java;

class StandradBox<T> {
	public T object;
	
	public StandradBox(T object) {
		this.object = object;
	}
}

class SpecjalBox<T> extends StandradBox<T> {
	private static char[] figure;

	public SpecjalBox(T object) {
		super(object);
	}
	
	public void saySomethingSpecjal() {
		System.out.println("Our" + object + "is cool!!!");
	}
	
	private static void method(SpecjalBox<?> box) {
		Object object = box.object;
		System.out.println(object);
	}
	
	private static void plainWildcard() {
		method(new SpecjalBox<>(new Object()));
		method(new SpecjalBox<>(new Square()));
		method(new SpecjalBox<>(new Peach()));
	}
	
	private static void method1(SpecjalBox<Figure> box)  {
		Figure figuer = box.object;
		System.out.println(figure);
	}
	private static void upperBoundWildcard() {
		SpecjalBox<Figure> specjalFigureBox = new SpecjalBox<>(new Circle());
		SpecjalBox<Circle> specjalCircleBox = new SpecjalBox<>(new Circle());
		SpecjalBox<Square> specjalSquareBox = new SpecjalBox<>(new Square());
		method(specjalFigureBox);
		method(specjalCircleBox);
		method(specjalSquareBox);
	}
	private static void method2(SpecjalBox<? extends Figure> box) {
		Figure figure = box.object;
		System.out.println(figure);
	}
	
	private static void method3(SpecjalBox<? super Rectangle> box) {
		box.object = null;
		box.object = new Rectangle();
		box.object = new Square();
	}
}
