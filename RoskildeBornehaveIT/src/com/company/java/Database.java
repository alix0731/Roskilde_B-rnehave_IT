package com.company.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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

}
