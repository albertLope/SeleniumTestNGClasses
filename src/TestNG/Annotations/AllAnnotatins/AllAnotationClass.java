package TestNG.Annotations.AllAnnotatins;

import org.testng.annotations.*;

public class AllAnotationClass {

       /*

        ANNOTATIONS
            BeforeSuite --> Running the code once before all the <test> run in the suite
                BeforeTest --> Running the code once before the each <test> run in the xml
                    Before class --> Running the code once before the class @Test s run
                        Before method --> Running  the code before each @Test
                               @Test
                        After method -->  Running  the code after each @Test
                     After class --> Running the code once After the class @Test s run
               After Test --> Running the code once after the each <test> run in the xml
           After suite --> Running the code once after all the <test> run in the suite

     */


       @BeforeSuite
        public void beforeSuite(){

           System.out.println("Before suite All annotation class");

       }

       @BeforeTest
        public void BeforeTest(){

        System.out.println("Before test All annotation class");

        }

    @BeforeClass
    public void BeforeClass(){

        System.out.println("Before class All annotation class");

    }

    @BeforeMethod
    public void BeforeMethod(){

        System.out.println("Before method All annotation class");

    }

    @Test
    public void test1(){

        System.out.println("Test 1 in All annotation class");
    }

    @Test
    public void test2(){

        System.out.println("Test 2 in All annotation class");
    }

    @AfterMethod
    public void AfterMethod(){

        System.out.println("After method All annotation class");

    }

    @AfterClass
    public void AfterClass(){

        System.out.println("After class All annotation class");

    }

    @AfterTest
    public void AfterTest(){

        System.out.println("After Test All annotation class");

    }

    @AfterSuite
    public void AfterSuite(){

        System.out.println("After suite All annotation class");

    }
}
