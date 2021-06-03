package common;

public class Utilities {
    private static String devicePropertyFile;

    public static void setDevicePropertyFile(String value) {
        devicePropertyFile = value;
    }
    public static String getDevicePropertyFile() {
        return devicePropertyFile;
    }

    public static void sleep(long millis){
        try{
            Thread.sleep(millis);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
