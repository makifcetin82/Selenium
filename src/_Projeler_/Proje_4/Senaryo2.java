package _Projeler_.Proje_4;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo2 extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("http://demowebshop.tricentis.com/");

        WebElement login=driver.findElement(By.linkText("Log in"));
        login.click();

        String eMail="deneme5464564@gmail.com";
        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys(eMail);

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("123456");

        WebElement loginBtn= driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loginBtn.click();

        WebElement assertOne=driver.findElement(By.cssSelector("[class='validation-summary-errors']>span"));

        Assert.assertTrue(assertOne.getText().contains("Login was unsuccessful. Please correct the errors and try again."));

        WebElement assertTrue=driver.findElement(By.cssSelector("[class='validation-summary-errors']>ul li"));
        Assert.assertTrue(assertTrue.getText().contains("No customer account found"));


        BekleKapat();



    }


}
