package com.spartaglobal.DatabaseExceptions;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class employeeAgeTest {

    @Test
    public void testAssertMap() {
NWEmployeesDAO nwEmployeesDAO = new NWEmployeesDAO();
        Map<String, Integer> employeeAge = Map.ofEntries(Map.entry("Margaret Peacock",82)
                ,Map.entry("Andrew Fuller",67)
                ,Map.entry("Nancy Davolio",70)
                ,Map.entry("Steven Buchanan", 64)
                ,Map.entry("Laura Callahan", 61));
        Assert.assertEquals(employeeAge,nwEmployeesDAO.getEmployeeAge());



} }
