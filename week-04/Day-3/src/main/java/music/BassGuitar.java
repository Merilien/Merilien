package main.java.music;

public class BassGuitar extends StringedInstrument {


    public BassGuitar() {
        numberOfStrings = 4;
        name = "Bass Guitar";
    }

    public BassGuitar(int num) {
        numberOfStrings = num;
        name = "Bass Guitar";
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

    @Override
    public void play() {
        System.out.println(String.format("%s, a %d-stringed instrument that goes %s", name, numberOfStrings, sound()));
    }
}
