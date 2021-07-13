package com.ProgramsJUnit;
import java.util.Scanner;


public class MonthPayment {
    public static void main(String args[]) {
        System.out.println("Takes a command-line argument Num is : "+ args[0]+" "+args[1]+" "+ args[2]);
        float x = Float.parseFloat(args[0]);
        int y = Integer.parseInt(args[1]);
        float z = Float.parseFloat(args[2]);

        MonthlyPay(x, y, z);
    }
    private static void MonthlyPay(float p, int y, float r){
        int months = y * 12;
        float rate = r / (12 * 100);
        float payment = (p * r) / (float) (1 - (Math.pow(1+r, -months)));
        System.out.println("Monthly Payment : %.2f " + payment);

    }
}
