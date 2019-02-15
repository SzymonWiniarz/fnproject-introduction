package com.simcode.fnproject.springcalculatorapp.controllers;

import com.simcode.fnproject.springcalculatorapp.calculator.Calculator;
import com.simcode.fnproject.springcalculatorapp.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

  private final Calculator calculator;

  @Autowired
  public CalculatorController(Calculator calculator) {
    this.calculator = calculator;
  }

  @GetMapping("add")
  public Response add(int a, int b) {
    int result = calculator.add(a, b);

    return new Response(result);
  }

  @GetMapping("subtract")
  public Response subtract(int a, int b) {
    int result = calculator.subtract(a, b);

    return new Response(result);
  }

  @GetMapping("multiply")
  public Response multiply(int a, int b) {
    int result = calculator.multiply(a, b);

    return new Response(result);
  }

  @GetMapping("divide")
  public Response divide(int a, int b) {
    double result = calculator.divide(a, b);

    return new Response(result);
  }

  @GetMapping("fibonacci")
  public Response fibonacci(int n) {
    long result = calculator.getNthFibonacciNumber(n);

    return new Response(result);
  }

}
