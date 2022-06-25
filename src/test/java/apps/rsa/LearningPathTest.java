package apps.rsa;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.rsa.Homepage;
import pages.rsa.LearningPathPage;


public class LearningPathTest extends CommonAPI {

    @Test
    public void filterByJavaScript(){
        Homepage homepage=new Homepage(getDriver());
       LearningPathPage learningpath = new LearningPathPage(getDriver());
       homepage.LearningPathBtn();
       learningpath.selectJavaScript();
    }

    @Test
    public void filterByPython(){
        Homepage homepage=new Homepage(getDriver());
        LearningPathPage learningpath = new LearningPathPage(getDriver());
        homepage.LearningPathBtn();
        learningpath.selectPython();
    }

    @Test
    public void filterByJava(){
        Homepage homepage=new Homepage(getDriver());
        LearningPathPage learningpath = new LearningPathPage(getDriver());
        homepage.LearningPathBtn();
        learningpath.selectJava();
    }


}
