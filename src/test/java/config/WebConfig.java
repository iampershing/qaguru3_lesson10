package config;

import org.aeonbits.owner.Config;
    @Config.LoadPolicy(Config.LoadType.MERGE)
    @Config.Sources({
            "system:properties",
            "classpath:${env}.properties"
    })
    public interface WebConfig extends Config {
        @Key("search.item")
        String searchItem();

        @Key("search.result")
        String searchResult();

        @Key("baseUrl")
        String baseUrl();

        @Key("browser.name")
        String browserName();

        @Key("browser.version")
        String browserVersion();

        @Key("webDriver.remote.url")
        String webDriverRemoteURL();
    }
