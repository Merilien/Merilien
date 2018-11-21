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

}
