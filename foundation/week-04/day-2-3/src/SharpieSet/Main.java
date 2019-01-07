package SharpieSet;

public class Main {
    public static void main(String[] args) {
        Sharpie sh1 = new Sharpie("pink", 0.5f);
        Sharpie sh2 = new Sharpie("blue", 0.5f);
        Sharpie sh3 = new Sharpie("black", 0.5f);
        Sharpie sh4 = new Sharpie("green", 0.5f);

        SharpieSet mySet = new SharpieSet();
        mySet.addSharpie(sh1);
        mySet.addSharpie(sh2);
        mySet.addSharpie(sh3);
        mySet.addSharpie(sh4);

        for (int i = 0; i < 10; i++) {
            sh1.use();
        }
        System.out.println(mySet.countUsable());
        mySet.removeTrash();
        System.out.println(mySet.sharpies.size());
    }
}
