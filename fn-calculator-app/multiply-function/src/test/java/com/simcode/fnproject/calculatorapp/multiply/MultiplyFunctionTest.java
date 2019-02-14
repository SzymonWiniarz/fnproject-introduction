package com.simcode.fnproject.calculatorapp.multiply;

import com.fnproject.fn.testing.FnResult;
import com.fnproject.fn.testing.FnTestingRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyFunctionTest {

  @Rule
  public final FnTestingRule testing = FnTestingRule.createDefault();

  @Test
  public void shouldReturnProperResultWhenMultiply() {
    testing.givenEvent().withBody("{\"a\":3,\"b\":13}").enqueue();
    testing.thenRun(MultiplyFunction.class, "handleRequest");

    FnResult result = testing.getOnlyResult();
    assertEquals("{\"result\":39.0}", result.getBodyAsString());
  }

}