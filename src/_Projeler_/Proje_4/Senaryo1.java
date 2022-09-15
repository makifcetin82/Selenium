package _Projeler_.Proje_4;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo1 extends BaseStaticDriver {


    public static void main(String[] args) {


        driver.get("http://demowebshop.tricentis.com/");

        WebElement login=driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("technostudygrup16@gmail.com");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("123456");

        WebElement loginBtn= driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loginBtn.click();


}
}