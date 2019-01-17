package com.gft;

import com.gft.application.Menu;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MenuTests {

  @Test
  public void menuBuilderTest(){
    Assert.assertEquals(Menu.menuBuilder(new String[] {}), "Invalid Order");
    Assert.assertEquals(Menu.menuBuilder(new String[] {,}), "Invalid Order");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"teste"}), "Invalid Time");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"morning"}), "Your order doesn't have dishes");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"night"}), "Your order doesn't have dishes");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"morning","1","2","3"}), "eggs, toast, coffee");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"morning","2","1","3"}), "eggs, toast, coffee");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"morning","1","2","3","4"}), "eggs, toast, coffee, error");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"morning","1","2","3","3","3"}), "eggs, toast, coffee(x3)");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"night","1","2","3","4"}), "steak, potato, wine, cake");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"night","1","2","2","4"}), "steak, potato(x2), cake");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"night","1","2","3","5"}), "steak, potato, wine, error");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"night","1","1","2","3","5"}), "steak, error");
    Assert.assertEquals(Menu.menuBuilder(new String[] {"night","1","2","e","3","5"}), "Your order have a invalid dish");
  }

  @Test
  public void orderValidationTest(){
    Assert.assertEquals(Menu.orderValidation(new String[] {}), "Invalid Order");
    Assert.assertEquals(Menu.orderValidation(new String[] {,}), "Invalid Order");
    Assert.assertEquals(Menu.orderValidation(new String[] {"teste"}), "Invalid Time");
    Assert.assertEquals(Menu.orderValidation(new String[] {"morning"}), "Your order doesn't have dishes");
    Assert.assertEquals(Menu.orderValidation(new String[] {"night"}), "Your order doesn't have dishes");
    Assert.assertEquals(Menu.orderValidation(new String[] {"morning","1","2","3"}), "");
    Assert.assertEquals(Menu.orderValidation(new String[] {"morning","2","1","3"}), "");
    Assert.assertEquals(Menu.orderValidation(new String[] {"morning","1","2","3","4"}), "");
    Assert.assertEquals(Menu.orderValidation(new String[] {"morning","1","2","3","3","3"}), "");
    Assert.assertEquals(Menu.orderValidation(new String[] {"night","1","2","3","4"}), "");
    Assert.assertEquals(Menu.orderValidation(new String[] {"night","1","2","2","4"}), "");
    Assert.assertEquals(Menu.orderValidation(new String[] {"night","1","2","3","5"}), "");
    Assert.assertEquals(Menu.orderValidation(new String[] {"night","1","1","2","3","5"}), "");
    Assert.assertEquals(Menu.orderValidation(new String[] {"night","1","2","e","3","5"}), "");
  }

}
