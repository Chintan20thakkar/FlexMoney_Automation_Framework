package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Screen3 {

    WebDriver driver;

    public Screen3(WebDriver driver){

        this.driver=driver;
    }

    @FindBy(className ="mdc-radio__native-control")
    WebElement EMIoption;
    
    @FindBy(id ="submitButton")
    WebElement continueBtn;

    public void selectEMIOption() {
        EMIoption.click();
        continueBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}

