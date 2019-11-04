package com.spartaglobal.DatabaseExceptions;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LondonCustomerTest {

    @Test

    public void testAssertList() {
        NWCustomerDAO nwCustomerDAO = new NWCustomerDAO();
        List<String> actual  = new ArrayList();



        Assert.assertEquals(actual,nwCustomerDAO.getCustomersFromLondonList());
    }
}
