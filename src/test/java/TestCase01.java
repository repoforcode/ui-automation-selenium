import manager.DriverThreads;
import org.testng.annotations.Test;

public class TestCase01 extends BaseTest{

    @Test
    public void Test01(){

        System.out.println("this is Test01");
        String url = DriverThreads.getDriver().getCurrentUrl();
        System.out.println(url);

    }

    @Test
    public void Test02(){
        System.out.println("this is Test02");
        String url = DriverThreads.getDriver().getCurrentUrl();
        System.out.println(url);
    }

    @Test
    public void Test03(){
        System.out.println("this is Test03");
        String url = DriverThreads.getDriver().getCurrentUrl();
        System.out.println(url);
    }
}
