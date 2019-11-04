package com.spartaglobal.DatabaseExceptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NWEmployeesDAO nWEmployeesDAO = new NWEmployeesDAO();
//        NWEmployeesDAO.getEmployeeList();
        nWEmployeesDAO.getEmployeeBirthday();
//
//        NWEmployeesDAO.getTotalNUmberOfEmployees();
////
//        NWEmployeesDAO.getEmployeeAge();
//
//        NWEmployeesDAO.getEmployeeCountry();

//        NWEmployeesDAO.getEmployeeTitle();

//        NWCustomerDAO nwCustomerDAO = new NWCustomerDAO();
////        nwCustomerDAO.getCustomersFromLondonList();
//        nwCustomerDAO.getCompanyOwners();

        NWOrdersDAO nwOrdersDAO = new NWOrdersDAO();
        nwOrdersDAO.getShippedCountry();
    }
}
