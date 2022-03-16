package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {
    private static Properties properties = new Properties();

    static {
        String PathForPropertiesFile = "configuration.properties";

           try {
               FileInputStream fileInputStream = new FileInputStream(PathForPropertiesFile);

               properties.load(fileInputStream);
           }catch (IOException e) {
               e.printStackTrace();
               System.out.println("there is an expection" +e);
           }
    }
    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }
}
