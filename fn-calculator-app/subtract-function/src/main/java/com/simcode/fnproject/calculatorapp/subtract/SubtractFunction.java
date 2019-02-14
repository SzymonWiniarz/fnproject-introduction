package com.simcode.fnproject.calculatorapp.subtract;

import com.simcode.fnproject.calculatorapp.calculator.Calculator;
import com.simcode.fnproject.calculatorapp.dto.Request;
import com.simcode.fnproject.calculatorapp.dto.Response;

public class SubtractFunction {

  private final Calculator calculator = new Calculator();

  public Response handleRequest(Request input) {
    int result = calculator.subtract(input.getA(), input.getB());

    return new Response(result);
  }

}