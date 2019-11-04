package com.spartaglobal.DatabaseExceptions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class employeeCountryTest {


        @Test

        public void testAssertMap() {
            NWEmployeesDAO nwEmployeesDAO = new NWEmployeesDAO();
            Map<String, Integer> employeeCountry = Map.ofEntries(Map.entry("USA",5)
                    ,Map.entry("UK",4));
            Assert.assertEquals(employeeCountry,nwEmployeesDAO.getEmployeeCountry());
    }
}
