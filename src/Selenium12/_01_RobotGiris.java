package Selenium12;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/*
         İnterview Soruları :
         1- Windows popupları nasıl kontrol edersiniz ? Robot class la
         2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la
     */
    public class _01_RobotGiris extends BaseStaticDriver {

        public static void main(String[] args) throws AWTException {

          driver.get("https://demo.guru99.com/test/upload/");

           //toDO:Frame in varlıgı kontrol edilip var ise veya yok ise her iki duruma göre çözüm yapılıcak.*


            Bekle(3);
            driver.switchTo().frame(8);//"gdpr-consent-notice"

            WebElement acceptAll=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accept All']")));
            //WebElement acceptAll=driver.findElement(By.xpath("//span[text()='Accept All']"));

            acceptAll.click();
            driver.switchTo().defaultContent();

            Robot rbt=new Robot();

            for(int i=0;i<13;i++){//2 kere tab ile open butonuna ulastık


                rbt.keyPress(KeyEvent.VK_TAB);//TUŞA BASILDI KLAVYEDE DOWN
                rbt.keyRelease(KeyEvent.VK_TAB);//TUŞ BIRAKILDI.  TUŞ BIRAKILDI UP
                Bekle(1);
            }

            rbt.keyPress(KeyEvent.VK_ENTER);// DOWN//enter basıldın acılan pencere kapandı
            rbt.keyRelease(KeyEvent.VK_ENTER); //UP

            // Stringi hafızaya-clipboard a kopyalama kodu  CTRL+C
            StringSelection stringSelection = new StringSelection("C:/Users/asus/Desktop/Yeni%20Metin%20Belgesi.txt");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
            // Verilen stringi clipboard a set ediyor.


             Bekle(1);

             rbt.keyPress(KeyEvent.VK_CONTROL);
             rbt.keyRelease(KeyEvent.VK_K);// BU İKİ TUŞA AYNI ANDA BASILMIŞ DURUMDA.

             Bekle(1);

            rbt.keyPress(KeyEvent.VK_CONTROL);//tuşlar serbest bırakıldı
            rbt.keyRelease(KeyEvent.VK_K);

            for(int i=0;i<2;i++) {  // 2 kere tab ile OPEN butonuna ulaştık
                rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı  down
                rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı up
                Bekle(1  );
            }

            rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı  down   // ENTER bastık açılan pencere kapandı
            rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı up


           WebElement asser=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
           Assert.assertTrue(asser.getText().contains("has been successfully uploaded"));

           //Assert.assertTrue(driver.getPageSource().contains("has been successfully uploaded."));



            //BekleKapat();

        }


    }

