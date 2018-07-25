package com.mt.test.guava;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

/**
 * Created by antiecheng on 2018/7/24.
 */
public class Guava_01 {

  public static void main(String[] args) {
    String str1="aa";
    String str2="bb";
    System.out.println(Objects.hashCode(str1,str2));
  }
}
