package Gun07;


import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionClicTest extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");


        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions aksiyonlar = new Actions(driver);
        System.out.println("Aksiyon öncesi Aksiyonlar sınıfı oluşturuldu");

        Actions aksiyon = (Actions) aksiyonlar.moveToElement(element).click().build();
        System.out.println("Aksiyon hazırlandı");


        Bekle(2);
        aksiyon.perform();//aksiyonu gerçekleştirir.
        System.out.println("Aksiyon gerçekleşti");


        BekleKapat();

    }
}