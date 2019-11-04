package com.spartaglobal.DatabaseExceptions;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CompanyNameTest {


    @Test

    public void testAssertList() {
        NWCustomerDAO nwCustomerDAO = new NWCustomerDAO();
        List<Integer> actual  = new ArrayList();



        Assert.assertEquals(actual,nwCustomerDAO.getCompanyOwners());
    }
}
