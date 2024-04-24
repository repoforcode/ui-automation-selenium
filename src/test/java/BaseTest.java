import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void initDriver(){
        Driver.initDriver();

    }

    @AfterMethod
    public void tearDownDriver(){
        Driver.tearDown();
    }




}
