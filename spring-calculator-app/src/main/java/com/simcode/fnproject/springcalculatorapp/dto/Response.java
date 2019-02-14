package com.simcode.fnproject.springcalculatorapp.dto;

public class Response {

  private double result;

  public Response(double result) {
    this.result = result;
  }

  public double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }
}
