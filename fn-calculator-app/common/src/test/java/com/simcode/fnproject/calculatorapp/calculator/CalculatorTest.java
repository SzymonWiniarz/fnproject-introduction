package com.simcode.fnproject.calculatorapp.calculator;

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
}