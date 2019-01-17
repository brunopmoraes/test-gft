package com.gft.domains;

import com.gft.enuns.EnumTime;
import java.util.HashMap;

public class Order {

  private EnumTime time;
  private HashMap<Integer, Integer> dishes;

  public Order(EnumTime time) {
    this.time = time;
    this.dishes = new HashMap<>();
  }

  public EnumTime getTime() {
    return time;
  }

  public HashMap<Integer, Integer> getDishes() {
    return dishes;
  }
}
