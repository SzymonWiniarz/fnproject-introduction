package com.simcode.fnproject.calculatorapp.subtract;

import com.fnproject.fn.testing.FnResult;
import com.fnproject.fn.testing.FnTestingRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractFunctionTest {

  @Rule
  public final FnTestingRule testing = FnTestingRule.createDefault();

  @Test
  public void shouldReturnProperResultWhenSubtract() {
    testing.givenEvent().withBody("{\"a\":12,\"b\":25}").enqueue();
    testing.thenRun(SubtractFunction.class, "handleRequest");

    FnResult result = testing.getOnlyResult();
    assertEquals("{\"result\":-13.0}", result.getBodyAsString());
  }

}