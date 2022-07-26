package Gun11;
/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("http://chercher.tech/practice/frames");

         // 2-ınputa ülke adı girildi
        driver.switchTo().frame(0); //frame1
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");




        driver.switchTo().frame(0);//frame in içinde frame 3 e geçiş yaptım
        WebElement chkBox=driver.findElement(By.id("a"));
        chkBox.click();

        driver.switchTo().parentFrame();// su anda frame 1 e geri geldim
        driver.switchTo().parentFrame();// su anda ana sayfaya geri geldim.

        //driver..switchTo().defaultContent();//veya direk anasayfaya gitmenin yolu

        //4-select in 4. elamanını seçiniz

        driver.switchTo().frame(1);//frame2

        WebElement menu= driver.findElement(By.id("animals"));

        Select ddmenu=new Select(menu);//drop down
        ddmenu.selectByIndex(3);//4.eleman yani 3 indexli eleman seçildi





        BekleKapat();
    }

}
//<body> // defaultContent
//
//    <ifram1 name="IFrame1">  0
//        <iframe  name="IFrame3"></irmae> 0
//    </irmae>
//
//    <ifram1  name="IFrame2"> 1
//    </irmae>
//
//</body>