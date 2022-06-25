package pages.rsa;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchPage.class);

    //Search Selenium Course
    @FindBy(xpath = "//input[@id='search-courses']")
    private WebElement searchCourse;
    @FindBy(xpath = "//button[@id='search-course-button']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[contains(text(),'(Basics+Advanced+Int')]")
    private WebElement seleniumWebdriverTitle;

    //Match Java Course Title
    @FindBy(xpath = "//div[contains(text(),'Core Java for Automation Testers + Interview Progr')]")
    private WebElement javaCoreTitle;

    //Match Python Course Title
    @FindBy (xpath = "//div[contains(text(),'Python SDET- Automation Testing Package - 2 Course')]")
    private WebElement pythonCourseTitle;

    //Match JavaScript CourseTitle
    @FindBy(xpath = "//div[contains(text(),'JavaScript SDET- Automation Testing Package -5 Cou')]")
    private WebElement javaScriptCourseTitle;







    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Selenium Course Search
    public void searchCourseSelenium(String input){
        type(searchCourse,input);
        //LOG.info("Searched Selenium Successfully");
    }
    public void searchButton(){
        click(searchButton);
        //LOG.info("Clicked Search Button Successfully");
    }
    public String seleniumCourseTitle(){
        return getElementText(seleniumWebdriverTitle);
        //LOG.info("Selenium Course Title Checked Successfully");
    }
    //Java Course Title
    public String javaCoreTitle(){
        return getElementText(javaCoreTitle);
        //LOG.info("Checked JavaCore Title Successfully");
    }

    //Python Course Title
    public String pythonCourseTitle(){
        return getElementText(pythonCourseTitle);
        //LOG.info("Checked Python Course Title Successfully");
    }

    //JavaScript Course Title
    public String javaScriptCourseTitle(){
        return getElementText(javaCoreTitle);
        //LOG.info("Checked JavaScript Course Title Successfully");
    }

}
