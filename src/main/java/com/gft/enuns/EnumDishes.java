package com.gft.enuns;

public enum EnumDishes {

  ENTREE(1, "eggs", "steak"),
  SIDE(2, "toast", "potato"),
  DRINK(3, "coffee", "wine"),
  DESSERT(4, "error", "cake"),
  UNKNOWN(5, "error", "error");

  private final int id;
  private final String morning;
  private final String night;

  EnumDishes(int id, String morning, String night){
    this.id = id;
    this.morning = morning;
    this.night = night;
  }

  public static String getById(int id, EnumTime time){
    for(EnumDishes e:values()){
      if(e.id == id){
        if(EnumTime.MORNING.equals(time)){
          return e.morning;
        }else{
          return e.night;
        }
      }
    }
    return UNKNOWN.getMorning();
  }

  public String getMorning() {
    return morning;
  }

}
