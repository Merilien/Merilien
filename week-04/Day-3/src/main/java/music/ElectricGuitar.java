package main.java.music;

public class ElectricGuitar extends StringedInstrument {


    public ElectricGuitar() {
        numberOfStrings = 6;
        name = "Electric Guitar";
    }

    public ElectricGuitar(int num) {
        numberOfStrings = num;
        name = "Electric Guitar";
    }

    @Override
    public String sound() {
        return "Twang";
    }

    @Override
    public void play() {
        System.out.println(String.format("%s, a %d-stringed instrument that goes %s", name, numberOfStrings,sound()));
    }
}
