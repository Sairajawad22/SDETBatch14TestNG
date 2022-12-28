package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNgAnnotations {
    // first test case
    @Test
    public void AfirstTestCase(){
        System.out.println("I am the first case");
    }
    @Test
    public void BSecondTestCase(){
        System.out.println("I am the second case");
    }
    @Test
    public void ThirthTestCase(){
        System.out.println("I am the third case");
}
    @Test
    public void FourthTestCase(){
        System.out.println("I am the fourth case");
    }
@BeforeMethod
    public void beforeMethod(){
    System.out.println("I am a before method");
}
@AfterMethod
    public void afterMethod(){
    System.out.println("I am a after method");
}
}
