package Locators;

public class LocatorCSS {


    public static void main(String[] args) {
  /*
     * Css Selectors
     *
     *  attributes   -->  tagName [ attributeName = ' attributeValue ' ]     -->>  option[value='apple']   ,  input[onclick='displayConfirm()']
     *
     *  next sibling  ---> tagName [ attributeName = ' attributeValue'] + tagNameOfTheSibling
     *              option[value='benz']+option
     *
     * NOTE : IN CSS SELECTOR I AM ABLE TO FIND JUST NEXT SIBLING BUT IN THE XPATH WE CAN FIND ALL THE SIBLINGS
     *
     *  parent to child -->  tagName [ attributeName = ' attributeValue'] >  tagNameOfTheChild
     *          select[id='carselect']>option    ,   div[id='radio-btn-example']>fieldset>label
     *
     *  n-child     --> specific child for us  -->   tagName [ attributeName = ' attributeValue'] >  tagNameOfTheChild : nth-child(2)
     *                  select[id='multiple-select-example']>option:nth-child(3)
     *
     *
     *  n-last-child     --> finding the child starting from the last one --> tagName [ attributeName = ' attributeValue'] >  tagNameOfTheChild : nth-last-child
     *                      select[id='multiple-select-example']>option:nth-last-child(3)
     *
     *  last-child           --> finding the last child -->   tagName [ attributeName = ' attributeValue ' ] > tagNameOfTheChild : last-child
     *                          select[id='multiple-select-example']>option:last-child    select[id='carselect']>option:last-child
     *
     * url -->>     https://learn.letskodeit.com/p/practice
     *
     *
     *
     */

    }
}
