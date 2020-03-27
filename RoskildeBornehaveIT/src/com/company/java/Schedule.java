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
    Database database = new Database();


    public  void createSchedule(){


        try{

            do{

                System.out.println("Do you want to add a new teacher to the kindergarden(y/n)");

                System.out.println("List of teachers");
                database.getTeacherData();
                System.out.print("Which teacher do you want to assign this shift to? Write teacher id: ");
                teacher_id = scan.nextInt();

                System.out.print("What date format(00/00-00)");
                date = scan.next();

                System.out.print("What time is the shift starting?: ");
                startTime = scan.nextDouble();

                System.out.print("What time does the shift end?");
                endTime = scan.nextDouble();

                // vi laver en boolsk udtryk while loop, så hvis vi svare n, så stopper loopet
                System.out.print("Do you want to add more shifts?(y/n): ");




            }while (true);

        }
        catch (InputMismatchException e){
            System.out.println("Wrong input. Please try again");
        }

    }


}
