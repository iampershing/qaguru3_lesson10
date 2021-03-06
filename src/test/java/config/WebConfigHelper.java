package config;

import org.aeonbits.owner.ConfigFactory;

public class WebConfigHelper {

    public static String getSearchItem() {
        return getConfig().searchItem();
    }

    public static String getSearchResult() {
        return getConfig().searchResult();
    }

    public static String getBaseUrl() {
        return getConfig().baseUrl();
    }

    public static String getBrowserName() {
        return getConfig().browserName();
    }

    public static String getBrowserVersion() {
        return getConfig().browserVersion();
    }

    public static String getWebDriverRemoteURL() {
        return getConfig().webDriverRemoteURL();
    }

    private static WebConfig getConfig() {
        if (System.getProperty("environment") == null) System.setProperty("environment", "local");

        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }

}
