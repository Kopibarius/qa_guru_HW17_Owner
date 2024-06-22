package mel8.egor.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class TestSetUpper {


    private final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public void testSetUp() {
        Configuration.browser = config.browserGet();
        Configuration.browserVersion = config.browserVersionGet();
        if (config.hostGet() != null) {
            Configuration.remote = config.hostGet();
        }
    }

}
