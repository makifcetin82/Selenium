package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElamanınStatusu extends BaseStaticDriver{

    public static void main(String[] args) {
     driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println(sali.isDisplayed());//görünüyor mu
        System.out.println(sali.isEnabled());//görünüyor mu
        System.out.println(sali.isSelected());//görünüyor mu



          sali.click();
          Bekle(2);
          System.out.println(sali.isSelected());

          BekleKapat();
    }

}