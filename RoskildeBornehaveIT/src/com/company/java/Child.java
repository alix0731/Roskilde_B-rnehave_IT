package com.company.java;
import java.util.*;
public class Child {
    String name;
    int child_cpr;
    double pickupTime;
    int teacher_id;
    int parent_id;

    Scanner scan = new Scanner(System.in);
    Database database = new Database();

    public void createChild(){ // Ikke færdig

        try {
            do {
                System.out.println("Do you want to add a new child to the kindergarten(y/n)");
                database.getChildData();
                System.out.println("Write the child name: ");
                name = scan.nextLine();
                System.out.println("Input child social security number: ");
                child_cpr = scan.nextInt();
                System.out.println("When is the child supposed to be picked up?: ");
                pickupTime = scan.nextDouble();
                System.out.println("Assign teacher to the child. Input teacherID: ");
                teacher_id = scan.nextInt();
                System.out.println("Assign parents to the child. Input parentID: ");

                System.out.println("Do you want to add more kids to the kindergarten (y/n)");
            } while(true);
        }
        catch (Exception e){
            System.out.println("Wrong input. Please try again");
        }




    }
    public void editChild(){ // Ikke færdig
        System.out.println("Do you want to edit a child (y/n)");
        database.getChildData();
        System.out.println("Input the ID of the child you want to edit");



    }

    public void deleteChild(){ // Ikke færdig
        System.out.println("Do you want to delete a child from list?(y/n): ");
        database.getChildData();
        System.out.println("Input social security number of the child you want to delete from the list");
        child_cpr = scan.nextInt();
        String sql = "Delete from employees where child_cpr "




    }
}

