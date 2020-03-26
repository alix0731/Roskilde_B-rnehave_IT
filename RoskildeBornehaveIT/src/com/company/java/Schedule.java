package com.company.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Schedule {
    int teacher_id;
    String time_id;
    String date;
    double startTime;
    double endTime;
    double duration = endTime - startTime;

    Scanner scan = new Scanner(System.in);


    public  void createSchedule(){


        try{

            while (true){

                System.out.print("Which teacher do you want to assign this shift to?: ");
                teacher_id = scan.nextInt();

                System.out.print("What date format(00/00-00)");
                date = scan.next();

                System.out.print("What time is the shift starting?: ");
                startTime = scan.nextDouble();

                System.out.print("What time does the shift end?");
                endTime = scan.nextDouble();





            }

        }
        catch (InputMismatchException e){
            System.out.println("Wrong input. Please try again");
        }

    }


}
