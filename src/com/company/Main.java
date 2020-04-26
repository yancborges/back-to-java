package com.company;
import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
	    int age = 50;
	    float float_age = (float)age;
	    int binary = 0;

	    System.out.println(age);
        System.out.println(float_age);

        String name = inputString("Enter your name: ");
        System.out.println("Hi, " + name);

        float height, weight;
        double imc;
        height = inputFloat("Enter your height");
        weight = inputFloat("Enter your weight");
        imc = calcImc(height, weight);
        System.out.println("Your imc: " + imc);

        if ( imc >= 25 ) {
            System.out.println("Whoa, be careful with your weight dude");
        }
        else if ( imc >= 18) {
           System.out.println("You are just fine!");
        }
        else {
            System.out.println("Oh my god please eat this burrito i bought you");
        }

    }

    public static String inputString(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }

    public static float inputFloat(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextFloat();
    }

    public static double calcImc(float h, float w) {
        return w / Math.pow(h, (float)2);
    }
}
