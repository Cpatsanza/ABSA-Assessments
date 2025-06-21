package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HelperMethods {

    private Properties properties;

    public void propertiesReader() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/test/java/stepDefinitions/global.properties");
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}

