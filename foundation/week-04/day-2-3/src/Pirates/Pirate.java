package Pirates;

public class Pirate {
    private int drinks;
    private boolean conscious;
    private boolean alive;
    private Parrot parrot;

    public Pirate(){
        drinks = 0;
        conscious = true;
        alive = true;
    }

    public void giveParrot(Parrot parrot){
        this.parrot = parrot;
    }

    public void drinkSomeRum(){
        if (alive) { drinks++;}
        else {reportDeath();}
    }

    public void howsItGoingMate(){
        if (alive) {
            if (drinks < 5) { System.out.println("Pour me anudder!");}
            else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                passOut();
            }
        }
        else{ reportDeath(); }
    }

    public void brawl(Pirate enemy){
        int outcome = (int)(Math.random() * 4);
        switch (outcome){
            case 1 :
                die();
                System.out.println("he lost.");
            case 2 :
                enemy.die();
                System.out.println("he won!");
            case 3 :
                passOut();
                enemy.passOut();
                System.out.println("it's a draw.");
        }
    }

    public void getKilled(){
        die();
    }

    public boolean checkAlive(){
        return alive;
    }

    public boolean checkConscious(){ return conscious; }

    public int checkDrinks(){
        return drinks;
    }


    private void passOut(){
        conscious = false;
    }

    private void die(){
        alive = false;
    }

    private void reportDeath(){
        System.out.println("he's dead");
    }

}
