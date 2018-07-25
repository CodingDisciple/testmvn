package com.mt.test.guava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import org.joda.time.DateTime;

/**
 * Created by cd on 2018/7/25.
 */
public class JodaTimeTest {

  private void java8Time(){
    LocalDate date = LocalDate.now();
    DayOfWeek week = date.getDayOfWeek();
    System.out.println(week);
  }

  public static void main(String[] args) {
      DateTime time = new DateTime();
      System.out.println(time.toString());
      JodaTimeTest test = new JodaTimeTest();
      test.java8Time();
   }
}
