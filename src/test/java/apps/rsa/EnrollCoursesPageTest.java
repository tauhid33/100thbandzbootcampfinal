package apps.rsa;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rsa.EnrollCoursesPage;
import pages.rsa.Homepage;


public class EnrollCoursesPageTest extends CommonAPI {

    @Test
    public void coursebtn() {
        Homepage homepage = new Homepage(getDriver());
        homepage.clickCourseButton();
    }

    @Test
    public void courseAllAccess() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.allAccessSubscription();
        String expectedtitle= "All-Access Membership";
        Assert.assertEquals(expectedtitle,courses.allAccessTitle());
        courses.enrollAllAccessSubscription();


    }

    @Test
    public void coursePostmanAuto() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.Postman();
        String expectedtitle= "Learn Postman for API Automation Testing with Javascript";
        Assert.assertEquals(expectedtitle,courses.postmanAPITitle());
        courses.enrollPostman();
    }

   @Test
    public void courseAutoRobotPython() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.testAutomationRobotPython();
        String expectedtitle= "Test Automation Robot Framework with Python - Selenium Tests";
        Assert.assertEquals(expectedtitle,courses.testAutomationRobotPythonTitle());
        courses.enrollTestAutomationRobotPython();
    }

    @Test
    public void courseAngularFund() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.Angular();
        String expectedtitle= "Angular Fundamentals from Scratch & Unit/Integration Testing";
        Assert.assertEquals(expectedtitle,courses.angularTitle());
        courses.enrollAngular();
    }

    @Test
    public void courseMentorship() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.mentoringCourse();
        String expectedtitle= "MentorShip @Rahul Shetty + 4 Courses FREE Access";
        Assert.assertEquals(expectedtitle,courses.mentoringTitle());
        courses.enrollMentoringCourse();
    }

    @Test
    public void courseCoreJava() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.coreJava();
        String expectedtitle= "Core Java for Automation Testers + Interview Programs";
        Assert.assertEquals(expectedtitle,courses.coreJavaTitle());
        courses.enrollCoreJava();
    }

    @Test
    public void courseSdetJava5() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.sdetJavaScript5();
        String expectedtitle= "JavaScript SDET- Automation Testing Package -5 Courses Bundle";
        Assert.assertEquals(expectedtitle,courses.sdetJavaScript5Title());
        courses.enrollSdetJavaScript5();
    }

    @Test
    public void courseSDetJava6() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.sdetJava6();
        String expectedtitle= "Java SDET Automation Package - 6 Courses Bundle";
        Assert.assertEquals(expectedtitle,courses.sdetJava6Title());
        courses.enrollsdetjava6();
    }

    @Test
    public void courseSoftwareQA4() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.softwareQAEngineer();
        String expectedtitle= "Software Quality Assurance Engineer - 4 Courses Bundle";
        Assert.assertEquals(expectedtitle,courses.softwareQAEngineerTitle());
        courses.enrollsoftwareQAEngineer();
    }

    @Test
    public void courseTestArchitectDevops() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.testArchitectDevOps();
        String expectedtitle= "Test Architect / DevOps for QA Package - 5 Courses Bundle";
        Assert.assertEquals(expectedtitle,courses.testArchitectureTitle());
        courses.testArchitectureTitle();
    }

    @Test
    public void courseSeleniumDesign() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.seleniumDesign();
        String expectedtitle= "Selenium Design Patterns/Best Practices for Framework Design";
        Assert.assertEquals(expectedtitle,courses.seleniumDesignTitle());
        courses.EnrollSeleniumDesign();
    }

    @Test
    public void courseSpringUnitTesting() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.springBoot();
        String expectedtitle= "Spring Boot Fundamentals with Unit Testing (MockMVC/Mockito)";
        Assert.assertEquals(expectedtitle,courses.springBootTitle());
        courses.enrollSpringBoot();
    }

    @Test
    public void courseRestAPI() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.restAPI();
        String expectedtitle= "REST API Testing(Automation) from scratch-Rest Assured java";
        Assert.assertEquals(expectedtitle,courses.restAPITitle());
        courses.enrollRestAPI();
    }

    @Test
    public void coursePythonSdet2() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.pythonSdet();
        String expectedtitle= "Python SDET- Automation Testing Package - 2 Courses Bundle";
        Assert.assertEquals(expectedtitle,courses.pythonSdetTitle());
        courses.enrollPythonSdet();
    }

    @Test
    public void courseAzureDevops() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.Azure();
        String expectedtitle= "Azure Devops Fundamentals for Testers -CI/CD+Project Boards";
        Assert.assertEquals(expectedtitle,courses.AzureTitle());
        courses.enrollAzure();
    }

    @Test
    public void courseSeleniumWebdriverJava() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.seleniumJava();
        String expectedtitle= "Selenium Webdriver with Java (Basics+Advanced+Interview Guide)";
        Assert.assertEquals(expectedtitle,courses.seleniumJavaTitle());
        courses.enrollSeleniumJava();
    }

    @Test
    public void courseWebDriverIO() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.webDriverIO();
        String expectedtitle= "WebDriverIO + Node.js -JavaScript UI Automation from Scratch";
        Assert.assertEquals(expectedtitle,courses.webDriverIOTitle());
        courses.enrollWebDriverIO();
    }
    @Test
    public void courseCypressMod() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.cyrpress();
        String expectedtitle= "Cypress-Modern Automation Testing from Scratch + Framework";
        Assert.assertEquals(expectedtitle,courses.cypressTitle());
        courses.enrollCypress();
    }

    @Test
    public void courseSdetQAInterview() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.sdetQA();
        String expectedtitle= "SDET/QA Automation Interview Kit + Java logic Programs";
        Assert.assertEquals(expectedtitle,courses.sdetQATitle());
        courses.enrollSdetQa();
    }

   @Test
    public void courseAppiumSelenium() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.appium();
       String expectedtitle= "Appium (Selenium)-Mobile Automation Testing from Scratch";
       Assert.assertEquals(expectedtitle,courses.appiumTitle());
       courses.enrollAppium();
    }

    @Test
    public void coursePythonSdet() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.pythonSdet();
        String expectedtitle= "Python SDET- Automation Testing Package - 2 Courses Bundle";
        Assert.assertEquals(expectedtitle,courses.pythonSdetTitle());
        courses.enrollPythonSdet();
    }

    @Test
    public void courseJMeterScratch() {
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.jmeter();
        String expectedtitle = "Learn JMETER from Scratch -(Performance + Load) Testing Tool";
        Assert.assertEquals(expectedtitle, courses.jmeterTitle());
        courses.enrollJmeter();

    }

    @Test
    public void courseDevOpsFund(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.devOpsFund();
        String expectedtitle = "Devops Fundamentals- CI/CD with AWS +Docker+Ansible+Jenkins";
        Assert.assertEquals(expectedtitle, courses.devOpsFundTitle());
        courses.enrollDevopsFund();
    }

    @Test
    public void courseWebSecurity(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.webSecurity();
        String expectedtitle = "Web Security/Penetration Testing for Beginners";
        Assert.assertEquals(expectedtitle, courses.webSecurityTitle());
        courses.enrollWebSecurity();
    }

    @Test
    public void courseLearnSQLPractical(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.learnSqlPractical();
        String expectedtitle = "Learn SQL in Practical + DataBase Testing from Scratch";
        Assert.assertEquals(expectedtitle, courses.leanSqlTitle());
        courses.enrollLearnSqlPractical();
    }

    @Test
    public void courseWebservicesRestAPI(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.webServicesRestAPI();
        String expectedtitle = "WebServices/REST API Testing with SoapUI";
        Assert.assertEquals(expectedtitle, courses.webServiceRestAPITitle());
        courses.enrollWebDriverIO();
    }

    @Test
    public void courseJiraAgile(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.masterSoftTestJiraAgile();
        String expectedtitle = "Master Software Testing+Jira+Agile on Live App-Be a TeamLead";
        Assert.assertEquals(expectedtitle, courses.masterSoftTestJiraAgileTitle());
        courses.enrollMasterSoftTestJiraAgile();
    }

    @Test
    public void courseAdvanceSeleniumArch(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.advancedSeleniumArch();
        String expectedtitle = "Advanced Selenium(Architect)-Pageobject,TestNG,Maven,Jenkins,Ant,Cucumber";
        Assert.assertEquals(expectedtitle, courses.advancedSeleniumArchTitle());
        courses.enrollAdvancedSeleniumArch();
    }

    @Test
    public void coursesSeleniumPythonAutomation(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.SeleniumPythonAutomation();
        String expectedtitle = "Selenium Python Automation Testing from Scratch + Frameworks";
        Assert.assertEquals(expectedtitle, courses.SeleniumPythonAutomationTitle());
        courses.enrollSeleniumPythonAutomation();

    }

    @Test
    public void courseQAResume (){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.qaResume();
        String expectedtitle = "Write effective QA Resume that will turn to interview call";
        Assert.assertEquals(expectedtitle, courses.qaResumeTitle());
        courses.enrollQaResume();

    }

    @Test
    public void courseCucumber(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.cucumberFrameWork();
        String expectedtitle = "Cucumber with Java-Build Automation Framework in lesser code";
        Assert.assertEquals(expectedtitle, courses.cucumberFrameWorkTitle());
        courses.enrollCucumberFrameWork();

    }

    @Test
    public void courseAngularAutomation(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.angulaAutomation();
        String expectedtitle = "Learn Protractor(Angular Automation) from scratch +Framework";
        Assert.assertEquals(expectedtitle, courses.angulaAutomationTitle());
        courses.enrollAngulaAutomation();

    }

    @Test
    public void courseDevOpsFund2(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.sdetFullStackQA();
        String expectedtitle = "SDET/Test Architect Essentials -Road to Full stack QA";
        Assert.assertEquals(expectedtitle, courses.sdetFullStackQATitle());
        courses.enrollSdetFullStackQA();

    }

    @Test
    public void courseRoboticAutomation(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.roboticProcessAuto();
        String expectedtitle = "Robotic Process Automation(RPA) using UIPATH + Live Projects";
        Assert.assertEquals(expectedtitle, courses.roboticProcessAutoTitle());
        courses.enrollRoboticProcessAuto();

    }

    @Test
    public void courseSeleniumCSharp(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.seleniumC();
        String expectedtitle = "Selenium WebDriver with C# from Scratch - Nunit Framework";
        Assert.assertEquals(expectedtitle, courses.seleniumCTitle());
        courses.enrollseleniumC();

    }

    @Test
    public void coursesGitBitBucket(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.gitWBitbucket();
        String expectedtitle = "Learn GIT In depth with BitBucket- Practical work flows";
        Assert.assertEquals(expectedtitle, courses.gitWBitbucketTitle());

    }

    @Test
    public void courseMicroservices(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.nextPage();
        courses.miceoServices();
        String expectedtitle = "Microservices Contract Testing with Pact";
        Assert.assertEquals(expectedtitle, courses.miceoServicesTitle());

    }

    @Test
    public void courseJSAutomation(){
        Homepage homepage = new Homepage(getDriver());
        EnrollCoursesPage courses = new EnrollCoursesPage(getDriver());
        homepage.clickCourseButton();
        courses.nextPage();
        courses.jsAutomation();
        String expectedtitle = "Playwright JS Automation Testing from Scratch with Framework";
        Assert.assertEquals(expectedtitle, courses.jsAutomationTitle());
        courses.enrollJsAutomation();

    }
}
