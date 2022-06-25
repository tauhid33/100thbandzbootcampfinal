package pages.rsa;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MentoringPage extends CommonAPI {

    private final Logger LOG= LoggerFactory.getLogger(MentoringPage.class);

//bronze
   @FindBy (xpath = "/html/body/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/button/span")
   private WebElement bronzeMentor;
   @FindBy(xpath = "//a[contains(text(),'Request for Mentorship')]")
   private WebElement mentorshipformTitle;
   @FindBy (xpath = "//*[@id=\"name\"]")
   private WebElement name;
   @FindBy (xpath = "//*[@id=\"email\"]")
   private WebElement email;
   @FindBy(xpath = "//*[@id=\"mobile\"]")
   private WebElement cellphone;
   @FindBy (xpath = "//*[@id=\"serviceType\"]")
   private WebElement serviceType;
   @FindBy (xpath = "//*[@id=\"bio\"]")
   private WebElement bio;

   //platinum
   @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/div[2]/div[3]/button")
   private WebElement platinumMentor;
   @FindBy(xpath = "//h2[contains(text(),'Proper Guidance at right time of your Career can b')]")
   private WebElement platinumPageHeader;
   @FindBy(xpath = "//*[@id=\"new_sale\"]/div[1]/label[1]/div[3]/button")
   private WebElement enrollplatinum;
   @FindBy(xpath = "//*[@id=\"email\"]")
   private WebElement typeEmailPlatinum;
   @FindBy(xpath = "//*[@id=\"username\"]")
   private WebElement typeNamePlatinum;

    public MentoringPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    //Bronze Mentor Form
    public void clickBronzeMentor(){
        click(bronzeMentor);
        LOG.info("Selected Bronze Mentor Successfully");
    }

    public String mentorshipFormTitle(){
        return getElementText(mentorshipformTitle);
        //LOG.info("Checked Mentorship Page Title Successfully");
    }

    public void typeName(String input){
        type(name, input);
        LOG.info("Typed Name Successfully");
    }

    public void typeEmail(String input){
        type(email,input);
        LOG.info("Typed Email Successfully");
    }

    public void typePhone(String input){
        type(cellphone,input);
        LOG.info("Typed Phone No. Successfully");
    }

    public void serviceType(){
        click(serviceType);
        LOG.info("Selected Service Type Successfully");
    }

    public void typeBio(String input){
        type(bio,input);
        LOG.info("Entered Bio Information Successfully");

    }
    //Platinum Page
    public void clickPlatinumMentor(){
        click(platinumMentor);
        LOG.info("Selected Platinum Mentor Successfully");
    }

    public String platinumMentorPageTitle(){
        return getElementText(platinumPageHeader);
        //LOG.info("Checked Platinum Mentor Page Title Successfully");
    }
    public void enrollPlatinum(){
        click(enrollplatinum);
        LOG.info("Clicked Enroll Button Successfully");
    }

    public void typeEmailP(String input){
        type(typeEmailPlatinum, input);
        LOG.info("Entered Email Successfully");
    }

    public void typeNameP(String input){
        type(typeNamePlatinum, input);
        LOG.info("Entered Name Successfully");
    }







}
