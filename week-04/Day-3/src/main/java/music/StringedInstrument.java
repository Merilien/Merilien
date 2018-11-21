package main.java.music;

public abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;

    public abstract String sound();

    public void play() {
        System.out.println(String.format("%s, a %d-stringed instrument that goes %s", name, numberOfStrings, sound()));
    }


}
