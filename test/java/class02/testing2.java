package class02;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing2 {
    @BeforeSuite
    public  void beforesuit(){
        System.out.println("i am another before suit method");
    }
    @BeforeTest
    public  void beforetest2(){
        System.out.println("i am before test in another class");
    }
    @Test
    public void Testb(){
        System.out.println("drive me nuts , drive me crazy");
    }
    @Test
    public void Testa(){
        System.out.println("drive me to Jingle Bells , drive me to Happy");
    }
}
