package mel8.egor.config;

import com.codeborne.selenide.Browser;
import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("firefox")
    String browserGet();

    @Key("browserVersino")
    @DefaultValue("122")
    String browserVersionGet();

    @Key("host")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String hostGet();
}
