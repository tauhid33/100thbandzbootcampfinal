package apps.rsa;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rsa.Homepage;
import pages.rsa.SearchPage;


public class SearchPageTest extends CommonAPI {

    @Test
    public void searchSeleniumTest(){
        Homepage homepage = new Homepage(getDriver());
        SearchPage searchpage = new SearchPage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("Marshalllaw@example.com");
        homepage.typeUserPassword("abc123");
        homepage.clickSignInBtn();
        searchpage.searchCourseSelenium("Selenium");
        searchpage.searchButton();
        String expectedTitle= "Selenium Webdriver with Java (Basics+Advanced+Interview Guide)";
        Assert.assertEquals(expectedTitle,searchpage.seleniumCourseTitle());

    }

    @Test
    public void searchJavaTest() {
        Homepage homepage = new Homepage(getDriver());
        SearchPage searchpage = new SearchPage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("Marshalllaw@example.com");
        homepage.typeUserPassword("abc123");
        homepage.clickSignInBtn();
        searchpage.searchCourseSelenium("Java");
        searchpage.searchButton();
        String expectedTitle = "Core Java for Automation Testers + Interview Programs";
        Assert.assertEquals(expectedTitle, searchpage.javaCoreTitle());
    }

    @Test
    public void searchPythonTest(){
        Homepage homepage= new Homepage(getDriver());
        SearchPage searchpage = new SearchPage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("Marshalllaw@example.com");
        homepage.typeUserPassword("abc123");
        homepage.clickSignInBtn();
        searchpage.searchCourseSelenium("Python");
        searchpage.searchButton();
        String expectedTitle = "Python SDET- Automation Testing Package - 2 Courses Bundle";
        Assert.assertEquals(expectedTitle, searchpage.pythonCourseTitle());
    }

    @Test
    public void searchjavaScriptTest() {
        Homepage homepage = new Homepage(getDriver());
        SearchPage searchpage = new SearchPage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("Marshalllaw@example.com");
        homepage.typeUserPassword("abc123");
        homepage.clickSignInBtn();
        searchpage.searchCourseSelenium("javascript");
        searchpage.searchButton();
        String expectedTitle = "JavaScript SDET- Automation Testing Package -5 Courses Bundle";
        Assert.assertEquals(expectedTitle, searchpage.javaScriptCourseTitle());
    }



}
