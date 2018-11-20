package AircraftCarrier;

public class Main {
    public static void main(String[] args) {

        int ammo = (int) (Math.random() * 501);
        Carrier myCarrier = new Carrier(ammo);

        int f16Count = (int) (Math.random() * 11) + 1;
        int f35Count = (int) (Math.random() * 6) + 1;
        for (int i = 0; i < f16Count; i++) {
            myCarrier.add(new F16());
        }
        for (int i = 0; i < f35Count; i++) {
            myCarrier.add(new F35());
        }

        ammo = (int) (Math.random() * 501);
        Carrier enemyCarrier = new Carrier(ammo);

        f16Count = (int) (Math.random() * 11) + 1;
        f35Count = (int) (Math.random() * 6) + 1;
        for (int i = 0; i < f16Count; i++) {
            enemyCarrier.add(new F16());
        }
        for (int i = 0; i < f35Count; i++) {
            enemyCarrier.add(new F35());
        }



        while (myCarrier.getHP() > 0 && enemyCarrier.getHP() > 0) {
            System.out.println("NEW ROUND");
            try {
                myCarrier.fill();
                enemyCarrier.fill();
            } catch (Exception e) {
                System.out.println("Can't fill ships, no ammo in storage.");
            }

            System.out.println(myCarrier.getStatus() + '\n');
            System.out.println(enemyCarrier.getStatus() + '\n');

            myCarrier.fight(enemyCarrier);
            enemyCarrier.fight(myCarrier);

            System.out.println(myCarrier.getStatus() + '\n');
            System.out.println(enemyCarrier.getStatus() + '\n');
        }



        if (myCarrier.getHP() > enemyCarrier.getHP()) {
            System.out.println("We won!");
        } else if (myCarrier.getHP() == enemyCarrier.getHP()) {
            System.out.println("draw");
        } else {
            System.out.println("We lost :'(");
        }

    }
}
