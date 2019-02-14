package com.simcode.fnproject.calculatorapp.multiply;

import com.simcode.fnproject.calculatorapp.calculator.Calculator;
import com.simcode.fnproject.calculatorapp.dto.Request;
import com.simcode.fnproject.calculatorapp.dto.Response;

public class MultiplyFunction {

  private final Calculator calculator = new Calculator();

  public Response handleRequest(Request input) {
    int result = calculator.multiply(input.getA(), input.getB());

    return new Response(result);
  }

}