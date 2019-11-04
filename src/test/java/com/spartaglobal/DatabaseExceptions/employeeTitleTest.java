package com.spartaglobal.DatabaseExceptions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class employeeTitleTest {

    @Test

    public void testAssertMap() {
        NWEmployeesDAO nwEmployeesDAO = new NWEmployeesDAO();
        Map<String, Integer> employeeTitle = Map.ofEntries(Map.entry("Vice President, Sales",1)
                ,Map.entry("Sales Representative",6), Map.entry("Inside Sales Coordinator", 1),Map.entry("Sales Manager",1));
        Assert.assertEquals(employeeTitle,nwEmployeesDAO.getEmployeeTitle());
    }

}
