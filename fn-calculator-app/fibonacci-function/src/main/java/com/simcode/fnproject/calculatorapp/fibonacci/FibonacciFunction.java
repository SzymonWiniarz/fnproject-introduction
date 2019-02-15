package com.simcode.fnproject.calculatorapp.fibonacci;

import com.simcode.fnproject.calculatorapp.calculator.Calculator;
import com.simcode.fnproject.calculatorapp.dto.Response;

public class FibonacciFunction {

  private final Calculator calculator = new Calculator();

  public Response handleRequest(int n) throws InterruptedException {
    int result = calculator.getNthFibonacciNumber(n);

    return new Response(result);
  }

}
