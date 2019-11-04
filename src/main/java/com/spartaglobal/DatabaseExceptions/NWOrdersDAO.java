package com.spartaglobal.DatabaseExceptions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NWOrdersDAO {

    private NorthWindDBManager nwconn = new NorthWindDBManager();

    public Map<String,Integer> getShippedCountry(){
        Map<String,Integer> shippedCountry = new HashMap<>();
        final String SQL = " SELECT  TOP 5 ShipCountry ,COUNT (ShipCountry) AS 'Shipped to country' FROM Orders\n" +
                "Group by ShipCountry\n" +
                "ORDER BY 'Shipped to country' DESC"
                ;
        try( Statement stmt = nwconn.northwindConnection().createStatement()){
            ResultSet resultSet = stmt.executeQuery(SQL);
            while(resultSet.next()){
                shippedCountry.put((resultSet.getString("ShipCountry")), resultSet.getInt("Shipped to Country"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(shippedCountry);
        return shippedCountry;
}

    public List<Integer> getPostCode(){
        List<Integer> PostalCode  = new ArrayList<>();
        final String SQL = "SELECT ShipPostalCode\n" +
                "FROM Orders\n" +
                "WHERE ShipCountry = 'UK'";
        try(Statement stmt = nwconn.northwindConnection().createStatement()) {
            ResultSet resultSet = stmt.executeQuery(SQL);
            while (resultSet.next()){
                System.out.println(resultSet.getString("ShipPostalCode"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return PostalCode;
    }


}
