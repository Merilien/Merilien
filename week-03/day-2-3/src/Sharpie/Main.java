package Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie sh1 = new Sharpie("pink", 0.5f);
        sh1.use();
        sh1.use();
        sh1.use();
        sh1.use();
        System.out.println(sh1.inkAmount);
    }
}
