package apps.rsa;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rsa.Homepage;
import pages.rsa.JobSupportPage;


public class HomepageButtonsTest extends CommonAPI {

   @Test
    public void loginAccount(){
        Homepage homepage =new Homepage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("Marshalllaw@example.com");
        homepage.typeUserPassword("abc123");
        homepage.clickSignInBtn();
        String expectedTitle= "Marshall Law";
        Assert.assertEquals(expectedTitle,homepage.checkUserName());
    }

    @Test
    public void resendEmail(){
        Homepage homepage = new Homepage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("Marshalllaw@example.com");
        homepage.typeUserPassword("abc123");
        homepage.clickSignInBtn();
        homepage.clickResendEmailBtn();
        String expectedTitle= "You are doing this too fast. Please wait and try again in a few minutes";
        Assert.assertEquals(expectedTitle,homepage.checkNotificationMessage());
    }

  @Test
    public void invalidLogin(){
        Homepage homepage =new Homepage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("jonDoe@example.com");
        homepage.typeUserPassword("111111");
        homepage.clickSignInBtn();
        String expectedTitle= "Your email or password is incorrect.";
        Assert.assertEquals(expectedTitle,homepage.checkInvalidLogin());

    }

   @Test
    public void logOutAccount(){
        Homepage homepage =new Homepage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("Marshalllaw@example.com");
        homepage.typeUserPassword("abc123");
        homepage.clickSignInBtn();
        homepage.clickProfile();
        homepage.clickLogOut();
        String expectedTitle= "Home | Rahul Shetty Academy";
        Assert.assertEquals(expectedTitle,homepage.logoutTitle());
    }


   @Test
    public void accessLinkdInAccount(){
    Homepage homepage= new Homepage(getDriver());
    homepage.clickOnLinkdInAccount();
        String expectedTitle= "(4) Rahul Shetty | LinkedIn";
        Assert.assertEquals(expectedTitle,homepage.checkLinkedInPageTitle());
    }

   @Test
    public void jobSupportRequest(){
        Homepage homepage = new Homepage(getDriver());
        JobSupportPage jobSupportPage = new JobSupportPage(getDriver());
        homepage.clickJobSupportBttn();

        jobSupportPage.typeUserName("Marshall Law");
        jobSupportPage.typePhoneNo(" 222-222-2222");
        jobSupportPage.typeEmail("Marshalllaw@example.com");
        jobSupportPage.typeRequirements("This is just a sample text using Selenium");
        jobSupportPage.selectProgramingLanguage("Java");
        jobSupportPage.shareIssue();
        jobSupportPage. selectTimeZone("(GMT-05:00) Eastern Time (US & Canada)");
        jobSupportPage.chooseAfford();
       String expectedTitle = "Are you struggling with solving specific automation use case or need help with kick starting automation for your project, we got the people and expertise to help you reach an important milestone of test automation following all the benchmarks and processes involved in a modern software development life-cycle.  Choose from one of our consulting packages below and have peace of mind at your work.";
       Assert.assertEquals(expectedTitle,homepage.jobSupportPageTitleCheck());
    }

   @Test
    public void contactUS(){
        Homepage homepage = new Homepage(getDriver());
        homepage.clickContactUS();
        homepage.typeUserName("Marshall Law");
        homepage.typePhoneNo("222-222-2222");
        homepage.typeCountry("USA");
        homepage.typeEmail("Marshallaw@example.com");
        homepage.selectOnlineCourses("Online Courses");
        homepage.typeMessage("This is just a sample Text Using Selenium");
        String expectedTitle= "CONTACT US";
        Assert.assertEquals(expectedTitle,homepage.contactUsPageTitleCheck());
    }

    @Test
    public void currencyConverter(){
        Homepage homepage= new Homepage(getDriver());
        homepage.CurrencyConverter();
    }

   @Test
    public void practice(){
        Homepage homepage=new Homepage(getDriver());
        homepage.practiceBtn();
        homepage.practiceName("Marshall Law");
        homepage.practiceEmail("marshalllaw@example.com");
        String expectedTitle= "Join now to Practice";
        Assert.assertEquals(expectedTitle,homepage.checkPracticePageTitle());
    }

   @Test
    public void partTimeJobQA(){
        Homepage homepage= new Homepage((getDriver()));
        homepage.moreBtn();
        homepage.partTimeJobBtn();
        homepage.partTimechooseJob("QA Automation Articles (Java/Python/JavaScript)");
        homepage.partTimeJobFormQA();
    }

    @Test
    public void editProfile(){
        Homepage homepage =new Homepage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("Marshalllaw@example.com");
        homepage.typeUserPassword("abc123");
        homepage.clickSignInBtn();
        homepage.clickProfile();
        homepage.clickEditProfile();
        homepage.switchToggle();
        String expectedTitle= "Profile";
        Assert.assertEquals(expectedTitle,homepage.checkProfileTitle());
    }

    @Test
    public void UpdateAdress(){
        Homepage homepage= new Homepage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("Marshalllaw@example.com");
        homepage.typeUserPassword("abc123");
        homepage.clickSignInBtn();
        homepage.clickProfile();
        homepage.clickManageSubscription();
        homepage.clickAddress();
        homepage.addressCountry("United States of America");
        homepage.addressStreet(" 3110 37th ave");
        homepage.addressCity("Queens");
        homepage.addressState("New York");
        homepage.AddressZipcode("11107");
        String expectedTitle= "Billing Address";
        Assert.assertEquals(expectedTitle,homepage.getUpdateAddressPageTitle());

    }

    @Test
    public void resetPassword(){
        Homepage homepage = new Homepage(getDriver());
        homepage.clickLoginButton();
        homepage.resetPassword();
        homepage.resetPasswordEmail("marshalllaw@example.com");
        homepage.sendEmail();
        String expectedTitle= "Reset Password";
        Assert.assertEquals(expectedTitle,homepage.checkResetPasswordPageTitle());


    }


    @Test
    public void referFriend(){
        Homepage homepage =new Homepage(getDriver());
        homepage.clickLoginButton();
        homepage.typeUserEmail("Marshalllaw@example.com");
        homepage.typeUserPassword("abc123");
        homepage.clickSignInBtn();
        homepage.clickProfile();
        homepage.referFriend();
        homepage.referFriendUrl();
    }
}
