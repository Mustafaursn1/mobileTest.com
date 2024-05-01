package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    public static Properties initializeProperties() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream=new FileInputStream("configuration.properties");
            try {
                properties.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return getProperties();


    }
    public static Properties getProperties(){

        return properties;
    }

}
