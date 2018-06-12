package pl.java;

class StandardBox<T> {
    public T object;

    public StandardBox(T object) {
        this.object = object;
    }
}

class FancyBox<T> extends StandardBox<T> {
    public FancyBox(T object) {
        super(object);
    }
    public void saySomethingFancy() {
        System.out.println("our " + object + " is cool!");
    }


private static void method1(FancyBox<?> box) {
    Object object = box.object;
    System.out.println(object);
}

private static void plainWildcard() {
    method1(new FancyBox<>(new Object()));
    method1(new FancyBox<>(new Square()));
    method1(new FancyBox<>(new Apple()));
}

private static void method3(FancyBox<Figure> box) {
    Figure figure = box.object;
    System.out.println(figure);
}

private static void upperBoundWildcard() {
    FancyBox<Figure> fancyFigureBox = new FancyBox<>(new Circle());
    FancyBox<Circle> fancyCircleBox = new FancyBox<>(new Circle());
    FancyBox<Square> fancySquareBox = new FancyBox<>(new Square());
    method2(fancyFigureBox);
    method2(fancyCircleBox);
    method2(fancySquareBox);

}

private static void method2(FancyBox<? extends Figure> box) {
    Figure figure = box.object;
    System.out.println(figure);
  
}

private static void method4(FancyBox<? super Ractangle> box) {
    box.object = null;
    box.object = new Ractangle();
    box.object = new Square();
}
}