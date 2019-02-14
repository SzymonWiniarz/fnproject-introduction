package com.simcode.fnproject.calculatorapp.add;

import com.simcode.fnproject.calculatorapp.calculator.Calculator;
import com.simcode.fnproject.calculatorapp.dto.Request;
import com.simcode.fnproject.calculatorapp.dto.Response;

public class AddFunction {

  private final Calculator calculator = new Calculator();

  public Response handleRequest(Request request) {
    int result = calculator.add(request.getA(), request.getB());

    return new Response(result);
  }

}