package com.company.java;

import java.sql.*;

public class Database {

    String url = "jdbc:mysql://den1.mysql4.gear.host/roskildeit123";
    String user = "roskildeit123";
    String password = "_Roskilde123";

    public void createScheduleData() {


        try {
            //1.Get a conncection to database
            Connection myCon = DriverManager.getConnection(url, user, password);

            //2.Create statement
            Statement myState = myCon.createStatement();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void getScheduleData() {

    }

    public void deleteScheduleData() {

    }

    public void updateScheduleData() {

    }

    public void getTeacherData() {
        try {
            //1.Get a conncection to database
            Connection myCon = DriverManager.getConnection(url, user, password);

            //2.Create statement
            Statement myState = myCon.createStatement();

            //3.Execute a query
            ResultSet getTs = myState.executeQuery("SELECT * from teacher");

            //Print
            System.out.println("Teacher_id  |  Name  |  phoneNumber  |  email  |  manger_id");
            while (getTs.next()){
                System.out.println("| " + getTs.getInt(1) + " | " + getTs.getString(2) + " | " + getTs.getInt(3) + " | " + getTs.getString(4) + " | " + getTs.getInt(5 ) + " |");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
