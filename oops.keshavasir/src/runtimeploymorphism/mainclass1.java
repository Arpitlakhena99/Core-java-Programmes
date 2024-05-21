package runtimeploymorphism;

import java.util.Scanner;

public class mainclass1 {

    public static void main(String[] args) {
        System.out.println("main method started");
        Scanner scn1 = new Scanner(System.in);
        cat c1 = new cat(); // Assuming you have classes named Cat, Dog, Snake, and AnimalSimulator
        dog d1 = new dog();
        snake s1 = new snake();

        AnimalSimulator an1 = new AnimalSimulator();
        System.out.println("enter 1");
        System.out.println("enter 2");
        System.out.println("enter 3");

        int choice = scn1.nextInt();
        switch (choice) {
            case 1:
                an1.makenoise(c1);
                break;
            case 2:
                an1.makenoise(d1);
                break;
            case 3:
                an1.makenoise(s1);
                break;

            default:
                System.out.println("under simulation");
                break;
        }
    }
}
