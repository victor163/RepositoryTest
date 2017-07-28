import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Victor\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        Test start=new Test();
        start.yandex(driver);
        start.market(driver);
        start.komp(driver);
        start.plansh(driver);
        start.filtr(driver);

        start.prov(driver);
        driver.quit();
    }
}
