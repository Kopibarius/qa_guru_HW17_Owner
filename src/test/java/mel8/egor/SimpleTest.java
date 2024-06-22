package mel8.egor;

import mel8.egor.config.TestSetUpper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTest {

    @BeforeAll
    public static void setEnvironment() {
       new TestSetUpper().testSetUp();
    }

    @Test
    public void isRepositoryExist() {
        open("https://github.com/Kopibarius?tab=repositories");
        $(withText("qa_guru_HW17_Owner")).shouldBe(visible);
    }
}
