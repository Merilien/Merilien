package ImplementCharSequence;

public class Gnirts implements CharSequence {
    private String string;

    public Gnirts(String s) {
        this.string = s;
    }


    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(string.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.subSequence(string.length() - end, string.length() - start);
    }
}
