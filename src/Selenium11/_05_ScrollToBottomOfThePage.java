package Selenium11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _05_ScrollToBottomOfThePage extends BaseStaticDriver {

    public static void main(String[] args) {

      driver.get("https://triplebyte.com/");


        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(o,docunment.body.scrollHeight)");

      BekleKapat();

    }


}
