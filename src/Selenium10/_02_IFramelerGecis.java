package Selenium10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGecis extends BaseStaticDriver {

    public static void main(String[] args) {

     driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

       // driver.switchTo().parentFrame();//geldiğin yere geri dön =(bir basamak geri git anlamı tasıyor.)
        driver.switchTo().defaultContent();// ilk anasayfaya direk geri dön


        driver.switchTo().frame(1);//frame 2 ye gidiyor bu yöntem ile


        WebElement menu=driver.findElement(By.id("animals"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByIndex(ddmenu.getOptions().size()-1);//son elemanı seçtik.


        BekleKapat();
    }



}
