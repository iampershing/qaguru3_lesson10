package config;

import org.aeonbits.owner.ConfigFactory;

public class APIConfigHelper {

    public static String getBaseUrl() {
        return getConfig().baseUrl();
    }

    public static String assertedValue() {
        return getConfig().assertedValue();
    }

    private static APIConfig getConfig() {
//        if (System.getProperty("environment") == null) System.setProperty("environment", "api");

        return ConfigFactory.newInstance().create(APIConfig.class, System.getProperties());
    }

}
