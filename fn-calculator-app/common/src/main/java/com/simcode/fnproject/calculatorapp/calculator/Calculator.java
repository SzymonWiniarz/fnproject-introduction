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

  public int getNthFibonacciNumber(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    return getNthFibonacciNumber(n - 2) + getNthFibonacciNumber(n - 1);
  }

}
