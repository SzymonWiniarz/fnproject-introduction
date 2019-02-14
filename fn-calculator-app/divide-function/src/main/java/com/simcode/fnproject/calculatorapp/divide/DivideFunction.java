package com.simcode.fnproject.calculatorapp.divide;

import com.simcode.fnproject.calculatorapp.calculator.Calculator;
import com.simcode.fnproject.calculatorapp.dto.Request;
import com.simcode.fnproject.calculatorapp.dto.Response;

public class DivideFunction {

  private final Calculator calculator = new Calculator();

  public Response handleRequest(Request input) {
    double result = calculator.divide(input.getA(), input.getB());

    return new Response(result);
  }

}