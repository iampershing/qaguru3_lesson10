package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:~/api.properties"
//        "classpath:${environment}.properties"
})
public interface APIConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("assertedValue")
    String assertedValue();

}