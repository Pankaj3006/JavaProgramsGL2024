package com.pan.packs.jsonprograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DatabaseReader {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        Connection connection = DriverManager
                //.getConnection("jdbc:mysql://localhost:3306/personal",
                .getConnection("jdbc:mysql://"+getValue("host")+":"+getValue("port")+"/"+getValue("dbname"),
                        getValue("user"),
                        getValue("passwd"));

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(getValue("query"));
        //ResultSet resultSet = statement.executeQuery("select * from department");
        while(resultSet.next())
        {
            String departmentId = resultSet.getString("deptid");
            String departmentName = resultSet.getString("dname");
            String departmentLocation = resultSet.getString("location");

            System.out.println(departmentId+"->"+departmentName+"->"+departmentLocation);
        }
    }

    private static String getValue(String key) throws IOException {

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/database.properties");
        properties.load(fileInputStream);

        return properties.getProperty(key);
    }
}
