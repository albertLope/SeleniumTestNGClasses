package Locators;

public class LocatorsXpath {

    /*
     *    Absolute xpath vs relative xpath (single slash vs double slash)
     *
     *      NOTE : LOCATOR SHOULD BE SHORT.
     *
     *          URL: https://www.etsy.com/
     *
     *       absolute xpath sample --> //*[@id="content"]/div[6]/div/div/div/ul/li[4]/a/div[2]/div/span/span[2]
     *
     *       relative xpath sample --> //span[text()='24.99']
     *
     *
     *       difference between absolute vs relative xpath (single slash xpath vs double slash xpath)
     *
     *      absolute xpath is finding the absolute location of the element it is usually long and easy to break
     *
     *      Relative xpath is finding from the text or any attribute of the element
     *
     *
     *   relative xpath type
     *
     *       basic xpath - what is xpath
     *              // tagName [ @ attributeName = ' attributeValue ']
     *              //button[@value='Search']
     *
     *       text
     *          // tagName [ text ()= ' elementText ']
     *          //span[text()='Gifts']
     *
     *       contains
     *          // tagName [contains(text(),' elementText ')]
     *          // tagName [contains(@attributeName,' attributeValue ')]
     *            //span[contains(text(),'Craft')]
     *            //input[contains(@data-id,'search')]
     *
     *     URL:  https://demoqa.com/
     *
     *       parent to child
     *              // tagName [text ()= ' elementText '] // childTag
     *              //ul[@id='menu-top']//li
     *              //ul[@id='menu-top']//li[@class='menu-item']
     *       child to parent
     *              // tagName [text ()= ' elementText '] /parent :: parentTag
     *              //a[text()='Home']/parent::li/parent::ul
     *
     *       following-sibling
     *              // tagName [text ()= ' elementText '] / following-sibling :: parentTag
     *              //a[text()='Sortable']/parent::li/following-sibling::li
     *
     *      // xpath is able to find all the siblings but css is finding just next sibling
     *
     *       preceding-sibling
     *             // tagName [text ()= ' elementText '] / preceding-sibling :: parentTag
     *              //a[text()='Resizable']/parent::li/preceding-sibling::li
     *
     * */
}
