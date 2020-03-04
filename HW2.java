/**
 * Starter code for homework 2 Problem 2 - CIS 2348
 * Name:Eduardo Zuniga
 * PS:1391564
 */


import java.util.Scanner;


public class HW2{

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight;
        int arrowBaseWidth;
        int arrowHeadWidth;

        System.out.println("Enter arrow base height:");
        arrowBaseHeight = scnr.nextInt();

        System.out.println("Enter arrow base width:");
        arrowBaseWidth = scnr.nextInt();

        System.out.println("Enter arrow head width:");
        arrowHeadWidth = scnr.nextInt();
        System.out.println("");

        // Draw arrow base (height = 3, width = 2)
        for (int i = 0; i < arrowBaseHeight; i++) {
            for (int j = 0; j < arrowBaseWidth; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //System.out.println("**");
        //System.out.println("**");
        //System.out.println("**");
        int temp =arrowHeadWidth;
        while(temp>0)
        {


            for (int i = 0; i < temp; i++) {
                System.out.print("*");
            }
            System.out.println("");
            temp--;
        }
        // Draw arrow head (width = 4)
        // System.out.println("****");
        //System.out.println("***");
        //System.out.println("**");
        //System.out.println("*");
    }
}