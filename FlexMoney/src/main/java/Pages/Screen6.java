package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Screen6 {


    WebDriver driver;

    public Screen6(WebDriver driver){

        this.driver=driver;
    }

    @FindBy(xpath ="/html/body/div/h3[9]")
    WebElement Success;


    public String statusCheck() {

        String status=Success.getText();

        String [] arrsplit = status.split(" : ");

        for(int i=0;i<arrsplit.length;i++) {

            status=arrsplit[1];
        }
        return status;


    }
}


