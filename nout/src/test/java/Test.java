import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
    WebElement element;
public void market(WebDriver driver){
    element=driver.findElement(By.linkText("Маркет"));
    element.click();
}
public void komp(WebDriver driver){
    element=driver.findElement(By.linkText("Компьютеры"));
    element.click();
}
public void nout(WebDriver driver){
    element=driver.findElement(By.xpath("html/body/div/div[4]/div[1]/div/div[1]/div/a[2]"));
    element.click();
}
public void filtr(WebDriver driver){
    element=driver.findElement(By.xpath("//*[@id=\"glf-priceto-var\"]"));
    element.sendKeys("30000");
    element=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/div[1]/div[5]/a/span/label"));
    element.click();
    element=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/div[1]/div[6]/a/span/label"));
    element.click();
    element=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[41]/div[1]/button"));
    element.click();
}
public void prov(WebDriver driver){
    driver.navigate().refresh();
    element=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[3]/div/div[1]/div/h3"));
    element.click();
    String appTitle=driver.getTitle();
    element=driver.findElement(By.xpath("//*[@id=\"header-search\"]"));
    element.sendKeys(appTitle);
    element=driver.findElement(By.xpath("/html/body/div[1]/div[1]/noindex/div/div/div[2]/div/div[1]/form/span[2]/button"));
    element.click();
    String stringName=driver.getTitle();
    if (stringName.equals(appTitle)) System.out.println("Ok");
    System.out.println("SSSSS ::"+appTitle);
}
public void yandex(WebDriver driver){
    driver.get("http://yandex.ru");
}
}
