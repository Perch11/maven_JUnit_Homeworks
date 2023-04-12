package org.example.databaseconnect;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            ConnectDB.insertDataInTableTeacher("Edgar", "Babayan", 30, "096714011");
        } catch (SQLException e) {

            System.out.println("avelacum chi katarvel");
        }
//
        try {
            ConnectDB.getAllDataInTableTeacher();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
//        try {
//            ConnectDB.getDataInTableTeacher(2);
//        }catch (SQLException e){
//            throw new RuntimeException(e);
//        }
//        try {
//            ConnectDB.DeleteDataInTableTeacher("delete from teacher where id=1");
//        }catch (SQLException e){
//            throw new RuntimeException(e);
//        }


    }


}
