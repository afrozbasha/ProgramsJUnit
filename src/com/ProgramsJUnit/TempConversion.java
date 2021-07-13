package com.ProgramsJUnit;
import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter 1 for: Celsius to Fahrenheit conversion");
        System.out.println("Enter 2 for: Fahrenheit to Celsius conversion");
        int con = num.nextInt();

        switch (con) {
            case 1:
                CtoF();
                break;
            case 2:
                FtoC();
                break;
            default:
                System.out.println("Enter proper conversion Option");
                break;
        }

    }

    private static void CtoF() {
        Scanner num =new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius : ");
        final float Ctemp = num.nextFloat();
        float fahrheit = 0;
        fahrheit = (Ctemp*9/5) + 32;
        System.out.printf("Fahrenheit : %.1f", fahrheit);
    }
    private static void FtoC() {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a temperature in Fahrenheit : ");
        float Ftemp = num.nextFloat();
        float celsius = 0;
        celsius = (Ftemp-32)* 5 / 9;
        System.out.printf("Celsius : %.1f", celsius);
    }
}
