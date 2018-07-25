package com.mt.test.guava;

import java.util.function.Predicate;

/**
 * Created by cd on 2018/7/25.
 */
public class Jdk8Test {

  public static void main(String[] args) {
    Predicate<String> p = (String str) -> str.length()>1;
    String temp = "123456";
    System.out.println(p.test(temp));
  }
}
