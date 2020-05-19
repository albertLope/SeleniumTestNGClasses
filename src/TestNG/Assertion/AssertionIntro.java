package TestNG.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionIntro {

    /*
        AssertTrue - AssertFalse
        AssertEquals

        Hard assert when it fail it stop executing code.

     */

    String url = "https://www.etsy.com/cart/?show_cart=3055651443&ref=listing_page";

    @Test
    public void assertTrue(){
//                          expected true
        Assert.assertTrue(url.contains("cart") , "Expected carta but not found and URL is -->" + url);

        System.out.println("url contains cart");

    }

    @Test
    public void assertFalse(){

        Assert.assertFalse(url.contains("carta"));

        System.out.println("url not contains carta");

    }

    @Test
    public void assertEquals(){

        Assert.assertEquals(url , "https://www.etsy.com/cart/?show_cart=3055651443&ref=listing_page");

        System.out.println("url is correct");

    }
}
