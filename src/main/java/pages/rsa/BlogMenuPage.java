package pages.rsa;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlogMenuPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(BlogMenuPage.class);

    //Appium
    @FindBy(xpath = "//*[@id=\"menu-item-1162\"]/a")
    private WebElement appiumbtn;
    @FindBy(xpath = "//h1[contains(text(),'APPIUM Tutorial for Android & iOS Mobile Apps Test')]")
    private WebElement appiumtitle;

    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement appiumgetstarted;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[6]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement appiumsetupinstall;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement appiumandroiddebug;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[8]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/span[1]/span[1]/strong[1]/span[1]")
    private WebElement appiumuiautomate;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[9]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/span[1]/span[1]/strong[1]/span[1]")
    private WebElement appiumnativeapp;

    //Java
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/div/div/div[2]/div/div/div/div/ul/li[2]/a")
    private WebElement javabtn;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/h1[1]")
    private WebElement javatitle;

    //java methods for assertion
    @FindBy(xpath = "//*[@id=\"tve_editor\"]/div[3]/div[2]/div[5]/div[2]/div[2]/div/div[2]/div/div/a")
    private WebElement javaFundementalsBtn;
    @FindBy(xpath = "//*[@id=\"tve_editor\"]/div[3]/div[2]/div[6]/div[2]/div[2]/div/div[2]/div/div/a")
    private WebElement oopsJavaclassesBtn;
    @FindBy (xpath = "//*[@id=\"tve_editor\"]/div[3]/div[2]/div[7]/div[2]/div[2]/div/div[2]/div/div/a")
    private WebElement oopsJavaModifiersBtn;
    @FindBy (xpath= "//*[@id=\"tve_editor\"]/div[3]/div[2]/div[8]/div[2]/div[2]/div/div[2]/div/div/a")
    private WebElement javaExceptionsBtn;
    @FindBy(xpath = "//*[@id=\"tve_editor\"]/div[3]/div[2]/div[9]/div[2]/div[2]/div/div[2]/div/div/a")
    private WebElement btnJavaFrameworks;
    @FindBy (xpath= "//*[@id=\"tve_editor\"]/div[3]/div[2]/div[10]/div[2]/div[2]/div/div[2]/div/div/a")
    private WebElement javalistInterfacebtn;
    @FindBy(xpath = "//*[@id=\"tve_editor\"]/div[3]/div[2]/div[11]/div[2]/div[2]/div/div[2]/div/div/a")
    private WebElement javaSetinterfaceBtn;
    @FindBy(xpath = "//*[@id=\"tve_editor\"]/div[3]/div[2]/div[12]/div[2]/div[2]/div/div[2]/div/div/a")
    private WebElement javaQueuebtn;
    @FindBy(xpath = "//*[@id=\"tve_editor\"]/div[3]/div[2]/div[13]/div[2]/div[2]/div/div[2]/div/div/a")
    private WebElement javaMapInterfacebtn;


    @FindBy(css="#tve_editor > div:nth-child(3) > div.tve-page-section-in.tve_empty_dropzone > div:nth-child(5) > div.tve-cb.tve_empty_dropzone > div.thrv_wrapper.thrv-columns > div > div:nth-child(2) > div > div > a")
    private WebElement javafundementals;
    @FindBy(css = "#tve_editor > div:nth-child(3) > div.tve-page-section-in.tve_empty_dropzone > div:nth-child(6) > div.tve-cb.tve_empty_dropzone > div.thrv_wrapper.thrv-columns > div > div:nth-child(2) > div > div > a")
    private WebElement javaclasses;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement javamodifiers;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[8]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement javaexceptions;
    @FindBy(xpath ="//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[9]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]" )
    private WebElement javaframeworks;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[10]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement javalistinterface;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[11]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement javasetinterface;
    @FindBy(xpath ="//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[12]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement javaqueue;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[13]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement javamapinterface;



    //Python
    @FindBy(xpath = "//*[@id=\"menu-item-1165\"]/a")
    private WebElement pythonbtn;
    @FindBy(xpath = "//h1[contains(text(),'Python Automation Tutorial for Beginners: Learn Se')]")
    private WebElement pythonpagetitle;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement browserpython;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[6]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement pythonwebelement;
    @FindBy(xpath ="//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]" )
    private WebElement implicitwaits;
    @FindBy(xpath ="//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[8]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement explicitwait;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[9]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement functionalpython;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[10]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement htmlpython;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[11]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement framespython;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[12]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement chromepython;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[13]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement projectpython;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[14]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement loggingpython;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[15]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement readwritepython;
    @FindBy (xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[16]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement robustautomationpython;
    @FindBy(xpath = "//body/div[@id='tcb_landing_page']/div[1]/div[1]/div[1]/div[3]/div[2]/div[17]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement pytestpython;







    public BlogMenuPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //appium

    public void blogAppiumbtn(){
        click(appiumbtn);
        LOG.info("Clicked Appium Link Successfully");
    }
    public String appiumTitle(){
        return getElementText (appiumtitle);
        //LOG.info("Checked Appium Page Title Successfully");
    }
    public void appiumGetStarted(){
        click(appiumgetstarted);
        LOG.info("Selected Appium Get Started Successfully");
    }
    public void appiumSetupInstall(){
        click(appiumsetupinstall);
        LOG.info("Selected Appium Setup Install Successfully");
    }
    public void appiumAndroidDebug(){
        click(appiumandroiddebug);
        LOG.info("Selected Appium Android Debug Successfully");
    }
    public void appiumUIAutomator(){
        click(appiumuiautomate);
        LOG.info("Selected Appium UIAutomator Successfully");
    }
    public void appiumNativeApps(){
        click(appiumnativeapp);
        LOG.info("Selected Appium Native Apps Successfully");
    }

    //Java

    public void blogJavabtn(){
        click(javabtn);
        LOG.info("Clicked Java Link Successfully");
    }
    public String javaTitle(){
        return getElementText(javatitle);

    }


    public void javaFundementals(){
        click(javafundementals);
        LOG.info("Selected Java Fundementals Successfully");
    }
    public boolean clickFunctionsJavaFundemental() {
        return javaFundementalsBtn .isEnabled();
    }
    public void javaOOPClasses(){
        click(javaclasses);
        LOG.info("Selected Java OOPs Successfully");
    }
    public boolean clickFunctionsOopclases() {
        return oopsJavaclassesBtn .isEnabled();
    }

    public void javaOOPSModifiers(){
        click(javamodifiers);
        LOG.info("Selected Java OOPs Modifiers Successfully");
    }
    public boolean clickFunctionsOopsModifiers() {
        return oopsJavaModifiersBtn .isEnabled();
    }

    public void javaException(){
        click(javaexceptions);
        LOG.info("Selected Java Exception Successfully");
    }
    public boolean clickFunctionJavaException() {
        return javaExceptionsBtn .isEnabled();
    }

    public void javaFrameworks(){
        click(javaframeworks);
        LOG.info("Selected Java Frameworks Successfully");
    }
    public boolean clickFunctionJavaFrameworks() {
        return btnJavaFrameworks.isEnabled();
    }

    public void javaListInterface(){
        click(javalistinterface);
        LOG.info("Selected Java List Interface Successfully");
    }
    public boolean clickFunctionsJavaListInterface() {
        return javalistInterfacebtn .isEnabled();
    }

    public void javaSetInterface(){
        click(javasetinterface);
        LOG.info("Selected Java Set Interface Successfully");
    }
    public boolean clickFunctionsJavaSetInterface() {
        return javaSetinterfaceBtn .isEnabled();
    }

    public void javaQueue(){
        click(javaqueue);
        LOG.info("Selected Java Queue Successfully");
    }
    public boolean clickFunctionsJavaQueue() {
        return javaQueuebtn.isEnabled();
    }

    public void javaMapInterface(){
        click(javamapinterface);
        LOG.info("Selected Java Map Interface Successfully");
    }
    public boolean clickFunctionsJavaMapInterface() {
        return javaMapInterfacebtn .isEnabled();
    }

    //Python
    public void blogPythonBtn(){
        click(pythonbtn);
        LOG.info("Clicked Python Link Successfully");
    }
    public String pyhtonTitle(){
        return getElementText(pythonpagetitle);
        //LOG.info("Checked Python Page Title Successfully");
    }
    public void browserPython(){
        click(browserpython);
        LOG.info("Selected Python Browser Successfully");
    }
    public void webElementPython(){
        click(pythonwebelement);
        LOG.info("Selected Web Element Python Successfully");
    }
    public void pythonImplicitWait(){
        click(implicitwaits);
        LOG.info("Selected Python Implicit Wait Successfully");
    }
    public void explicitWait(){
        click(explicitwait);
        LOG.info("Selected Explicit Wait Python Successfully");
    }
    public void functionalPython(){
        click(functionalpython);
        LOG.info("Selected Python Functional Successfully");
    }
    public void htmlPython(){
        click(htmlpython);
        LOG.info("Selected Python HTML Successfully");
    }
    public void pythonFramework(){
        click(framespython);
        LOG.info("Selected Python Framework Successfully");
    }
    public void chromeOptionsPython(){
        click(chromepython);
        LOG.info("Selected Chrome Options Python Successfully");
    }
    public void projectPython(){
        click(projectpython);
        LOG.info("Selected Project Python Successfully");
    }

    public void loggingPython(){
        click(loggingpython);
        LOG.info("Selected Python Logging Successfully");
    }
    public void readWritePython(){
        click(readwritepython);
        LOG.info("Selected Python Read Write Successfully");
    }

    public void robustAutomationPython(){
        click(readwritepython);
        LOG.info("Selected Robust Automation Python Successfully");
    }

    public void pytestPython(){
        click(pytestpython);
        LOG.info("Selected Pytest Python Successfully");
    }

}
