package testing.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest2 {

    @BeforeMethod
    public void setUp(){
        System.out.println("Before Method");
    }

    @Test
    public void testName() {
        System.out.println("Test 1");
    }

    @AfterMethod
    public void  tearDown(){
        System.out.println("After Method");
    }
}
