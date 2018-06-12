package pl.java;

public interface Figure {
    String getName();
}

class Circle implements Figure {
    public String getName() {
        return "circle";
    }
}

class BoxForFigures<T extends Figure> {
    private T element;

    public BoxForFigures(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public String getElementName() {
        return element.getName();
    }
    
    BoxForFigures<Circle> circleBox = new BoxForFigures<>(new Circle());
}

