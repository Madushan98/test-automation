package testing.annotation;

import org.testng.annotations.Test;

public class SampleTest {
    public static void main(String[] args) {
        System.out.println("Hello !");

    }

    public  void test(){
        System.out.println("Test");
    }

    @Test
    public void test1(){
        System.out.println("Test1");
    }

}
