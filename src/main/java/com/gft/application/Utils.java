package com.gft.application;

public class Utils {

  public static int stringToInt(String string){
    int response = 0;
    try{
      response = Integer.parseInt(string.trim());
    }catch (NumberFormatException nfe){
      return response;
    }
    return response;
  }

}
