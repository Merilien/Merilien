class Sharpie{
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width){
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void use(){
        this.inkAmount -= 0.1;
    }

}

public class Sharpies {
    public static void main(String[] args) {
        Sharpie sh1 = new Sharpie("pink", 0.5f);
        sh1.use();
        sh1.use();
        sh1.use();
        sh1.use();
        System.out.println(sh1.inkAmount);
    }
}
