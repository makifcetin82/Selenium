package _Projeler_.Proje_4;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Senaryo3 extends BaseStaticDriver {

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

        WebElement addToCart=driver.findElement(By.cssSelector("[onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/2/1/1    ');return false;\"]"));
        addToCart.click();

        WebElement  recipientName = driver.findElement(By.id("giftcard_2_RecipientName"));
        recipientName.sendKeys("Hello Mello");

        WebElement recipientMail = driver.findElement(By.id("giftcard_2_RecipientEmail"));
        recipientMail.sendKeys("technostudygrup16@gmail.com");

        WebElement goToCart = driver.findElement(By.cssSelector("[class='ico-cart']"));
        goToCart.click();

        wait.until(ExpectedConditions.invisibilityOf(goToCart));

        WebElement CheckBoxClick=driver.findElement(By.id("termsofservice"));
        CheckBoxClick.click();

        WebElement CheckClickBox=driver.findElement(By.cssSelector("[id=\"checkout\"]"));
        CheckClickBox.click();

 //       WebElement FirstName=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]"));
//        FirstName.sendKeys();

         WebElement CompanyName=driver.findElement(By.id("id=\"BillingNewAddress_Company\""));
         CompanyName.sendKeys();

         WebElement CountryName=driver.findElement(By.cssSelector("[value=\"77\"]"));
         CountryName.click();

         WebElement CityName=driver.findElement(By.xpath("//input[@name=\"BillingNewAddress.City\"]"));
         CityName.sendKeys("İstanbul");

         WebElement Adress=driver.findElement(By.cssSelector("[name=\"BillingNewAddress.Address1\"]"));
         Adress.sendKeys("Kadıköy");
         WebElement ZipCode=driver.findElement(By.id("[id=\"BillingNewAddress_ZipPostalCode\"]"));
         ZipCode.sendKeys("5400");
         WebElement TelephoneNumber=driver.findElement(By.id("[id=\"BillingNewAddress_PhoneNumber\"]"));
         TelephoneNumber.sendKeys("543742511");

          WebElement Continue=driver.findElement(By.cssSelector("[id=\"billing-buttons-container\"]>input"));
          Continue.click();
          WebElement ContinueTool=driver.findElement(By.cssSelector("[class=\"button-1 payment-method-next-step-button\"]"));
          ContinueTool.click();
          wait.until(ExpectedConditions.invisibilityOf(ContinueTool));

          WebElement Continue3=driver.findElement(By.cssSelector("[class=\"button-1 payment-info-next-step-button\"]"));
          Continue3.click();
          wait.until(ExpectedConditions.invisibilityOf(Continue3));
          WebElement Continue4=driver.findElement(By.cssSelector("[class=\"button-1 confirm-order-next-step-button\"]"));
          Continue4.click();
          wait.until(ExpectedConditions.invisibilityOf(Continue4));

          WebElement AssertLast=driver.findElement(By.cssSelector("[class=\"title\"]>strong"));
          Assert.assertTrue(AssertLast.getText().contains("Your order has been successfully processed!"));

          BekleKapat();



    }

}

