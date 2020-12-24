package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static String getSearchItem() {
        return getConfig().searchItem();
    }

    public static String getSearchResult() {
        return getConfig().searchResult();
    }

    public static String getBaseUrl() { return getConfig().baseUrl();}

    public static String getBrowserName() { return getConfig().browserName();}

    public static String getBrowserVersion() { return getConfig().browserVersion();}

    public static String getWebDriverRemoteURL() {return  getConfig().webDriverRemoteURL();}

    private static WebConfig getConfig() {

        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }

}
