package common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertiesReader {
    //specify the location of the environments.properties file here
    private static final String propFileLocation = Utilities.getDevicePropertyFile();

    //method to get property from environments.properties files
    public static String getProperty(String name) throws IOException {
        Properties configProperty = new Properties();
        FileInputStream fileInputStream = new FileInputStream(propFileLocation);
        configProperty.load(fileInputStream);
        return configProperty.getProperty(name);
    }

    //Method for setting a value in properties files
    public static void setProperty(String name, String value) {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            Properties configProperty = new Properties();
            fileInputStream = new FileInputStream(propFileLocation);
            configProperty.load(fileInputStream);
            configProperty.setProperty(name, value);
            fileOutputStream = new FileOutputStream(propFileLocation);
            configProperty.store(fileOutputStream, "Dynamic Values");
        } catch (Exception ex) {
            System.out.println("Failed to Load " + fileInputStream);
        } finally {

            try {
                Objects.requireNonNull(fileOutputStream).close();
            } catch (IOException ex) {
                System.out.println("Failed to Close " + fileInputStream);
            }
        }
    }
}
