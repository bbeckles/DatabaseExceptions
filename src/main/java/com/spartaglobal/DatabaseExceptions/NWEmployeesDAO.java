package com.spartaglobal.DatabaseExceptions;

import java.sql.*;
import java.util.*;

// sql queries can be within the method letting the method do all of the work

public class NWEmployeesDAO {


    private NorthWindDBManager nwconn = new NorthWindDBManager();

    public List <String> getEmployeeList(){
        List<String> employeenames  = new ArrayList<>();
        final String SQL = "SELECT TOP 10 * FROM Employees";
        try(Statement stmt = nwconn.northwindConnection().createStatement()) {
            ResultSet resultSet = stmt.executeQuery(SQL);
            while (resultSet.next()){
                System.out.println(resultSet.getString("firstName") + " " + resultSet.getString("lastName") );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeenames;
    }


    public int getTotalNUmberOfEmployees(){
        int  employeenum = 0;
        final String SQL = "SELECT COUNT(*) AS 'Total' FROM Employees";
        try ( Statement stmt = nwconn.northwindConnection().createStatement()){
            ResultSet resultSet = stmt.executeQuery(SQL);
            while (resultSet.next()){
                employeenum=resultSet.getInt("Total");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(employeenum);
        return employeenum;
    }

        public Map<String,Integer> getEmployeeAge(){
        Map<String,Integer> employeeAge = new HashMap<>();
            final String SQL =
                    " SELECT FirstName + ' ' + LastName   AS 'Name', \n" +
                    "DATEDIFF (d, BirthDate, GETDATE()) / 365 AS 'Age'\n" +
                    "FROM Employees \n" +
                    "WHERE DATEDIFF (d, BirthDate, GETDATE()) / 365 >60";
            try( Statement stmt = nwconn.northwindConnection().createStatement()){
                ResultSet resultSet = stmt.executeQuery(SQL);
                while(resultSet.next()){
                    employeeAge.put((resultSet.getString("Name")), resultSet.getInt("Age"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(employeeAge);
            return employeeAge;
        }

    public Map<String,Integer> getEmployeeCountry(){
        Map<String,Integer> employeeCountry = new HashMap<>();
        final String SQL = "SELECT country, COUNT(Country) AS 'Number of Employees'\n" +
                "FROM Employees \n" +
                "GROUP BY Country"
                ;
        try( Statement stmt = nwconn.northwindConnection().createStatement()){
            ResultSet resultSet = stmt.executeQuery(SQL);
            while(resultSet.next()){
                employeeCountry.put((resultSet.getString("country")), resultSet.getInt("Number Of Employees"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(employeeCountry);
        return employeeCountry;
    }

    public Map<String,Integer> getEmployeeTitle(){
        Map<String,Integer> employeeTitle = new HashMap<>();
        final String SQL = "SELECT Title, COUNT(Title) AS 'Number of Employees'\n" +
                "FROM Employees \n" +
                "GROUP BY Title"
                ;
        try( Statement stmt = nwconn.northwindConnection().createStatement()){
            ResultSet resultSet = stmt.executeQuery(SQL);
            while(resultSet.next()){
                employeeTitle.put((resultSet.getString("Title")), resultSet.getInt("Number Of Employees"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(employeeTitle);
        return employeeTitle;

        }

    public Map<String,Integer> getEmployeeBirthday(){
        Map<String, Integer> employeeBirthDay = new HashMap<>();
        final String SQL = "SELECT FirstName + ' ' + LastName AS 'Full Name', MONTH(BirthDate) AS 'Month of Birth'\n" +
                "FROM Employees\n" +
                "WHERE MONTH(BirthDate)  IN (11,12,1)";
        try (Statement stmt = nwconn.northwindConnection().createStatement()) {
            ResultSet resultSet = stmt.executeQuery(SQL);
            while (resultSet.next()) {
                employeeBirthDay.put((resultSet.getString("Full Name")), resultSet.getInt("Month of Birtht "));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(employeeBirthDay);
        return employeeBirthDay;


    }
}




