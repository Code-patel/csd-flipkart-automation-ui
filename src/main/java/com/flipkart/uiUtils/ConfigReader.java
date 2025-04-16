package com.flipkart.uiUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static String homeDir = System.getProperty("user.dir");
    static String propertyName = homeDir+"/src/test/java/resources/csd-flipkart-config.properties";
    static Properties props = new Properties();

    public static String getConfigValue(String key) {
        String value = "";
        try {
            FileInputStream fis = new FileInputStream(propertyName);
            props.load(fis);
            value = props.getProperty(key);
            fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return value;
    }
}
