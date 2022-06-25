package pages.rsa;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;




public class JobSupportPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(JobSupportPage.class);

    @FindBy (xpath = "//*[@id=\"username\"]")
    private WebElement name;
    @FindBy (xpath = "//*[@id=\"mobileno\"]")
    private WebElement phoneno;
    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement email;
    @FindBy (xpath= "//*[@id=\"requirements\"]")
    private WebElement requirements;
    @FindBy (xpath ="//*[@id=\"programming-language\"]")
    private WebElement selectProgramming;
    @FindBy (xpath= "//input[@id='sharing']")
    private WebElement yesShare;
    @FindBy (xpath="//*[@id=\"timezone\"]")
    private WebElement timezone;
    @FindBy (xpath = "//*[@id=\"afford\"]")
    private  WebElement yesAfford;

    public JobSupportPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void typeUserName(String input){
        type(name, input);
        //LOG.info("Entered Username Successfully");
    }
    public void typePhoneNo(String input){
        type(phoneno, input);
        //LOG.info("Entered Phone No. Successfully");
    }
    public void typeEmail(String input){
       type(email, input);
        //LOG.info("Entered Email Successfully");
    }
    public void typeRequirements (String input){
        type (requirements, input);
        //LOG.info("Entered Requirements Successfully");
    }

    public void selectProgramingLanguage(String input){
        selectFromDropdown(selectProgramming, input);
        //LOG.info("Selected Program Language Successfully");
    }
    public void shareIssue(){
        click(yesShare);
        //LOG.info("Selected Share Successfully");
    }
    public void selectTimeZone(String input){
       selectFromDropdown(timezone, input);
        //LOG.info("Selected Timezone Successfully");
    }
    public void chooseAfford (){
        click (yesAfford);
        //LOG.info("Selected Yes Successfully");
    }



}
