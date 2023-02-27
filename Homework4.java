import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Homework4 {
    @Test
    public void Homework4(){
        open("https://www.google.com/");
        $(By.name("q")).shouldBe(Condition.visible, Duration.ofMillis(5000));
        $(By.name("q")).setValue("selenide").sendKeys(Keys.ENTER);

    }
}
