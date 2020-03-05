
/**
 * Starter code for homework 2 Problem 1 - CIS 2348
 * Name: Eduardo Zuniga
 * PS:1391564
 */

import java.io.BufferedReader;
        import java.io.File;

        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.Scanner;


public class HW1{



    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 01;
                break;
            case "February":
                monthInt = 02;
                break;
            case "March":
                monthInt = 03;
                break;
            case "April":
                monthInt = 04;
                break;
            case "May":
                monthInt = 05;
                break;
            case "June":
                monthInt = 06;
                break;
            case "July":
                monthInt = 07;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 00;
        }
        return monthInt;
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        // problem 1
        File file = new File("src/inputDates.txt");

            File file_out = new File("src/parsedDates.txt");
            
        file_out.createNewFile();


        BufferedReader br = new BufferedReader(new FileReader(file));

        String s;
        //String s = "March 1 1990";

            FileWriter myWriter =new FileWriter("src/parsedDates.txt");

        while((s=br.readLine())!=null)
        {
            String split[] = s.split(" ");
            if(split.length!=3)
                continue;
            //     System.out.println("wrong format");
            int month = getMonthAsInt(split[0]);
            if(month==00)
                continue;
            //  System.out.println("wrong format");
            String day = split[1].substring(0, split[1].length()-1);
            if(split[1].charAt(split[1].length()-1) != ',')
                continue;
            //       System.out.println("wrong format");
            if(Integer.parseInt(day) <10)
                day=""+day;
            String year = split[2];
            //System.out.println(month+"/"+day+"/"+year);



            myWriter.write(month+"/"+day+"/"+year+"\n");

        }
        myWriter.close();
    }

}
