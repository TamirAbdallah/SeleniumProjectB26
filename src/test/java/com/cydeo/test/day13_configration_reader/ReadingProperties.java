package com.cydeo.test.day13_configration_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
@Test
    public void reading_from_properties_file() throws IOException {

 // Creat Properties class ' object.
 // we need properties class to use getProperty ("Key") method
    Properties properties = new Properties();

    // Create FileInputStream object to open file as a stream in java memory.
    FileInputStream file = new FileInputStream("configuration.properties");

    // Load "properties" object with the file we opened using FileInputStream
properties.load(file);

// we can use properties.getProperty method to read from the file we loaded.(configuration.properties)

    System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
    System.out.println("properties.getProperty(\"evn\") = " + properties.getProperty("evn"));
    System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
}
}
