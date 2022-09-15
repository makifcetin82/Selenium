package _Çalışma;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _SeleniumActionsOrnek extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("http://automationpractice.com/index.php");
        Actions action = new Actions(driver);

        WebElement element = driver.findElement(By.cssSelector("#homefeatured > li:nth-child(2)"));
        action.moveToElement(element).perform();

        Bekle(3);

        WebElement addToCart = driver.findElement(By.xpath("(//span[.='Add to cart']/parent::a)[2]"));
        action.moveToElement(addToCart).click().perform();

        Bekle(3);

        WebElement checkOutButton = driver.findElement(By.partialLinkText("Proceed to checkout"));
        action.moveToElement(checkOutButton).click().perform();

  // locater
        WebElement searchInput = driver.findElement(By.id("search_query_top"));

        WebElement submitButton = driver.findElement(By.name("submit_search"));

        WebElement image = driver.findElement(By.cssSelector("#best-sellers_block_right > div > ul > li:nth-child(9) > a > img"));

        //*[@id="viewed-products_block_left"]/div/ul/li/a/img

    }




}
