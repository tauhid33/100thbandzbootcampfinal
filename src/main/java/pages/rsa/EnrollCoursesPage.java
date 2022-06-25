package pages.rsa;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnrollCoursesPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(EnrollCoursesPage.class);

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/36X2X8fsRsC042XJQs6S']")
    private WebElement allAccessSub;
    @FindBy (xpath="//*[@id=\"new_sale\"]/div[1]/label[1]/div[3]/button")
    private WebElement enrollAllAccess;
    @FindBy (xpath = "//h1[contains(text(),'All-Access Membership')]")
    private WebElement allAccessTitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/sLVgDa8kQ1SncAbyxjpk']")
    private WebElement postmanAPI;
    @FindBy (xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollPostman;
    @FindBy (xpath ="//h1[contains(text(),'Learn Postman for API Automation Testing with Java')]" )
    private WebElement postmanAPITitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/itiecdoXQ4Ox1prd86VF']")
    private WebElement testAutomationRobot;
    @FindBy (xpath ="//*[@id=\"enroll-button\"]")
    private WebElement enrollAutomationRobot;
    @FindBy(xpath = "//h1[contains(text(),'Test Automation Robot Framework with Python - Sele')]")
    private WebElement automationRobotPythonTitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/itiecdoXQ4Ox1prd86VF']")
    private WebElement Angular;
    @FindBy (xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollAngular;
    @FindBy(xpath = "//h1[contains(text(),'Angular Fundamentals from Scratch & Unit/Integrati')]")
    private WebElement AngularTitle;

    @FindBy (css= "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/ZIDmoy0wRW0xoiNJc1HD']")
    private WebElement mentoring;
    @FindBy (xpath="/html/body/div[3]/div[1]/div/div[2]/div[5]/div/div[1]/a/div/div[1]/img")
    private WebElement enrollMentoring;
    @FindBy(xpath = "//h1[contains(text(),'MentorShip @Rahul Shetty + 4 Courses FREE Access')]")
    private WebElement mentoringTitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/EHNvJZiTZaHSTUusirJM']")
    private WebElement coreJava;
    @FindBy (xpath = "/html/body/section/div[2]/div[2]/div/ul/li[1]/a/div/div")
    private WebElement enrollCoreJava;
    @FindBy(xpath = "//h1[contains(text(),'Core Java for Automation Testers + Interview Progr')]")
    private WebElement coreJavaTitle;

    @FindBy (css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/8SWU4o8TgKVrvb4I8qT5']")
    private WebElement sdetJavascript;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollsdetJavaScript;
    @FindBy(xpath = "//h1[contains(text(),'JavaScript SDET- Automation Testing Package -5 Cou')]")
    private WebElement sdetJavascriptTitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/qI8n2KkER6lbYxk5PX8w']")
    private WebElement sdetJava;
    @FindBy (xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollsdetJava;
    @FindBy (xpath = "//h1[contains(text(),'Java SDET Automation Package - 6 Courses Bundle')]")
    private WebElement sdetJavaTitle;

    @FindBy (css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/jQsdyYATUOK9hAc4cbNP']")
    private WebElement softwareQA;
    @FindBy (xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollsoftwareQA;
    @FindBy(xpath = "//h1[contains(text(),'- 4 Courses B')]")
    private WebElement softwareQATitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/gL3s7IuYRkmxoAAtDfrR']")
    private WebElement Devops;
    @FindBy (xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollDevops;
    @FindBy(xpath = "//h1[contains(text(),'Test Architect / DevOps for QA Package - 5 Courses')]")
    private WebElement DevopsTitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/7wydx244SmaCVWMp9np0']")
    private WebElement seleniumDesign;
    @FindBy (xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollSeleniumDesign;
    @FindBy(xpath = "//h1[contains(text(),'Selenium Design Patterns/Best Practices for Framew')]")
    private WebElement seleniumDesignTitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/AyNa8nSWCX038deJDbAQ']")
    private WebElement springBoot;
    @FindBy (xpath="//*[@id=\"enroll-button\"]")
    private WebElement enrollSpringBoot;
    @FindBy(xpath = "//h1[contains(text(),'Spring Boot Fundamentals with Unit Testing (MockMV')]")
    private WebElement springBootTitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/MkLfEgUNTHIiYsowIgv7']")
    private WebElement restAPI;
    @FindBy (xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollRestAPI;
    @FindBy(xpath = "//h1[contains(text(),'REST API Testing(Automation) from scratch-Rest Ass')]")
    private WebElement restAPITitle;

    @FindBy (css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/7yaezCB3Sm2SjehpjUuT']")
    private WebElement sdetPython;
    @FindBy (xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollSdetPython;
    @FindBy(xpath = "//h1[contains(text(),'Python SDET- Automation Testing Package - 2 Course')]")
    private WebElement getSdetPythonTitle;

    @FindBy (css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/UZOHHhj7RZ2ycRwRUUkg']")
    private WebElement Azure;
    @FindBy(xpath="//*[@id=\"enroll-button\"]")
    private WebElement enrollAzure;
    @FindBy(xpath = "//h1[contains(text(),'Azure Devops Fundamentals for Testers -CI/CD+Proje')]")
    private WebElement AzureTitle;

    @FindBy (css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://cdn.filestackcontent.com/bpJ66rY9R4iCV96Snbqk']")
    private WebElement seleniumJava;
    @FindBy (xpath="//*[@id=\"enroll-button\"]")
    private WebElement enrollSeleniumJava;
    @FindBy(xpath = "//h1[contains(text(),'(Basics+Advanced+Int')]")
    private WebElement seleniumJavaTitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/Dx2Glc3kSoCjW4BjTDQz']")
    private WebElement webdriverIO;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollWebDriverIO;
    @FindBy(xpath = "//h1[contains(text(),'WebDriverIO + Node.js -JavaScript UI Automation fr')]")
    private WebElement webdriverIOTitle;

    @FindBy (css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/G2bkBpDKSj6iLoTJAT6r']")
    private WebElement cyrpressAutomation;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollCypress;
    @FindBy(xpath = "//h1[contains(text(),'Cypress-Modern Automation Testing from Scratch + F')]")
    private WebElement cypressAutomationTitle;

    @FindBy (css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/laXdpLaST6qJp6f0WxvZ']")
    private WebElement sdetQA;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollSdetQA;
    @FindBy(xpath = "//h1[contains(text(),'SDET/QA Automation Interview Kit + Java logic Prog')]")
    private WebElement sdetQATitle;

    @FindBy (css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://cdn.filestackcontent.com/4kDDywuR268UkIO1oEAg']")
    private WebElement appiumSelenium;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollAppiumSelenium;
    @FindBy(xpath = "//h1[contains(text(),'Appium (Selenium)-Mobile Automation Testing from S')]")
    private WebElement appiumSeleniumTitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://cdn.filestackcontent.com/shNalBBVQbW3iXalnyYg']")
    private WebElement jmeter;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollJmeter;
    @FindBy(xpath = "//h1[contains(text(),'Learn JMETER from Scratch -(Performance + Load) Te')]")
    private WebElement jmeterTitle;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/lTDRHVjMQpa2rAIdKU8p'")
    private WebElement devOpsFund;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollDevopsfund;
    @FindBy(xpath = "//h1[contains(text(),'Devops Fundamentals- CI/CD with AWS +Docker+Ansibl')]")
    private WebElement devOpsTitle;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://cdn.filestackcontent.com/30jHj8vrREC1BD34fu3E']")
    private WebElement webSecurity;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollWebSecurity;
    @FindBy (xpath = "//h1[contains(text(),'Web Security/Penetration Testing for Beginners')]")
    private WebElement webSecurityTitle;

    @FindBy(css ="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://d2vvqscadf4c1f.cloudfront.net/S2XuNTxbRYeWGlXHa29h_index.jpeg']" )
    private WebElement sql;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollSql;
    @FindBy(xpath = "//h1[contains(text(),'Learn SQL in Practical + DataBase Testing from Scr')]")
    private WebElement sqlTitle;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://cdn.filestackcontent.com/VsenBecXQeybxgj9EJQU']")
    private WebElement webServiceAPI;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollwebServices;
    @FindBy(xpath = "//h1[contains(text(),'WebServices/REST API Testing with SoapUI')]")
    private WebElement webServicesTitle;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/iUe8wKoCQy4UoWyUG09g']")
    private WebElement jira;
    @FindBy(xpath = "//button[@id='enroll-button']")
    private WebElement enrollJira;
    @FindBy(xpath = "//h1[contains(text(),'Master Software Testing+Jira+Agile on Live App-Be ')]")
    private WebElement jiraTitle;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://cdn.filestackcontent.com/eN22HRHRTYa5CpZV8r3g']")
    private WebElement advancedSelenium;
    @FindBy(xpath = "//button[@id='enroll-button']")
    private WebElement enrollAdvancedSel;
    @FindBy(xpath = "//h1[contains(text(),'Advanced Selenium(Architect)-Pageobject,TestNG,Mav')]")
    private WebElement advancedSeleniumTitle;

    @FindBy (css = "img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://cdn.filestackcontent.com/mqIu2pBlQbuw2IWw5kpD']")
    private WebElement seleniumPythonAuto;
    @FindBy (xpath = "//button[@id='enroll-button']")
    private WebElement enrollSelPythonAuto;
    @FindBy (xpath = "//h1[contains(text(),'Selenium Python Automation Testing from Scratch + ')]")
    private WebElement seleniumPythonAutoTitle;

    @FindBy (css= "img[src= 'https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://cdn.filestackcontent.com/kjpyfuUQSYOdPi9ZUT5J']")
    private WebElement qaResume;
    @FindBy (xpath= "//button[@id='enroll-button']")
    private WebElement enrollqaResume;
    @FindBy (xpath= "//h1[contains(text(),'Write effective QA Resume that will turn to interv')]")
    private WebElement qaResumeTittle;

    @FindBy (css= "img [src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/PjVEHfF8RlqzrFv1QldX']")
    private WebElement cucumberJava;
    @FindBy (xpath= "//h1[contains(text(),'Cucumber with Java-Build Automation Framework in l')]" )
    private WebElement cucumberJavaTitle;
    @FindBy (xpath = "//button[@id='enroll-button']")
    private WebElement enrollCucumberJava;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/RdsfMxA2St2GfG7HSeL9']")
    private WebElement autoFramework;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrollautoFramework;
    @FindBy(xpath ="//h1[contains(text(),'Learn Protractor(Angular Automation) from scratch ')]" )
    private WebElement autoFrameworkTitle;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/tV6TJqPjTzifJUvJSQqg']")
    private WebElement fullStackQA;
    @FindBy(xpath ="//button[@id='enroll-button']" )
    private WebElement enrollFullStackQA;
    @FindBy(xpath ="//h1[contains(text(),'SDET/Test Architect Essentials -Road to Full stack')]" )
    private WebElement fullStackQATitle;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/HOF0D1SSESxsefb0mZJP']")
    private WebElement uiPath;
    @FindBy(xpath = "//button[@id='enroll-button']")
    private WebElement enrolluipath;
    @FindBy(xpath = "//h1[contains(text(),'Robotic Process Automation(RPA) using UIPATH + Liv')]")
    private WebElement uiPathTitle;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/nSQerTWDSAWLLofuAj6Q']")
    private WebElement seleniumC;
    @FindBy(xpath = "//button[@id='enroll-button']")
    private WebElement enrollSeleniumC;
    @FindBy(xpath = "//h1[contains(text(),'Selenium WebDriver with C# from Scratch - Nunit Fr')]")
    private WebElement seleniumCTitle;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://file-uploads.teachablecdn.com/17ead38b0c9d47e5b6eacaa7061b78f1/dc3ef51d2b42444a9020941478f8a15f']")
    private WebElement gitCourse;
    @FindBy(xpath = "//h1[contains(text(),'Learn GIT In depth with BitBucket- Practical work ')]")
    private WebElement gitCourseTitle;

    @FindBy(xpath = "//a[contains(text(),'Next ›')]")
    private WebElement nextButton;

    @FindBy (css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://file-uploads.teachablecdn.com/7fc3bb97885d4624a3109eddecd2dff1/97e0855e891b41de8b74373da485b1c3']")
    private WebElement microservices;
    @FindBy(xpath = "//h1[contains(text(),'Microservices Contract Testing with Pact')]")
    private WebElement microservicesTitle;

    @FindBy(css="img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://file-uploads.teachablecdn.com/7f8788dfdafd491884e2f82c376059f1/06e3a159bf23447393a6f53b282bc21c']")
    private WebElement jsautomation;
    @FindBy(xpath = "//*[@id=\"enroll-button\"]")
    private WebElement enrolljsautomation;
    @FindBy(xpath = "//h1[contains(text(),'Playwright JS Automation Testing from Scratch with')]")
    private WebElement jsautomationTitle;




    public EnrollCoursesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //All Method creations under here

    //AllAccess Subscription
    public void allAccessSubscription(){
        click(allAccessSub);
        LOG.info("Click on All Course successful");
    }
    public void enrollAllAccessSubscription() {
        click(enrollSql);
        LOG.info("Clicked Enroll Successfully");
    }
    public String allAccessTitle(){
        return getElementText(allAccessTitle);
       // LOG.info("Checked All Access Page Title Successfully");
    }

    //postmanAPI
    public void Postman(){
        click(postmanAPI);
        LOG.info("Selected PostMan API Course Successfully");
    }
    public void enrollPostman() {
        click(enrollPostman);
        LOG.info("Clicked Enroll Successfully");
    }
    public String postmanAPITitle(){
        return getElementText(postmanAPITitle);
        //LOG.info("Checked PostMan API Page Title Successfully");
    }

    //testAutomationRobotPython
    public void testAutomationRobotPython(){
        click(testAutomationRobot);
        LOG.info("Selected Test Automation Robotic Python Course Successfully");
    }
    public void enrollTestAutomationRobotPython() {
        click(enrollAutomationRobot);
        LOG.info("Clicked Enroll Successfully");
    }
    public String testAutomationRobotPythonTitle(){
        return getElementText(automationRobotPythonTitle);
        //LOG.info("Checked Automation Robot Python Page Title Successfully");
    }

    // angular
    public void Angular(){
        click(Angular);
        LOG.info("Selected Angular Course Successfully");
    }
    public void enrollAngular() {
        click(enrollAngular);
        LOG.info("Clicked Enroll Successfully");
    }
    public String angularTitle() {
        return getElementText(AngularTitle);
        //LOG.info("Checked Angular Title Successfully");
    }

        //Mentoring
    public void mentoringCourse(){
        click (mentoring);
        LOG.info("Selected Mentoring Course Successfully");
        }
    public void enrollMentoringCourse() {
        click(enrollMentoring);
        LOG.info("Clicked Enroll Successfully");
    }
    public String mentoringTitle() {
        return getElementText(mentoringTitle);
        //LOG.info("Checked Mentoring Course Title Successfully");
        }

    //coreJava
    public void coreJava(){
        click(coreJava);
        LOG.info("Selected Core Java Course Successfully");
    }
    public void enrollCoreJava() {
        click(enrollCoreJava);
        LOG.info("Clicked Enroll Successfully");
    }
    public String coreJavaTitle() {
        return getElementText(coreJavaTitle);
        //LOG.info("Checked Core Java Title Successfully");
    }

    //JavaScript5
    public void sdetJavaScript5(){
        click(sdetJavascript);
        LOG.info("Selected SDET JavaScript Course Successfully");
    }
    public void enrollSdetJavaScript5() {
        click(enrollsdetJavaScript);
        LOG.info("Clicked Enroll Successfully");
    }
    public String sdetJavaScript5Title() {
        return getElementText(sdetJavascriptTitle);
        //LOG.info("Checked SDET JavaScript Title Successfully");
    }

    //SDET Java6
    public void sdetJava6(){
        click(sdetJava);
        LOG.info("Selected SDET Java Course Successfully");
    }
    public void enrollsdetjava6() {
        click(enrollsdetJava);
        LOG.info("Clicked Enroll Successfully");
    }
    public String sdetJava6Title() {
        return getElementText(sdetJavaTitle);
        //LOG.info("Checked SDET Java Title Successfully");
    }

    //SoftwareQAEngineer
    public void softwareQAEngineer(){
        click(sdetQA);
        LOG.info("Selected Software QA Course Successfully");
    }
    public void enrollsoftwareQAEngineer() {
        click(enrollsoftwareQA);
        LOG.info("Clicked Enroll Successfully");
    }
    public String softwareQAEngineerTitle() {
        return getElementText(sdetJavaTitle);
        //LOG.info("Checked Software QA Engineer Title Successfully");
    }

    //TestArchitectureDevOps
    public void testArchitectDevOps(){
        click(Devops);
        LOG.info("Selected Test Architecture Devops Course Successfully");
    }
    public void enrollTestArchitechDevOps() {
        click(enrollDevops);
        LOG.info("Clicked Enroll Successfully");
    }
    public String testArchitectureTitle() {
        return getElementText(DevopsTitle);
        //LOG.info("Checked Test Architecture Title Successfully");
    }

    //SeleniumDesign
    public void seleniumDesign(){
        click(seleniumDesign);
        LOG.info("Selected Selenium Design Course Successfully");
    }
    public void EnrollSeleniumDesign() {
        click(enrollSeleniumDesign);
        LOG.info("Clicked Enroll Successfully");
    }
    public String seleniumDesignTitle() {
        return getElementText(seleniumDesignTitle);
        //LOG.info("Checked Selenium Design Title Successfully");
    }

    //SpringBoot
    public void springBoot(){
        click(springBoot);
        LOG.info("Selected Spring Boot Course Successfully");
    }
    public void enrollSpringBoot() {
        click(enrollSpringBoot);
        LOG.info("Clicked Enroll Successfully");
    }
    public String springBootTitle() {
        return getElementText(springBootTitle);
        //LOG.info("Checked Spring Boot Title Successfully");
    }

    //RestAPI
    public void restAPI(){
        click(restAPI);
        LOG.info("Picked Currency Successfully");
    }
    public void enrollRestAPI() {
        click(enrollRestAPI);
        LOG.info("Clicked Enroll Successfully");
    }
    public String restAPITitle() {
        return getElementText(restAPITitle);
        //LOG.info("Checked Rest API Title Successfully");
    }

    //PythonSDET
    public void pythonSdet(){
        click(sdetPython);
        LOG.info("Selected Python SDET Course Successfully");
    }
    public void enrollPythonSdet() {
        click(enrollSdetPython);
        LOG.info("Clicked Enroll Successfully");
    }
    public String pythonSdetTitle() {
        return getElementText(getSdetPythonTitle);
       // LOG.info("Checked Python SDET Course Title Successfully");
    }

    //Azure
    public void Azure(){
        click(Azure);
        LOG.info("Selected Azure Course Successfully");
    }
    public void enrollAzure() {
        click(enrollAzure);
        LOG.info("Clicked Enroll Successfully");
    }
    public String AzureTitle() {
        return getElementText(AzureTitle);
        //LOG.info("Checked Azure Course Title Successfully");
    }

    //SeleniumJava
    public void seleniumJava(){
        click(seleniumJava);
        LOG.info("Selected Selenium with Java Course Successfully");
    }
    public void enrollSeleniumJava() {
        click(enrollSeleniumJava);
        LOG.info("Clicked Enroll Successfully");
    }
    public String seleniumJavaTitle() {
        return getElementText(seleniumJavaTitle);
        //LOG.info("Checked Selenium with Java Course Title Successfully");
    }

    //WebdriverIO
    public void webDriverIO(){
        click(webdriverIO);
        LOG.info("Selected Webdriver IO Course Successfully");
    }
    public void enrollWebDriverIO() {
        click(enrollWebDriverIO);
        LOG.info("Clicked Enroll Successfully");
    }
    public String webDriverIOTitle() {
        return getElementText(webdriverIOTitle);
        //LOG.info("Checked WebDriver IO Course Title Successfully");
    }

    //Cypress
    public void cyrpress(){
        click(cyrpressAutomation);
        LOG.info("Selected Cypress Course Successfully");
    }
    public void enrollCypress() {
        click(enrollCypress);
        LOG.info("Clicked Enroll Successfully");
    }
    public String cypressTitle() {
        return getElementText(cypressAutomationTitle);
        //LOG.info("Checked Cypress Course Title Successfully");
    }

    //SDETQA
    public void sdetQA(){
        click(sdetQA);
        LOG.info("Selected SDET QA Course Successfully");
    }
    public void enrollSdetQa() {
        click(enrollSdetQA);
        LOG.info("Clicked Enroll Successfully");
    }
    public String sdetQATitle() {
        return getElementText(sdetQATitle);
        //LOG.info("Checked SDET QA Course Title Successfully");
    }

    //Appium
    public void appium(){
        click(appiumSelenium);
        LOG.info("Selected Appium Course Successfully");
    }
    public void enrollAppium() {
        click(enrollAppiumSelenium);
        LOG.info("Clicked Enroll Successfully");
    }
    public String appiumTitle() {
        return getElementText(appiumSeleniumTitle);
        //LOG.info("Checked Appium Course Title Successfully");
    }

    //Jmeter
    public void jmeter(){
        click(jmeter);
        LOG.info("Selected Jmeter Course Successfully");
    }
    public void enrollJmeter() {
        click(enrollJmeter);
        LOG.info("Clicked EnrollSuccessfully");
    }
    public String jmeterTitle() {
        return getElementText(jmeterTitle);
        //LOG.info("Checked Jmeter Course Successfully");
    }

    //DevOps Fundementals
    public void devOpsFund(){
        click(devOpsFund);
        LOG.info("Selected DEVOPS Fundementals Course Successfully");
    }
    public void enrollDevopsFund() {
        click(enrollDevopsfund);
        LOG.info("Clicked Enroll Successfully");
    }
    public String devOpsFundTitle(){
        return getElementText(devOpsTitle);
        //LOG.info("Checked DEVIPS Fundementals Course Title Successfully");
    }

    //Web Security
    public void webSecurity(){
        click(webSecurity);
        LOG.info("Selected Course WebSecurity Successfully");
    }
    public void enrollWebSecurity() {
        click(enrollWebSecurity);
        LOG.info("Clicked Enroll Successfully");
    }
    public String webSecurityTitle(){
        return getElementText(webSecurityTitle);
        //LOG.info("Checked WebSecurity Course Title Successfully");
    }

    //Learn Sql Practical
    public void learnSqlPractical(){
        click (sql);
        LOG.info("Selected Learn SQL Course Successfully");
    }
    public void enrollLearnSqlPractical(){
        click (enrollSql);
        LOG.info("Clicked Enroll Successfully");
    }
    public String leanSqlTitle(){
        return getElementText (sqlTitle);
        //LOG.info("Checked SQL Course Title Successfully");
    }

    //WebServicesRest API
    public void webServicesRestAPI(){
        click (webServiceAPI);
        LOG.info("Selected WebServices Rest API Course Successfully");
    }
    public void enrollWebServiceRestAPI(){
        click (enrollwebServices);
        LOG.info("Clicked Enroll Successfully");
    }
    public String webServiceRestAPITitle(){
        return getElementText (webServicesTitle);
        //LOG.info("Checked WebServices Rest API Course Title Successfully");
    }

    //Master Software Testing+jira+Agile
    public void masterSoftTestJiraAgile(){
        click (jira);
        LOG.info("Selected Jira Course Successfully");
    }
    public void enrollMasterSoftTestJiraAgile(){
        click (enrollJira);
        LOG.info("Clicked Enroll Successfully");
    }
    public String masterSoftTestJiraAgileTitle(){
        return getElementText (jiraTitle);
        //LOG.info("Checked Jira Course Title Successfully");
    }

    //Advanced Selenium Architect
    public void advancedSeleniumArch(){
        click (advancedSelenium);
        LOG.info("Selected Advanced Selenium Successfully");
    }
    public void enrollAdvancedSeleniumArch(){
        click (enrollAdvancedSel);
        LOG.info("Clicked Enroll Successfully");
    }
    public String advancedSeleniumArchTitle(){
        return getElementText (advancedSeleniumTitle);
        //LOG.info("Checked Advanced Selenium Course Title Successfully");
    }

    // Selenium Python Automation
    public void SeleniumPythonAutomation(){
        click (seleniumPythonAuto);
        LOG.info("Selected Selenium Python Course Successfully");
    }
    public void enrollSeleniumPythonAutomation(){
        click (enrollSelPythonAuto);
        LOG.info("Clicked Enroll Successfully");
    }
    public String SeleniumPythonAutomationTitle(){
        return getElementText (seleniumPythonAutoTitle);
        //LOG.info("Checked Selenium Python Course Title Successfully");
    }

    //Qa Resume
    public void qaResume(){
        click (qaResume);
        LOG.info("Selected QA Resume Course Successfully");
    }
    public void enrollQaResume(){
        click (enrollqaResume);
        LOG.info("Clicked Enroll Successfully");
    }
    public String qaResumeTitle(){
        return getElementText (qaResumeTittle);
        //LOG.info("Checked QA Resume Course Title Successfully");
    }

    // Cucumber FrameWork
    public void cucumberFrameWork(){
        click (cucumberJava);
        LOG.info("Selected Cucumber Course Successfully");
    }
    public void enrollCucumberFrameWork(){
        click (enrollCucumberJava);
        LOG.info("Clicked Enroll Successfully");
    }

    public String cucumberFrameWorkTitle(){
        return getElementText (cucumberJavaTitle);
        //LOG.info("Checked Cucumber Course Title Successfully");
    }

    //Angular Automation
    public void angulaAutomation(){
        click (autoFramework);
        LOG.info("Selected AutoFramework Course Successfully");
    }
    public void enrollAngulaAutomation(){
        click (enrollautoFramework);
        LOG.info("Clicked Enroll Successfully");
    }
    public String angulaAutomationTitle(){
        return getElementText (autoFrameworkTitle);
        //LOG.info("Checked AutoFramework Course Title Successfully");
    }

    // Sdet Full Stack QA
    public void sdetFullStackQA(){
        click (fullStackQA);
        LOG.info("Selected SDET FullStack Course Successfully");
    }
    public void enrollSdetFullStackQA(){
        click (enrollFullStackQA);
        LOG.info("Clicked Enroll Successfully");
    }
    public String sdetFullStackQATitle(){
        return getElementText (fullStackQATitle);
        //LOG.info("Checked SDET FullStack Course Title Successfully");
    }

    //Robotic Process Automation
    public void roboticProcessAuto(){
        click (uiPath);
        LOG.info("Selected Robotic Process Auto Course Successfully");
    }
    public void enrollRoboticProcessAuto(){
        click (enrolluipath);
        LOG.info("Clicked Enroll Successfully");
    }
    public String roboticProcessAutoTitle(){
        return getElementText (uiPathTitle);
        //LOG.info("Checked Robotic Process Autotitle Course Title Successfully");
    }

    //Selenium WebDriver C#
    public void seleniumC(){
        click (seleniumC);
        LOG.info("Selected Selenium with C Sucessfully");
    }
    public void enrollseleniumC(){
        click (enrollSeleniumC);
        LOG.info("Clicked Enroll Successfully");
    }
    public String seleniumCTitle(){
        return getElementText (seleniumCTitle);
        //LOG.info("Checked Selenium with C Course Title Successfully");
    }

    // Git with Bit Bucket
    public void gitWBitbucket(){
        click (gitCourse);
        LOG.info("Selected Git with BitBucket Course Successfully");
    }
    public String gitWBitbucketTitle(){
        return getElementText (gitCourseTitle);
        //LOG.info("Checked Git with BitBucket Course Title Successfully");
    }


    //Next page button
    public void nextPage(){
        click (nextButton);
        LOG.info("Next Button Selected Successfully");
    }

    //Micro-Services
    public void miceoServices() {
        click(microservices);
        LOG.info("Selected Microservices Course Successfully");
    }
    public String miceoServicesTitle(){
        return getElementText (microservicesTitle);
        //LOG.info("Checked Microservices Course Title Successfully");
    }

    //Js Automation
    public void jsAutomation(){
        click (jsautomation);
        LOG.info("Selected JS Automation Course Successfully");
    }
    public void enrollJsAutomation(){
        click (enrolljsautomation);
        LOG.info("Clicked Enroll Successfully");
    }

    public String jsAutomationTitle() {
        return getElementText(jsautomationTitle);
        //LOG.info("Checked JS Automation Course Title Successfully");
    }


}
