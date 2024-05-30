package TAF;

import TAF.base.TestBase;
import TAF.pages.MainPage;
import TAF.pages.ResultPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class TestSuite extends TestBase {


    MainPage mainPage;
    ResultPage resultPage;


    private static final Logger log = LoggerFactory.getLogger(TestSuite.class);
    @Test
    public void googleSearchTest(){

        log.info("running google search test");
        mainPage = new MainPage(driver);
        resultPage = mainPage.typeTermInSearchboxAndConfirm("Badin Soft");
        System.out.println(resultPage.getStatText());
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Typed term in searchbox and clicked confirm");
        Assertions.assertNotNull(resultPage.getStatText(), "No results");
    }
    @Test
    public void googleSearchTest2(){

        log.info("running google search test");
        mainPage = new MainPage(driver);
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resultPage = mainPage.typeTermInSearchboxAndConfirm("Badin Soft");
        System.out.println(resultPage.getStatText());
        Assertions.assertNotNull(resultPage.getStatText(), "No results");
    }
}
