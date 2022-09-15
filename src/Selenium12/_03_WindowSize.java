package Selenium12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Dimension;

public class _03_WindowSize extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();//ekranı tam hale getiriyor
        Bekle(4);


        //ekranı yeni ölçülee göre set etme
        Dimension dim=new Dimension(516,600);
        driver.manage().window().setSize(dim);

        BekleKapat();




    }


}
