package com.simcode.fnproject.calculatorapp.divide;

import com.fnproject.fn.api.OutputEvent;
import com.fnproject.fn.testing.FnResult;
import com.fnproject.fn.testing.FnTestingRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideFunctionTest {

  @Rule
  public final FnTestingRule testing = FnTestingRule.createDefault();

  @Test
  public void shouldReturnProperResultWhenDivide() {
    testing.givenEvent().withBody("{\"a\":27,\"b\":3}").enqueue();
    testing.thenRun(DivideFunction.class, "handleRequest");

    FnResult result = testing.getOnlyResult();
    assertEquals("{\"result\":9.0}", result.getBodyAsString());
  }

  @Test
  public void shouldReturnErrorWhenDividingBy0() {
    testing.givenEvent().withBody("{\"a\":10,\"b\":0}").enqueue();
    testing.thenRun(DivideFunction.class, "handleRequest");

    FnResult result = testing.getOnlyResult();
    assertEquals(OutputEvent.Status.FunctionError, result.getStatus());
  }

}