package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        numberOfStrings = 4;
        name = "Violin";
    }

    public Violin(int num) {
        numberOfStrings = num;
        name = "Violin";
    }

    @Override
    public String sound() {
        return "Screech";
    }

    @Override
    public void play() {
        System.out.println(String.format("%s, a %d-stringed instrument that goes %s", name, numberOfStrings, sound()));
    }
}
