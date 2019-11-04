package com.spartaglobal.DatabaseExceptions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NWCustomerDAO {
    private NorthWindDBManager nwconn = new NorthWindDBManager();

    public List<String> getCustomersFromLondonList(){
        List<String> LondonCustomers  = new ArrayList<>();
        final String SQL = "SELECT ContactName\n" +
                "FROM Customers\n" +
                "WHERE City = 'London'";
        try(Statement stmt = nwconn.northwindConnection().createStatement()) {
            ResultSet resultSet = stmt.executeQuery(SQL);
            while (resultSet.next()){
                System.out.println(resultSet.getString("ContactName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return LondonCustomers;
    }


    public List<Integer> getCompanyOwners(){
        List<Integer> CompanyOwners  = new ArrayList<>();
        final String SQL = "SELECT COUNT(ContactTitle) AS 'Company Owners'\n" +
                "FROM Customers";
        try(Statement stmt = nwconn.northwindConnection().createStatement()) {
            ResultSet resultSet = stmt.executeQuery(SQL);
            while (resultSet.next()){
                System.out.println(resultSet.getString("Company Owners"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return CompanyOwners;
    }

}
