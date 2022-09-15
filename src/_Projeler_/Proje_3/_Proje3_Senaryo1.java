package _Projeler_.Proje_3;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _Proje3_Senaryo1 extends BaseStaticDriver {


    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        Bekle(2);
        WebElement demoEbook=driver.findElement(By.cssSelector("[onclick^=\"return EJProductClick('1595015')\"]"));
        demoEbook.click();

        driver.switchTo().frame(5);

        WebElement cartItemNo = driver.findElement(By.xpath("(//span[@class=\"Cart-Items-Nos\"])[2]"));
        //Assert.assertTrue(cartItemNo.getText().equals("1"));
        if (cartItemNo.getText().equals("1")) {
            System.out.println("You have 1 item in your cart!");
            System.out.println("Success");
        } else {
            System.out.println("Fail!");
        }
        WebElement removeItem=driver.findElement(By.cssSelector("[class=\"Product-Remove\"]"));
        removeItem.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Your Cart is empty']")));

        WebElement continueShoppingButton_iFrame = driver.findElement(By.xpath("//button[text()='Continue Shopping']"));
        continueShoppingButton_iFrame.click();

        wait.until(ExpectedConditions.invisibilityOf(continueShoppingButton_iFrame));

        driver.switchTo().defaultContent();

        WebElement cartItem = driver.findElement(By.xpath("(//span[@id='cart_item_nos'])[2]"));

        if (cartItem.getText().equals("")) {
            System.out.println("You have 0 item in your cart!");
            System.out.println("Success");
        } else {
            System.out.println("Fail!");
        }

        BekleKapat();
    }


}
