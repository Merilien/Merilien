class PostIt {
    String color;
    String text;
    String textColor;

}

public class PostItMaker{

    public static void main(String[] args) {
        PostIt pi1 = new PostIt();
        pi1.color = "orange";
        pi1.text = "Idea 1";
        pi1.textColor = "blue";

        PostIt pi2 = new PostIt();
        pi2.color = "pink";
        pi2.text = "Awesome";
        pi2.textColor = "black";

        PostIt pi3 = new PostIt();
        pi3.color = "yellow";
        pi3.text = "Superb!";
        pi3.textColor = "green";

    }

}