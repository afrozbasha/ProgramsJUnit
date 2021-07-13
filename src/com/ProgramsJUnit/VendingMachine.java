package com.ProgramsJUnit;
import java.util.Scanner;

public class VendingMachine {
    static int i=0, total=0;
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a Amount : ");
        int amount = num.nextInt();
        int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
        countNotes(amount, notes);
    }
    public static int countNotes(int amount, int[] notes){
        int remAmount = 0;
        if(amount >= notes[i]){
            int countNote = amount / notes[i];
            remAmount = amount % notes[i];
            amount = remAmount;
            total = total + countNote;
            System.out.println(notes[i]+"Rs notes :"+countNote);
        }else{
            if (amount == 0)
                return 0;
        }
        i++;
        return countNotes(amount, notes);


    }


}
