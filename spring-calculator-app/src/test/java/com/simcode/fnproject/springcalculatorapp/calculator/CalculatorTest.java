package com.simcode.fnproject.springcalculatorapp.calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {

  private Calculator calculator;

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Before
  public void setUp() {
    calculator = new Calculator();
  }

  @Test
  public void shouldProperlyAddTwoNumbers() {
    assertEquals(16, calculator.add(12, 4));
  }

  @Test
  public void shouldProperlySubtractTwoNumbers() {
    assertEquals(1, calculator.subtract(29, 28));
  }

  @Test
  public void shouldProperlyMultiplyTwoNumbers() {
    assertEquals(72, calculator.multiply(8, 9));
  }

  @Test
  public void shouldProperlyDivideTwoNumbers() {
    assertEquals(3, calculator.divide(36, 12), 0.1);
  }

  @Test
  public void shouldThrowExceptionWhenDivideBy0() {
    expectedException.expect(IllegalArgumentException.class);

    calculator.divide(22, 0);
  }

  @Test
  public void shouldReturn0WhenGetFibonacciFor0() {
    assertEquals(0, calculator.getNthFibonacciNumber(0));
  }

  @Test
  public void shouldReturn1WhenGetFibonacciFor1() {
    assertEquals(1, calculator.getNthFibonacciNumber(1));
  }

  @Test
  public void shouldReturnProperResultWhenGetFibonacciForNumberGreaterThan1() {
    assertEquals(13, calculator.getNthFibonacciNumber(7));
  }

}