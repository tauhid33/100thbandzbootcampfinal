package apps.rsa;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rsa.BlogMenuPage;
import pages.rsa.Homepage;


public class BlogMenuPageTest extends CommonAPI {

    @Test
    public void blogAPIGetStarted(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogAppiumbtn();
        blog.appiumGetStarted();
        String expectedtitle= "APPIUM Tutorial for Android & iOS Mobile Apps Testing";
        Assert.assertEquals(expectedtitle,blog.appiumTitle());
    }
    @Test
    public void blogAPISetupInstallation(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogAppiumbtn();
        blog.appiumSetupInstall();
        String expectedtitle= "APPIUM Tutorial for Android & iOS Mobile Apps Testing";
        Assert.assertEquals(expectedtitle,blog.appiumTitle());
    }
//
    @Test
    public void blogAPIAndroidDebug(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogAppiumbtn();
        blog.appiumAndroidDebug();
        String expectedtitle= "APPIUM Tutorial for Android & iOS Mobile Apps Testing";
        Assert.assertEquals(expectedtitle,blog.appiumTitle());
    }
//
    @Test
    public void blogAPIUIAutomator(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogAppiumbtn();
        blog.appiumUIAutomator();
        String expectedtitle= "APPIUM Tutorial for Android & iOS Mobile Apps Testing";
        Assert.assertEquals(expectedtitle,blog.appiumTitle());
    }
//
    @Test
    public void blogAPINativeApps(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogAppiumbtn();
        blog.appiumNativeApps();
        String expectedtitle= "APPIUM Tutorial for Android & iOS Mobile Apps Testing";
        Assert.assertEquals(expectedtitle,blog.appiumTitle());
    }

    @Test
    public void blogJavaFund(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogJavabtn();
        blog.javaFundementals();
        Assert.assertTrue(blog.clickFunctionsJavaFundemental());
    }

    @Test
    public void blogJavaClassesObjects(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogJavabtn();
        blog.javaOOPClasses();
        Assert.assertTrue(blog.clickFunctionsOopclases());
    }

    @Test
    public void blogJavaOOPSModifiers(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogJavabtn();
        blog.javaOOPSModifiers();
        Assert.assertTrue(blog.clickFunctionsOopsModifiers());
    }

   @Test
    public void blogJavaException(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogJavabtn();
        blog.javaException();
        Assert.assertTrue(blog.clickFunctionJavaException());
    }

    @Test
    public void blogJavaFramework(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogJavabtn();
        blog.javaFrameworks();
        Assert.assertTrue(blog.clickFunctionJavaFrameworks());
    }

    @Test
    public void blogJavaListInterface(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogJavabtn();
        blog.javaListInterface();
        Assert.assertTrue(blog.clickFunctionsJavaListInterface());
    }

    @Test
    public void blogJavaSetInterface(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogJavabtn();
        blog.javaSetInterface();
        Assert.assertTrue(blog.clickFunctionsJavaSetInterface());
    }

    @Test
    public void blogJavaQueue(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogJavabtn();
        blog.javaQueue();
        Assert.assertTrue(blog.clickFunctionsJavaQueue());
    }

    @Test
    public void blogJavaMapInterface(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogJavabtn();
        blog.javaMapInterface();
        Assert.assertTrue(blog.clickFunctionsJavaMapInterface());
    }

    @Test
    public void blogPythonDifferentBrowsers(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.browserPython();

    }

    @Test
    public void blogPythonWebElements(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.webElementPython();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonImplcitWait(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.pythonImplicitWait();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonExplicitWait(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.explicitWait();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonFunctionalAutomation(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.functionalPython();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonAutomateHTML(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.htmlPython();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonAdvancedUserInteraction(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.pythonFramework();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonChromeOptions(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.chromeOptionsPython();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonPracticeProject(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.projectPython();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonLogging(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.loggingPython();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonReadWrite(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.readWritePython();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonRobustAutomation(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.robustAutomationPython();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

    @Test
    public void blogPythonPytest(){
        Homepage homepage =new Homepage(getDriver());
        BlogMenuPage blog =new BlogMenuPage(getDriver());
        homepage.clickOnBlogButton();
        blog.blogPythonBtn();
        blog.pytestPython();
        String expectedtitle= "Python Automation Tutorial for Beginners: Learn Selenium Python and PyTest framework";
        Assert.assertEquals(expectedtitle,blog.pyhtonTitle());
    }

}
