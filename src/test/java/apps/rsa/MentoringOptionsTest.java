package apps.rsa;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rsa.Homepage;
import pages.rsa.MentoringPage;


public class MentoringOptionsTest extends CommonAPI {

    private final Logger LOG= LoggerFactory.getLogger(MentoringOptionsTest.class);

    @Test
    public void accessMentorship(){
        Homepage homepage = new Homepage(getDriver());
        homepage.clickMentorshipBtn();
    }
    @Test
    public void accessBronzeMentorship(){
        Homepage homepage = new Homepage(getDriver());
        MentoringPage mentoringPage = new MentoringPage(getDriver());
        homepage.clickMentorshipBtn();
        mentoringPage.clickBronzeMentor();
        mentoringPage.typeName("Marshall Law");
        mentoringPage.typeEmail("Marshalllaw@example.com");
        mentoringPage.typePhone("2021113131");
        mentoringPage.serviceType();
        mentoringPage.typeBio("This is just an example message used with Selenium.");
        String expectedtitle= "REQUEST FOR MENTORSHIP";
        Assert.assertEquals(expectedtitle,mentoringPage.mentorshipFormTitle());


    }

    @Test
    public void accessPlatinumMentorship(){
        Homepage homepage = new Homepage(getDriver());
        MentoringPage mentoringPage = new MentoringPage(getDriver());
        homepage.clickMentorshipBtn();
        mentoringPage.clickPlatinumMentor();
        String expectedtitle= "Proper Guidance at right time of your Career can bring the Biggest Change in your Life";
        Assert.assertEquals(expectedtitle,mentoringPage.platinumMentorPageTitle());
        mentoringPage.enrollPlatinum();
        mentoringPage.typeEmailP("Marshalllaw@example.com");
        mentoringPage.typeNameP("Marshall Law");
    }
}
