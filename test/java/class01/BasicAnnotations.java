package class01;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasicAnnotations {

    @Test

    public void cfirstTest(){
        System.out.println("This is my first testcase");
    }

    @Test
    public void asecondTest(){
        System.out.println("This is my second test case ");
    }

    @Test
    public void bthirdTest(){
        System.out.println("This is my third test case");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("I am a precondition");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println( "I am a post condition");
    }

}
