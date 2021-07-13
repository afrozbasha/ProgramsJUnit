package com.ProgramsJUnit;
import java.util.Scanner;

public class DectoBinary {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a Decimal Num : ");
        int n = num.nextInt();
        DectoBin(n);
    }
    private static void DectoBin(int x){
        int[] array = new int[10];
        int i;
        for (i=0; x>0; i++){
            array[i] = x % 2;
            x = x / 2;
        }
        System.out.println("Binary of the "+x+" Num is ");
        for (i=i-1; i >= 0; i--){
            System.out.print(array[i]);

        }
    }
}
