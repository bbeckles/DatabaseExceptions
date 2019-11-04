package com.spartaglobal.DatabaseExceptions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class EmployeeBirthDay {

    @Test
    public void testAssertMap() {
        NWEmployeesDAO nwEmployeesDAO = new NWEmployeesDAO();
        Map<String, Integer> employeeBirth = Map.ofEntries(Map.entry("Anne Dodsworth", 1)
                , Map.entry("Nancy Davolio", 12)
                , Map.entry("Laura Callahan", 1));
        Assert.assertEquals(employeeBirth, nwEmployeesDAO.getEmployeeBirthday());

    }
}
