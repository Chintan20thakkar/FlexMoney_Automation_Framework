package Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import Base.BaseClass;
import Pages.Screen1;
import Pages.Screen2;
import Pages.Screen3;
import Pages.Screen4;
import Pages.Screen5;
import Pages.Screen6;



public class testClass extends BaseClass{


    WebDriver driver;

    @BeforeTest
    public void launchingBrowser() {

        driver=launchBrowser();
    }

    @Test
    public void successTransaction() {

        ExtentHtmlReporter report = new ExtentHtmlReporter("C:\\Users\\thakk\\eclipse-workspace\\FlexMoney2\\src\\main\\java\\Reports\\successTransaction.html");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(report);
        
        ExtentTest logger = extent.createTest("1 Sucecesful E2E complete Transaction");
        
        logger.log(Status.PASS, "Transaction completed succesfully");
      
        extent.flush();

       
        Screen1 enterMobNo= PageFactory.initElements(driver, Screen1.class );
        enterMobNo.enterMobNo();
        Screen2 entercorrectMobileNo= PageFactory.initElements(driver, Screen2.class );
        entercorrectMobileNo.enterCorrectMobNo();
        Screen3 selectEMI= PageFactory.initElements(driver, Screen3.class );
        selectEMI.selectEMIOption();
        Screen4 DebitrCard= PageFactory.initElements(driver, Screen4.class );
        DebitrCard.verifyDebitcard();
        Screen5 enterOTP= PageFactory.initElements(driver, Screen5.class );
        enterOTP.OTP();
        Screen6 Status= PageFactory.initElements(driver, Screen6.class );

        String checkStatus=Status.statusCheck();
        String actualValue="SUCCESS";
        Assert.assertEquals(checkStatus, actualValue);


    }

    @AfterTest	
    public void closingBrowser() {

        closeBrowser();


    }

}
