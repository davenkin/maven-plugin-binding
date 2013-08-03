import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/3/13
 * Time: 7:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class SafariIntegrationTest {

    @Test
    public void testHelloWorldIndexPage() {
        WebDriver driver = new SafariDriver();
        driver.get("http://localhost:8080");
        WebElement element = driver.findElement(By.tagName("h2"));
        assertThat(element.getText(), is("Hello World!"));
    }
}
