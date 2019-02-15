package com.simcode.fnproject.calculatorapp.fibonacci;

import com.fnproject.fn.testing.FnResult;
import com.fnproject.fn.testing.FnTestingRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciFunctionTest {

  @Rule
  public final FnTestingRule testing = FnTestingRule.createDefault();

  @Test
  public void shouldReturnProperFibonacciNumber() {
    testing.givenEvent().withBody("7").enqueue();
    testing.thenRun(FibonacciFunction.class, "handleRequest");

    FnResult result = testing.getOnlyResult();
    assertEquals("{\"result\":13.0}", result.getBodyAsString());
  }

}