package pl.java;

public class Orange {
}

class OrangeBox {
    private Orange orange;

    public OrangeBox(Orange orange) {
        this.orange = orange;
    }

    public Orange getOrange() {
        return orange;
    }
}