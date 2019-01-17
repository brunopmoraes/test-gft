package com.gft.enuns;

public enum EnumTime {

  MORNING(1, "morning", 3),
  NIGHT(2, "night", 2),
  UNKNOWN(0, null, 0);

  private final int id;
  private final String value;
  private final int multipleDish;

  EnumTime(int id, String value, int multipleDish) {
    this.id = id;
    this.value = value;
    this.multipleDish = multipleDish;
  }

  public static EnumTime getByValue(String value){
    for(EnumTime e : values()){
      if(e.value.equalsIgnoreCase(value)) return e;
    }
    return UNKNOWN;
  }

  public String getValue() {
    return value;
  }

  public int getMultipleDish() {
    return multipleDish;
  }
}
