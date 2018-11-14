package Pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship myShip = new Ship();
        myShip.fillShip();
        myShip.getShipInfo();

        Ship evilShip = new Ship();
        evilShip.fillShip();
        evilShip.getShipInfo();

        System.out.println(myShip.battle(evilShip));

        myShip.getShipInfo();
        evilShip.getShipInfo();

    }
}
