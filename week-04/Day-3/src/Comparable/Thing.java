package Comparable;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing> {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing thing) {
        if (this.completed == thing.completed) {
            if (this.name.toLowerCase().charAt(0) < thing.name.toLowerCase().charAt(0)) {
                return -1;
            }
        } else if (!this.completed && thing.completed) {
            return -1;
        }
        return 1;
    }
}