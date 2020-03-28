package com.company.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Schedule {
    int teacher_id;
    String time_id;
    String date;
    double startTime;
    double endTime;
    double duration;

    Scanner scan = new Scanner(System.in);
    Database database = new Database();


    public void createSchedule() {


        try {
            boolean moreShifts = true;

            do {

                System.out.println("Do you want to add a new teacher to the kindergarden(y/n)");

                System.out.println("\n|List of teachers|");
                database.getTeacherData();
                System.out.print("\nWhich teacher do you want to assign this shift to? (Type id): ");
                teacher_id = scan.nextInt();

                System.out.print("What date (0000-00-00): ");
                date = scan.next();

                System.out.print("What time is the shift starting?: ");
                startTime = scan.nextDouble();

                System.out.print("What time does the shift end?: ");
                endTime = scan.nextDouble();

                //beregner durantion
                duration = endTime - startTime;

                database.createScheduleData(teacher_id, date, startTime, endTime, duration);

                // vi laver en boolsk udtryk while loop, så hvis vi svare n, så stopper loopet
                System.out.print("Do you want to add more shifts?(y/n): ");
                String moreInput = scan.next();
                if (moreInput.equals("n") || moreInput.equals("N")) {
                    moreShifts = false;
                }


            } while (moreShifts);

        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Please try again");
        }

    }


}
