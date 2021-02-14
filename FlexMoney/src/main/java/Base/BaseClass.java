package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.ConfigFileReader;


public class BaseClass {
    
    ConfigFileReader configFileReader;
    
    
   
    
    WebDriver driver;

    public WebDriver launchBrowser() {

        
        configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\thakk\\eclipse-workspace\\FlexMoney\\src\\main\\java\\Ressources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(configFileReader.getApplicationUrl());
        driver.manage().window().maximize();
        return driver;

    }


    public void closeBrowser() {

        driver.close();

    }



}
