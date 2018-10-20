import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMethods {
    @Test
    public void TC_01(){
        Assert.assertEquals(true,false);
    }

    @Test
    public void TC_02(){
        Assert.assertEquals(true,true);
    }
    @Test
    public void TC_03(){
        Assert.assertEquals(15,15);

    }
    @Test
    public void TC_04(){
        Assert.assertEquals(10,15);
    }
    @Test
    public void TC_05(){
        Assert.assertEquals(10,10);
    }
}
