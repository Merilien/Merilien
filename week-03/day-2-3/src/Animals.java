class Animal{
    int hunger;
    int thirst;

    public Animal(){
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat(){
        this.hunger--;
    }

    public void drink(){
        this.thirst--;
    }

    public void play(){
        this.hunger++;
        this.thirst++;
    }

}

public class Animals {

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.eat();
        cat.eat();
        cat.eat();
        cat.play();
        System.out.println(cat.hunger);
    }
}
