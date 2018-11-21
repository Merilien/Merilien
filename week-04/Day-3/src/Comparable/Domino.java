package Comparable;
import Printable.*;

public class Domino implements Comparable<Domino>, Printable {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino domino2) {
        if (this.left == domino2.left) {
            return this.right - domino2.right;
        }
        return this.left - domino2.left;
    }

    @Override
    public void printAllFields() {
        System.out.println("Left: " + left);
        System.out.println("Right: " + right);
    }
}