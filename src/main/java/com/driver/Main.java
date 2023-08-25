package com.driver;

public class Main {

  public static class Product {
      int res;
      double dbRes;
      public int product(int x, int y) {
           res = x*y;
          return res;
      }
      public int product(int x, int y, int z) {
          res = x*y*z;
          return res;
      }
      public double product(double x, double y) {
          dbRes = x*y;
          return dbRes;
      }
  }
  public static void main(String args[]) {
      Product p = new Product();
      System.out.println(p.product(1,2));
      System.out.println(p.product(1,2,3));
      System.out.println(p.product(1.50,2.80));
  }
}