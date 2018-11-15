package Pirates;

public class BattleApp {

    public static void main(String[] args) {
        Ship myShip = new Ship();
        myShip.fillShip();
        myShip.printShipInfo();

        Ship evilShip = new Ship();
        evilShip.fillShip();
        evilShip.printShipInfo();

        System.out.println(myShip.battle(evilShip));

        myShip.printShipInfo();
        evilShip.printShipInfo();

    }
}
