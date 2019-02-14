package com.simcode.fnproject.calculatorapp.add;

import com.fnproject.fn.testing.FnResult;
import com.fnproject.fn.testing.FnTestingRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddFunctionTest {

  @Rule
  public final FnTestingRule testing = FnTestingRule.createDefault();

  @Test
  public void shouldReturnProperResultWhenAdd() {
    testing.givenEvent().withBody("{\"a\":10,\"b\":15}").enqueue();
    testing.thenRun(AddFunction.class, "handleRequest");

    FnResult result = testing.getOnlyResult();
    assertEquals("{\"result\":25.0}", result.getBodyAsString());
  }

}