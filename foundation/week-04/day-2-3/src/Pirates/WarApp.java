package Pirates;

public class WarApp {
    public static void main(String[] args) {
        Armada us = new Armada();
        us.fillArmada();
        System.out.println(us.getArmadaSize());
        Armada them = new Armada();
        them.fillArmada();
        System.out.println(them.getArmadaSize() + "\n");

        System.out.println(us.war(them));
    }
}
