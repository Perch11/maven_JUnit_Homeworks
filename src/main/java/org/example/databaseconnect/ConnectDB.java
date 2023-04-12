package org.example.databaseconnect;

import java.sql.*;

public class ConnectDB {

    private static final String url = "jdbc:postgresql://localhost:5432/school";
    private static final String username = "postgres";
    private static final String password = "1107";

    /**
     * this method inserts new row in DB table called teacher
     * @param firstName string type
     * @param lastName string type
     * @param age int type
     * @param phone string type
     * @throws SQLException
     */
    public static void insertDataInTableTeacher(String firstName, String lastName, int age, String phone) throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement st = con.prepareStatement("insert into teacher(first_name,last_name,age,phone) values (?,?,?,?)");

        st.setString(1, firstName);
        st.setString(2, lastName);
        st.setInt(3, age);
        st.setString(4, phone);

        int rows = st.executeUpdate();
        if (rows > 0) {
            System.out.println("hajoxutyamb katarvel e");
        }

        st.close();
        con.close();
    }

    /**
     * this method gets all rows in DB called teacher
     * @throws SQLException
     */
    public static void getAllDataInTableTeacher() throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement st = con.prepareStatement("select * from teacher");

        ResultSet rs = st.executeQuery();
        while (rs.next()) {

            int id = rs.getInt("id");
            String name = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            int age = rs.getInt("age");
            String phone = rs.getString("phone");
            System.out.println(id + "\t\t" + name + "\t\t" + lastName + "\t\t" + age
                    + "\t\t" + phone);
        }

        rs.close();
        st.close();
        con.close();

    }

    /**
     * this method gets row specific id
     * @param teacherId int type
     * @throws SQLException
     */
    public static void getDataInTableTeacher(int teacherId) throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement st = con.prepareStatement("select * from teacher where id = ?");

        st.setInt(1,teacherId);

        ResultSet rs = st.executeQuery();
        while (rs.next()) {

            int id = rs.getInt("id");
            String name = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            int age = rs.getInt("age");
            String phone = rs.getString("phone");
            System.out.println(id + "\t\t" + name + "\t\t" + lastName + "\t\t" + age
                    + "\t\t" + phone);
        }

        rs.close();
        st.close();
        con.close();

    }
    /*TODO
    public static void UpdateDataInTableTeacher(int teacherId,String firstName, String lastName, int age, String phone) throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement st = con.prepareStatement( "UPDATE teacher SET first_name = ?,last_name = ?, age = ?,phone = ? WHERE id = ?");

        st.setInt(1,teacherId);

        int rs = st.executeUpdate();

            st.setString(2, firstName);
            st.setString(3, lastName);
            st.setInt(4, age);
            st.setString(5, phone);



        int rows = st.executeUpdate();
        if (rows > 0) {
            System.out.println("hajoxutyamb katarvel e");
        }

        st.close();
        con.close();
    }

     */

    /**
     * this method deletes the row with the number we passed
     * @param sql type string
     * @throws SQLException
     */
    public static void DeleteDataInTableTeacher(String sql) throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement st = con.prepareStatement(sql);

        boolean b = st.execute();

        if(!b)
            System.out.println("jnjvel e");
        else
            System.out.println("chi jnjvel");


        st.close();
        con.close();
    }


}
