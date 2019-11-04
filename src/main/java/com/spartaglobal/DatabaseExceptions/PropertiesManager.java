package com.spartaglobal.DatabaseExceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager { // methods to get th username and password within the app.properties file
    private String username;
    private  String password;

    public PropertiesManager() {
        Properties properties = new Properties();
        try{
        properties.load(new FileReader("resources/app.properties"));
    } catch (IOException e){
            e.printStackTrace();
        }
        this.username = properties.getProperty("username");
        this.password = properties.getProperty("password");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
