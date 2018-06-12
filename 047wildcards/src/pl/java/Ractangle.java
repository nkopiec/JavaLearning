package pl.java;

public class Ractangle implements Figure {
    public String getName() {
        return "rectangle";
    }
}

class Square extends Ractangle {
    public String getName() {
        return "square";
    }
}