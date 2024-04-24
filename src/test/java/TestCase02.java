import manager.DriverThreads;
import org.testng.annotations.Test;

public class TestCase02 extends BaseTest{

    @Test
    public void Test04(){

        System.out.println("this is Test01");
        String url = DriverThreads.getDriver().getCurrentUrl();
        System.out.println(url);

    }

    @Test
    public void Test05(){
        System.out.println("this is Test02");
        String url = DriverThreads.getDriver().getCurrentUrl();
        System.out.println(url);
    }

    @Test
    public void Test06(){
        System.out.println("this is Test03");
        String url = DriverThreads.getDriver().getCurrentUrl();
        System.out.println(url);
    }
}

