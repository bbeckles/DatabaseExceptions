package com.spartaglobal.DatabaseExceptions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ShippedCountryTest {

    @Test
    public void testAssertMap() {
        NWOrdersDAO nwOrdersDAO = new NWOrdersDAO();
        Map<String, Integer> shipped = Map.ofEntries(Map.entry("USA",122)
                ,Map.entry("UK",56)
                ,Map.entry("Brazil",83)
                ,Map.entry("France", 77)
                ,Map.entry("Germany", 122));
        Assert.assertEquals(shipped,nwOrdersDAO.getShippedCountry());
}
}
