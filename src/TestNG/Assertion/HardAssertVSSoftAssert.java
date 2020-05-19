package TestNG.Assertion;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertVSSoftAssert {

   /*
     HardAssert vs SoftAssert

           Hard assert when it fail it stop executing code.

           Soft assert when it fail it is continue executing code.
     */

   @Test
    public void softAssert(){

       System.out.println("Navigete to etsy");

       SoftAssert softA = new SoftAssert();

       softA.assertEquals(true,false);

       System.out.println("Navigate to Clothing");

       softA.assertEquals(true, false);

       System.out.println("navigate to Home");

       softA.assertEquals(true, false);

       softA.assertAll();

   }

   @Test
    public void hardAssert(){
       System.out.println("Navigete to etsy");

       Assert.assertEquals(true,false);

       System.out.println("Navigate to Clothing");

       Assert.assertEquals(true, false);

       System.out.println("navigate to Home");

       Assert.assertEquals(true, false);


   }

}