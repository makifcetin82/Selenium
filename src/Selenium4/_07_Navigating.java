package Selenium4;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_Navigating extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
// tarayıcının linklere tıkladıgında gidip geldiği sayfaları saklar ve aşağıda ki komutlar la ileri geri yönlenir.
        Bekle(3);
        WebElement element=driver.findElement(By.linkText("Alerts(JavaScript)"));
        element.click();
        Bekle(3);



        driver.navigate().back();
        Bekle(3);

        driver.navigate().forward();
        BekleKapat();
    }


}
