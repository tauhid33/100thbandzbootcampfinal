package pages.rsa;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Homepage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Homepage.class);

    //Login and logout
    @FindBy(xpath = "/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")
    private WebElement login;
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement useremail;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement userpassword;
    @FindBy(xpath = "/html/body/main/div/form/div[4]/input")
    private WebElement signInButton;
    @FindBy(xpath = "//span[contains(text(),'Marshall Law')]")
    private WebElement usernameCheck;
    @FindBy (xpath = "//div[contains(text(),'Your email or password is incorrect.')]")
    private WebElement invalidLoginCheck;

    @FindBy (xpath = "//*[@id=\"user-dropdown\"]/li[7]/a")
    private WebElement logoutbtn;
    @FindBy(xpath = "//head//title")
    private WebElement logoutTitle;

    //Forgot Password
    @FindBy(xpath = "/html/body/main/div/form/div[3]/div[2]/a")
    private WebElement forgotPasswordLink;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement emailForgotPassword;
    @FindBy(xpath = "/html/body/main/div/form/div[2]/input")
    private WebElement NextBtn;
    @FindBy(xpath = "/html/body/main/div/h3")
    private WebElement resetPasswordPageHeader;


    //EditProfile
    @FindBy(xpath = "/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[9]/a/span")
    private WebElement profileDropdown;
    @FindBy(xpath = "//*[@id=\"user-dropdown\"]/li[2]/a")
    private WebElement editProfile;
    @FindBy (xpath = "//h2[contains(text(),'Profile')]")
    private WebElement editProfilePageTitle;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[4]/div/div/div[1]/form/button/i")
    private WebElement emailNotificationToggle;



    @FindBy(xpath = "/html/body/div/header/div[2]/div/div/div[2]/ul/li[2]/a")
    private WebElement linkdInLink;
    @FindBy(xpath = "/html/head/title")
    private WebElement linkedInPageTitle;

    @FindBy (xpath ="/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a" )
    private WebElement coursesbtn;

    @FindBy(css="body > div > header > div.header-upper > div > div > div.nav-outer.clearfix > nav > div.navbar-collapse.collapse.clearfix > ul > li:nth-child(8) > a")
    private WebElement blogbutton;

    @FindBy(xpath = "/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[5]/a")
    private WebElement mentorbtn;

    @FindBy (xpath = "/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[6]/a")
    private WebElement jobSupportbtn;
    @FindBy (xpath = "/html/body/div/div[2]/div/div[1]/div[1]/text()")
    private WebElement jobSupportPageTitle;

