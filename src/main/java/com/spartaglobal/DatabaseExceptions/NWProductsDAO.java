package com.spartaglobal.DatabaseExceptions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NWProductsDAO {


    private NorthWindDBManager nwconn = new NorthWindDBManager();

    public List<Integer> getProductsPrice() {
        List<Integer> ProductsPrice = new ArrayList<>();
        final String SQL = "SELECT COUNT(ProductName)\n" +
                "FROM Products\n" +
                "WHERE UnitPrice BETWEEN 15 AND 21";
        try (Statement stmt = nwconn.northwindConnection().createStatement()) {
            ResultSet resultSet = stmt.executeQuery(SQL);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("ProductsName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ProductsPrice;
    }
}

