package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.ConfigFileReader;


public class Screen1 {

    WebDriver Driver;


    public Screen1(WebDriver driver) {

        this.Driver=driver;
    }
    
    
    ConfigFileReader configFileReader;

    @FindBy(id="CI")
    WebElement mobno;
    

    @FindBy(id="continueBtn")
    WebElement cntbtn;



    public void enterMobNo () {
        
        
        configFileReader = new ConfigFileReader();
        mobno.sendKeys(configFileReader.getIncorrectMobileno());
        cntbtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