// ContactUS
    @FindBy (css="body > div > footer > div > div > div > div:nth-child(2) > ul > li:nth-child(2) > a")
    private WebElement contactUsbtn;
    @FindBy(xpath = "//h1[contains(text(),'Contact Us')]")
    private WebElement contactUsPageTitle;
    @FindBy (xpath = "//*[@id=\"username\"]")
    private WebElement name;
    @FindBy (xpath= "//*[@id=\"mobileno\"]")
    private WebElement mobileNo;
    @FindBy (xpath = "//*[@id=\"country\"]")
    private WebElement country;
    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement email;
    @FindBy (xpath = "//*[@id=\"subject\"]")
    private WebElement subject;
    @FindBy (xpath = "//*[@id=\"message\"]")
    private WebElement message;

    //Currency Conversion
    @FindBy(xpath ="/html/body/div/div[2]/section[2]/div[1]/div[1]/div[2]/div/label")
    private WebElement currency;

    //Learning Path
    @FindBy(xpath = "/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[4]/a")
    private WebElement learningpath;

    //Practice
    @FindBy(xpath = "/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[7]/a")
    private WebElement practice;
    @FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/h2")
    private WebElement practicePageTitle;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement yourname;
    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement youremail;

    //More
    @FindBy (xpath = "/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/a")
    private WebElement moreBtn;

    //Part-Time Job
    @FindBy (xpath= "/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/ul/li[2]/a")
    private WebElement partTImeJobBtn;
    @FindBy (xpath= "//*[@id=\"select-job-type\"]")
    private WebElement selectjob;
    @FindBy (xpath= "//*[@id=\"partTimeJobForm\"]/div/div[2]/div/p/a")
    private WebElement QAJobForm;

    //Update Address
    @FindBy (xpath = "//*[@id=\"user-dropdown\"]/li[3]/a")
    private WebElement selectManageSubscription;
    @FindBy(xpath = "/html/body/div[1]/div[1]/ul/li[4]/a")
    private WebElement selectAddress;
    @FindBy (xpath = "//select[@id='cardCountry']")
    private WebElement addressCountry;
    @FindBy (xpath = "//input[@id='billingStreetAddressLine1']")
    private WebElement addressStreet;
    @FindBy (xpath = "//input[@id='billingCity']")
    private WebElement addressCity;
    @FindBy (xpath = "//select[@id='billingRegion']")
    private WebElement addreessState;
    @FindBy (xpath = "//input[@id='billingPostalCode']")
    private WebElement addressZipcode;
    @FindBy (xpath = "//*[@id=\"react-address-profile\"]/div/form/div/label/span")
    private WebElement billingAddressTitle;


    //Refer a Friend
    @FindBy (xpath = "//a[contains(text(),'Refer a friend')]")
    private WebElement referfriendBtn;
    @FindBy (xpath = "//button[contains(text(),'Copy URL')]")
    private WebElement referfriendUrl;


    //Resend Email Verification
    @FindBy(xpath = "//button[contains(text(),'Resend email')]")
    private WebElement resendEmailBtn;
    @FindBy(xpath = "//div[contains(text(),'You are doing this too fast. Please wait and try a')]")
    private WebElement notificationtoast;




    public Homepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Login
    public void clickLoginButton(){
        click(login);
        //LOG.info("Clicked Login Button Successfully);
    }
    public void typeUserEmail(String input){
        type(useremail, input);
        LOG.info("Entered User Email Successfully");
    }
    public void typeUserPassword(String input){
        type(userpassword,input);
        LOG.info("Entered User Password Successfully");
    }
    public void clickSignInBtn(){
        click(signInButton);
        LOG.info("Clicked Sign In Button Successfully");
    }
    public String checkUserName() {
        return getElementText(usernameCheck);
        //LOG.info("Username Checked Successfully");
    }

    public String checkInvalidLogin() {
        return getElementText(invalidLoginCheck);
        //LOG.info("Checked Invalid Login Successfully");
    }

    //ResetPassword
    public void resetPassword(){
        click(forgotPasswordLink);
        LOG.info("Reset Password Link Clicked Successfully");
    }
    public void resetPasswordEmail(String input){
        type(emailForgotPassword,input);
        LOG.info("Typed Email Successfully");
    }
    public void sendEmail(){
        click(NextBtn);
        LOG.info("Clicked Send Mail Button Successfully");
    }

    public String checkResetPasswordPageTitle(){
        return getElementText(resetPasswordPageHeader);

    }


    //Resend Verification Email
    public void clickResendEmailBtn() {
        click(resendEmailBtn);
        LOG.info("Clicked on Resend Email Successfully");
    }
        public String checkNotificationMessage(){
            return getElementText(notificationtoast);

        }




    //logout
    public void clickLogOut(){
        click(logoutbtn);
        LOG.info("Clicked Logout Button Successfully");
    }
    public String logoutTitle(){
        return getElementText(logoutTitle);

    }


    //LinkedIn Button
    public void clickOnLinkdInAccount() {
        click(linkdInLink);
        LOG.info("Clicked LinkedIn link Successfully");
    }
        public String checkLinkedInPageTitle() {
            return getElementText(linkedInPageTitle);
            //LOG.info("Checked LinkedIn Header Successfully");
        }


    //Course button
    public void clickCourseButton(){
        click(coursesbtn);
        LOG.info("Selected Courses Successfully");
    }
    public void clickMentorshipBtn() {
        click(mentorbtn);
        LOG.info("Mentorship Button Clicked successfully");
    }

    public void clickOnBlogButton() {
        click(blogbutton);
        LOG.info("Clicked Blog Button Successfully");
    }

    public void clickJobSupportBttn() {
        click(jobSupportbtn);
        LOG.info("Clicked On Job Support Button Successfully");
    }
        public String jobSupportPageTitleCheck(){
            return getElementText(jobSupportPageTitle);
            //LOG.info("Checked Job Support Page Title Successfully");

        }

        // Contact Us
    public void clickContactUS(){
        click(contactUsbtn);
        LOG.info("Clicked on Contact Us Successfully");

    }
    public String contactUsPageTitleCheck(){
        return getElementText(contactUsPageTitle);
        //LOG.info("Checked ContactUs Page Header Successfully");
    }
    public void typeUserName(String input){
        type(name, input);
        LOG.info("Typed Name Successfully");

    }
    public void typePhoneNo(String input){
        type(mobileNo, input);
        LOG.info("Typed Phone No. Successfully");

    }
    public void typeCountry (String input){
        type(country, input);
        LOG.info("Typed Country Successfully");

    }
    public void typeEmail(String input) {
        type(email, input);
        LOG.info("Typed Email Successfully");

    }

    public void selectOnlineCourses(String input){
        selectFromDropdown(subject, input);
        LOG.info("Selected Course Successfully");

    }
    public void typeMessage (String input){
        type (message, input);
        LOG.info("Typed Message Successfully");

    }

    //Currency Conversion
    public void CurrencyConverter(){
        click(currency);
        LOG.info("Converted Currency Successfully");

    }

    //Learning Path
    public void LearningPathBtn(){
        click(learningpath);
        LOG.info("Clicked on Learning Path Successfully");

    }

    //Practice
    public void practiceBtn(){
        click(practice);
        LOG.info("Clicked on Practice Successfully");

    }
    public String checkPracticePageTitle(){
        return getElementText(practicePageTitle);
        //LOG.info("Checked PracticePage Title Successfully");
    }
    public void practiceName(String input){
        type(yourname,input);
        LOG.info("Typed Name Successfully");

    }
    public void practiceEmail(String input){
        type(youremail,input);
        LOG.info("Typed Email Successfully");

    }

    public void moreBtn(){
        click (moreBtn);
        LOG.info("Clicked More Button Successfully");

    }

    //Part-time Job
    public void partTimeJobBtn(){
        click(partTImeJobBtn);
        LOG.info("Selected Part-Time Job Successfully");

    }
    public void partTimechooseJob(String input){
        selectFromDropdown(selectjob,input);
        LOG.info("Selected Job Successfully");

    }
    public void partTimeJobFormQA(){
        click(QAJobForm);
        LOG.info("Selected QA Job Form Successfully");

    }

    //Edit Profile
    public void clickProfile(){
        click(profileDropdown);
        LOG.info("Clicked on Profile Dropdown Successfully");
    }
    public void clickEditProfile(){
        click(editProfile);
        LOG.info("Clicked Edit Profile Successfully");
    }
    public String checkProfileTitle(){
        return getElementText (editProfilePageTitle);
        //LOG.info("Checked Profile Page Title Successfully");
    }
    public void switchToggle(){
        click(emailNotificationToggle);
        LOG.info("Enabled Toggle Switch Successfully");
    }

    // Update Address

    public void clickManageSubscription(){
        click(selectManageSubscription);
        LOG.info("Picked Currency Successfully");
    }

    public void clickAddress(){
        click(selectAddress);
        LOG.info("Selected Address Successfully");
    }

    public void addressCountry(String input){
        selectFromDropdown(addressCountry, input);
        LOG.info("Selected Country Successfully");

    }
    public void addressStreet(String input){
        type(addressStreet, input);
        LOG.info("Typed Street Address Successfully");

    }
    public void addressCity(String input){
        type(addressCity, input);
        LOG.info("Typed City Successfully");

    }
    public void addressState(String input){
        selectFromDropdown(addreessState, input);
        LOG.info("Selected State Successfully");
    }
    public void AddressZipcode(String input){
        type(addressZipcode, input);
        LOG.info("Typed Zip-Code Successfully");
    }

    public String getUpdateAddressPageTitle(){
        return getElementText(billingAddressTitle);
        //LOG.info("Checked Update Address Page Title Successfully");
    }


    //Refer a Friend
    public void referFriend(){
        click(referfriendBtn);
        LOG.info("Selected Refer a Friend Successfully");


    }
    public void referFriendUrl(){
        click(referfriendUrl);
        LOG.info("Copied Refer-Email Successfully");

    }
}

