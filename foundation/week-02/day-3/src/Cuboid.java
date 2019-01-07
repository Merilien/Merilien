// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// 
// Surface Area: 600
// Volume: 1000

public class Cuboid{
    public static void main(String[] args) {
        double height = 100;
        double width = 100;
        double depth = 100;

        System.out.println("Surface Area: " + (height*width + height*depth + depth*width) * 2);
        System.out.println("Volume: " + height * width * depth);
    }
}