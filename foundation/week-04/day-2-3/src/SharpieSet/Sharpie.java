package SharpieSet;

class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 10;
    }

    public void use() {
        this.inkAmount -= 1;
    }

    public boolean hasInk() {
        return (this.inkAmount > 0);
    }

}

