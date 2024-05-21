package com.jspiders.taxi;
import java.util.Scanner;
public class taxi {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Km : ");
         int distance = sc.nextInt();
        double fare = 0;
        switch (distance) {
            case 1:
            case 2:
                fare = distance * 15;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                fare = 30 + (distance - 2) * 15;
                //30+(4-2)*15
                //-60
                //30
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            fare = 105 + (distance - 6) * 15;
            fare=fare+5;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                fare = 185 + (distance - 11) * 20;
                fare=fare+15;
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            default:   fare = 280 + (distance - 16) * 25;
                fare =fare+50;
                break;     
        }
        System.out.println("The fare for " + distance + " km is: " + fare + " rupees.");
    }
}