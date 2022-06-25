package pages.rsa;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningPathPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LearningPathPage.class);

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[2]/div/a[2]")
    private WebElement javascript;

    @FindBy(xpath ="/html/body/div/div[2]/div/div/div[2]/div/a[3]")
    private WebElement python;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[2]/div/a[4]")
    private WebElement java;


    public LearningPathPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectJavaScript(){
        click(javascript);
        //LOG.info("Filtered By JavaScript Successfully");
    }

    public void selectPython(){
        click(python);
        //LOG.info("Filtered By Python Successfully");
    }

    public void selectJava(){
        click(java);
        //LOG.info("Filtered By Java Successfully");
    }
}
