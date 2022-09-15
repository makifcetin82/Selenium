package Selenium11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _04_Scrollintro extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");


        //javascript komutlarını calıstırmak için
        JavascriptExecutor js=(JavascriptExecutor) driver;//sayfa içerisinde etkileşim sağlanıyor sayfa kaydırma gibi


        js.executeScript("window.scrollBy(0,1500)");
        //sayfayı sağa x kadar ve aşağıya y kadar kaydırır(x=0   y=1500 yukardakinde örnek)

        //1500 pixel kadar aşağıya kaydırıcak çünkü x =0





        Bekle(2);

        js.executeScript("window.scrollBy(0,-1500)");


        BekleKapat();

    }


}
