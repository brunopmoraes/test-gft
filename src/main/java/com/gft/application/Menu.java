package com.gft.application;

import com.gft.domains.Order;
import com.gft.enuns.EnumDishes;
import com.gft.enuns.EnumTime;
import java.util.Map;
import java.util.TreeMap;

public class Menu {

  public static String menuBuilder(String[] arrOrder) {
    String validation = orderValidation(arrOrder);
    if(validation.length() == 0) {
      Order order = new Order(EnumTime.getByValue(arrOrder[0]));
      for (int i = 1; i < arrOrder.length; i++) {
        int idDish = Utils.stringToInt(arrOrder[i]);
        if(idDish == 0) return "Your order have a invalid dish";
        addDish(order, idDish);
      }
      return printMenu(order);
    }
    return validation;
  }

  public static String orderValidation(String[] order){
    if(order.length == 0 ) return "Invalid Order";
    if(order.length >= 1) {
      if (order[0].isEmpty())
        return "Invalid Order";
      else if (!(order[0].equalsIgnoreCase(EnumTime.MORNING.getValue()) || order[0].equalsIgnoreCase(EnumTime.NIGHT.getValue())))
        return "Invalid Time";
      else if (order.length == 1)
        return "Your order doesn't have dishes";
    }
    return "";
  }

  private static void addDish(Order order, int idDish){
    int qty = 0;
    if(order.getDishes().containsKey(idDish)){
      qty = order.getDishes().get(idDish);
    }
    order.getDishes().put(idDish, ++qty);
  }

  private static String printMenu(Order order){
    String menu = "";
    Map<Integer, Integer> dishes = new TreeMap<>(order.getDishes());
    for (Integer id : dishes.keySet()) {
      if(menu.length() > 0) menu += ", ";
      menu += EnumDishes.getById(id, order.getTime());
      int qty = dishes.get(id);
      if(qty > 1)
        if(order.getTime().getMultipleDish() == id) {
          menu += "(x" + qty + ")";
        }else {
          menu += ", error";
          break;
        }
    }
    return menu;
  }

}
