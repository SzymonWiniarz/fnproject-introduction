package com.simcode.fnproject.calculatorapp.calculator;

public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public double divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Nie dziel przez zero ty stara cholero!");
    }

    return (double) a / b;
  }

}